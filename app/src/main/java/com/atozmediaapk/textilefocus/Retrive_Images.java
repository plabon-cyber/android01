package com.atozmediaapk.textilefocus;

import static com.atozmediaapk.textilefocus.ValuesClass.TOPIC;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.UUID;

public class Retrive_Images extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST = 1;
    private ImageView selectedImageView;
    private Uri imageUri;

    //text
    private EditText mSurname , mEmail;
    private Button button,button1;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Use");

    @Override @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive_images);
        selectedImageView = findViewById(R.id.selectedImageView);

        //text
        mSurname = findViewById(R.id.surname);
        mEmail = findViewById(R.id.email);
        button = findViewById(R.id.button);
        FirebaseMessaging.getInstance().subscribeToTopic(String.valueOf(TOPIC));



        Button selectImageButton = findViewById(R.id.selectImageButton);
        selectImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFileChooser();
            }
        });


        Button uploadButton = findViewById(R.id.uploadButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadImage();


            }
        });
    }

    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            selectedImageView.setImageURI(imageUri);
        }
    }

    private void uploadImage() {
        String surname = mSurname.getText().toString();
        String email = mEmail.getText().toString();

        if (!(surname.isEmpty() && email.isEmpty() && imageUri != null)) {

            StorageReference storageRef = FirebaseStorage.getInstance().getReference().child("images/" + UUID.randomUUID().toString());
            storageRef.putFile(imageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                            Task<Uri> downloadUrl= taskSnapshot.getStorage().getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                @Override
                                public void onComplete(@NonNull Task<Uri> task) {
                                    String t=task.getResult().toString();
                                    DatabaseReference newPost=root.push();

                                    newPost.child("FirstName").setValue(surname);
                                    newPost.child("LastName").setValue(email);
                                    newPost.child("image").setValue(task.getResult().toString());

                                }
                            });
                            Toast.makeText(Retrive_Images.this, "Data Saved", Toast.LENGTH_SHORT).show();
                            Toast.makeText(Retrive_Images.this, "Image uploaded successfully", Toast.LENGTH_SHORT).show();
                            // Navigate to the display activity and pass image URI
                            Intent intent = new Intent(Retrive_Images.this, DisplayImageActivity.class);
                            intent.putExtra("imageUri", imageUri.toString());
                            startActivity(intent);

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Retrive_Images.this, "Upload failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        } else {
            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
        }
    }
}