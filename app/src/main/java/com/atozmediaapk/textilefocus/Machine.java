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

public class Machine extends AppCompatActivity {
    EditText ed1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ed1= (EditText) findViewById(R.id.edit1);
        b1 =(Button)findViewById(R.id.save1);
        b2 =(Button) findViewById(R.id.cancel1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Machine.this, Database.class);
                startActivity(intent2);

            }
        });

    }

    public void insert(){

        try {

            String machine = ed1.getText().toString();
            SQLiteDatabase db = openOrCreateDatabase("superpos", Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS machine(machine VARCHAR)");

            String sql = "insert into machine(machine)values(?)";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,machine);
            statement.execute();
            Toast.makeText(this,"Process Name Add", Toast.LENGTH_LONG).show();
            ed1.setText("");

        }catch (Exception e){
            Toast.makeText(this,"Process Add Faild",Toast.LENGTH_LONG).show();

        }
    }
}