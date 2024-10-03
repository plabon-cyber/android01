package com.atozmediaapk.textilefocus;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DisplayImageActivity extends AppCompatActivity {

    private ImageView displayedImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        displayedImageView = findViewById(R.id.displayedImageView);

        // Retrieve image URI from intent
        String imageUriString = getIntent().getStringExtra("imageUri");
        if (imageUriString != null) {
            Uri imageUri = Uri.parse(imageUriString);
            Picasso.get().load(imageUri).into(displayedImageView);
        }
    }
}
