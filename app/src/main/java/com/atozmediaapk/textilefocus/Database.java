package com.atozmediaapk.textilefocus;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Database extends AppCompatActivity {
    Button b1,b2,b3,b4,tbtn1,tbtn2,conbtn,convbtn,mcbtn,mcvbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        b1 = findViewById(R.id.save1);
        b2 = findViewById(R.id.cancel1);
        b3 = findViewById(R.id.save2);
        b4 = findViewById(R.id.cancel2);
        tbtn1 = findViewById(R.id.TotalAdd);
        tbtn2 = findViewById(R.id.TotalView);
        conbtn = findViewById(R.id.conid);
        convbtn = findViewById(R.id.convid);
        mcbtn = findViewById(R.id.mcid);
        mcvbtn = findViewById(R.id.mcvid);


        b1.setOnClickListener(view -> {
            Intent intent1=new Intent(Database.this,CategoryAdd.class);
            startActivity(intent1);
        });

        b2.setOnClickListener(view -> {
            Intent intent2=new Intent(Database.this,CategoryView.class);
            startActivity(intent2);
        });


        b3.setOnClickListener(view -> {
            Intent intent3=new Intent(Database.this,Construction.class);
            startActivity(intent3);
        });

        b4.setOnClickListener(view -> {
            Intent intent4=new Intent(Database.this,ConstructionV.class);
            startActivity(intent4);
        });


        tbtn1.setOnClickListener(view -> {

            Intent intent5 = new Intent(Database.this, TotalDatasave.class);
            startActivity(intent5);
        });

        tbtn2.setOnClickListener(view -> {

            Intent intent6 = new Intent(Database.this, TotalDataview.class);
            startActivity(intent6);
        });



        conbtn.setOnClickListener(view -> {
            Intent intent3=new Intent(Database.this,FabConstruction.class);
            startActivity(intent3);
        });

        convbtn.setOnClickListener(view -> {
            Intent intent4=new Intent(Database.this,FabConstructionV.class);
            startActivity(intent4);
        });

        mcbtn.setOnClickListener(view -> {
            Intent intent5=new Intent(Database.this,Machine.class);
            startActivity(intent5);
        });

        mcvbtn.setOnClickListener(view -> {
            Intent intent6=new Intent(Database.this,MachineView.class);
            startActivity(intent6);
        });

    }
}