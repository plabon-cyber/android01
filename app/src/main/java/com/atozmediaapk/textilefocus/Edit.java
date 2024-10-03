package com.atozmediaapk.textilefocus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.santalu.maskara.widget.MaskEditText;

public class Edit extends AppCompatActivity {

    EditText ed1, ed2,ed3;
    Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ed1 = findViewById(R.id.order01id);
        b2 = findViewById(R.id.deleteid);
        b3 = findViewById(R.id.cancelid);

        Intent i = getIntent();
        String catagory = i.getStringExtra("category").toString();

        ed1.setText(catagory);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Edit.this,CategoryView.class);
                startActivity(intent2);

            }
        });


    }

    public void delete()
    {
        try {

            String category = ed1.getText().toString();
            SQLiteDatabase db = openOrCreateDatabase("superpos", Context.MODE_PRIVATE,null);

            String sql = "delete from category where category=?";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,category);
            statement.execute();
            Toast.makeText(this,"Category Deleted",Toast.LENGTH_LONG).show();
            Intent i = new Intent(getApplicationContext(),CategoryView.class);
            startActivity(i);

        }catch (Exception e){
            Toast.makeText(this,"Category Delete Faild",Toast.LENGTH_LONG).show();

        }

    }
}