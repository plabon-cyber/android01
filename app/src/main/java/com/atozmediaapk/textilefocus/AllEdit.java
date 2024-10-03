package com.atozmediaapk.textilefocus;

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

import androidx.appcompat.app.AppCompatActivity;

public class AllEdit extends AppCompatActivity {

    EditText ed0, ed1, ed2, ed3, ed4, ed5, ed6,ed01,ed7;
    Button  b2, b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_edit);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ed0 = findViewById(R.id.se);
        ed1 = findViewById(R.id.order01id);
        ed2 = findViewById(R.id.order02id);
        ed3 = findViewById(R.id.order03id);
        ed4 = findViewById(R.id.order04id);
        ed5 = findViewById(R.id.order05id);
        ed6 = findViewById(R.id.order06id);
        ed01 = findViewById(R.id.convid);
        ed7 = findViewById(R.id.order07id);
        b2 = findViewById(R.id.updateid);
        b3 = findViewById(R.id.cancelid);


        Intent i = getIntent();
        String id = i.getStringExtra("id").toString();
        String dateview = i.getStringExtra("dateview").toString();
        String categoryview = i.getStringExtra("categoryview").toString();
        String constructionview = i.getStringExtra("constructionview").toString();
        String fabconstructionv = i.getStringExtra("fabconstructionv").toString();
        String widthview = i.getStringExtra("widthview").toString();
        String qtyview = i.getStringExtra("qtyview").toString();
        String convert = i.getStringExtra("convert").toString();
        String machineview = i.getStringExtra("machineview").toString();

        ed0.setText(id);
        ed1.setText(dateview);
        ed2.setText(categoryview);
        ed3.setText(constructionview);
        ed4.setText(fabconstructionv);
        ed5.setText(widthview);
        ed6.setText(qtyview);
        ed01.setText(convert);
        ed7.setText(machineview);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update();


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AllEdit.this, TotalDataview.class);
                startActivity(intent2);

            }
        });

    }

    public void update() {
        try {

            String id = ed0.getText().toString();
            String date = ed1.getText().toString();
            String category = ed2.getText().toString();
            String construction = ed3.getText().toString();
            String fabconstruction = ed4.getText().toString();
            String width = ed5.getText().toString();
            String qty = ed6.getText().toString();
            String convert = ed01.getText().toString();
            String machine = ed7.getText().toString();
            SQLiteDatabase db = openOrCreateDatabase("superv", Context.MODE_PRIVATE, null);

            String sql = "update totaldatasave set date=?,category=?,construction=?,fabconstruction=?,width=?,qty=?,convert=?,machine=? where id=? ";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1, date);
            statement.bindString(2, category);
            statement.bindString(3, construction);
            statement.bindString(4, fabconstruction);
            statement.bindString(5, width);
            statement.bindString(6, qty);
            statement.bindString(7, convert);
            statement.bindString(8, machine);
            statement.bindString(9, id);
            statement.execute();
            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), TotalDataview.class);
            startActivity(i);


        } catch (Exception e) {
            Toast.makeText(this, "Update Faild", Toast.LENGTH_SHORT).show();

        }

    }

}

