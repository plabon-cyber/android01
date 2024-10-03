package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Termosul extends AppCompatActivity {
    TextView textView1;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termosul);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textView1=findViewById(R.id.textviewid1);
        ListView listView = findViewById(R.id.list);
        List<String> list = new ArrayList<>();

        list.add("Suitable Woven Fabric for Thermosol Dyeing");
        list.add("Machine Specifications");
        list.add("Follow Chart of Thermosol Process");
        list.add("J-Box");
        list.add("Guide roller and Guider");
        list.add("Compensator");
        list.add("Dey Padder");
        list.add("Nip rolls");
        list.add("Pick up and speed");
        list.add("Padding Trough");
        list.add("Airing zone");
        list.add("Infra-Red Pre-Dryer");
        list.add("Requirement of an Infrared pre-driers");
        list.add("Thermo fixation");
        list.add("Drying Chambers");
        list.add("Curing Chambers");
        list.add("Cooling drum");





        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position==0){
                textView1.setText(R.string.thermosui);

                //startActivity(new Intent(LabTest.this,Dyeing.class));

            }else if (position==1){
                //startActivity(new Intent(LabTest.this,Molarity.class));
                textView1.setText(R.string.thermomcspe);
            }else if(position==2) {
                textView1.setText(R.string.thermoflow);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==3) {
                textView1.setText(R.string.thermojbox);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==4) {
                textView1.setText(R.string.thermogide);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==5) {
                textView1.setText(R.string.thermocom);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==6) {
                textView1.setText(R.string.thermodyepadder);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==7) {
                textView1.setText(R.string.thermonip);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==8) {
                textView1.setText(R.string.thermopick);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==9) {
                textView1.setText(R.string.thermopad);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==10) {
                textView1.setText(R.string.thermoairing);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==11) {
                textView1.setText(R.string.thermoinfra);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==12) {
                textView1.setText(R.string.thermopre);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==13) {
                textView1.setText(R.string.thermofix);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==14) {
                textView1.setText(R.string.thermodry);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==15) {
                textView1.setText(R.string.thermocuring);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==16) {
                textView1.setText(R.string.thermocooling);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }

        });

    }
}