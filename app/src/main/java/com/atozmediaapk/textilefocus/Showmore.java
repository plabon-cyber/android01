package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Showmore extends AppCompatActivity {
    private ImageView book_image2;
    private TextView book_intros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmore);
        book_image2 = findViewById(R.id.book_img2);
        book_intros = findViewById(R.id.books_intros_tv2);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("book_intros");
            int img = extras.getInt("book_images");
            book_intros.setText(value);
            book_image2.setImageResource(img);
        }
    }
}