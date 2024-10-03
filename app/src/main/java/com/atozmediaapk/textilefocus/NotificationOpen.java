package com.atozmediaapk.textilefocus;


import static com.atozmediaapk.textilefocus.ValuesClass.TOPIC;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
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

import java.util.HashMap;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NotificationOpen extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST = 1;
    private ImageView selectedImageView;
    private Uri imageUri;


    private EditText  mSurname , mEmail,mSurname1 , mEmail1;
    private Button button,button1,selectImageButton;


    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Users");

    private FirebaseDatabase db1 = FirebaseDatabase.getInstance();
    private DatabaseReference root1 = db1.getReference().child("Users1");

    private FirebaseDatabase db2 = FirebaseDatabase.getInstance();
    private DatabaseReference root2 = db2.getReference().child("User");

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_open);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);




        selectedImageView = findViewById(R.id.selectedImageView);
        selectImageButton = findViewById(R.id.selectImageButton);

        mSurname = findViewById(R.id.surname);
        mEmail = findViewById(R.id.email);
        button = findViewById(R.id.button);

        mSurname1=findViewById(R.id.surname1);
        mEmail1=findViewById(R.id.email1);
        button1=findViewById(R.id.button1);

        FirebaseMessaging.getInstance().subscribeToTopic(String.valueOf(TOPIC));


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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String surname = mSurname.getText().toString();
                String email = mEmail.getText().toString();

                HashMap<String , String> userMap = new HashMap<>();




                userMap.put("email" , email);
                userMap.put("surname" , surname);

                root.push().setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(NotificationOpen.this, "Data Saved", Toast.LENGTH_SHORT).show();
                    }
                });
            }


        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String surname = mSurname1.getText().toString().trim();
                String email = mEmail1.getText().toString();

                if (!surname.isEmpty() && !email.isEmpty()){
                    PushNotification notification= new PushNotification(new NotificationData(surname,email), TOPIC);
                    sendNotification(notification);
                }



                HashMap<String , String> userMap = new HashMap<>();


                userMap.put("email" , email);
                userMap.put("surname" , surname);

                root1.push().setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(NotificationOpen.this, "Data Saved", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });


    }

    private void uploadImage() {


        if (!( imageUri != null)) {

            StorageReference storageRef = FirebaseStorage.getInstance().getReference().child("images/" + UUID.randomUUID().toString());
            storageRef.putFile(imageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                            Task<Uri> downloadUrl= taskSnapshot.getStorage().getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                @Override
                                public void onComplete(@NonNull Task<Uri> task) {
                                    String t=task.getResult().toString();
                                    DatabaseReference newPost=root2.push();


                                    newPost.child("image").setValue(task.getResult().toString());

                                }
                            });

                            Toast.makeText(NotificationOpen.this, "Image uploaded successfully", Toast.LENGTH_SHORT).show();
                            // Navigate to the display activity and pass image URI
                            Intent intent = new Intent(NotificationOpen.this, DisplayImageActivity.class);
                            intent.putExtra("imageUri", imageUri.toString());
                            startActivity(intent);

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(NotificationOpen.this, "Upload failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        } else {
            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
        }
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

    private void sendNotification(PushNotification notification) {
        ApiUtils.getClients().sendNotification(notification).enqueue(new Callback<PushNotification>() {
            @Override
            public void onResponse(Call<PushNotification> call, Response<PushNotification> response) {
                if (response.isSuccessful())
                    Toast.makeText(NotificationOpen.this,"success",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(NotificationOpen.this,"error",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PushNotification> call, Throwable t) {
                Toast.makeText(NotificationOpen.this,t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }


}