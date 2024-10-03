package com.atozmediaapk.textilefocus;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Pad_Steam extends AppCompatActivity {
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pad_steam);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textView1=findViewById(R.id.textviewid1);
        ListView listView = findViewById(R.id.list);
        List<String> list = new ArrayList<>();


        list.add("Pad Dry-Pad steam process");
        list.add("PDPS of Disperse and Reactive Dyes");
        list.add("Following is the flow chart");
        list.add("Pad Steam Process Follow chart");





        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position==0){
                textView1.setText(R.string.thermopre);

                //startActivity(new Intent(LabTest.this,Dyeing.class));

            }else if (position==1){
                //startActivity(new Intent(LabTest.this,Molarity.class));
                textView1.setText(R.string.thermofix);
            }else if(position==2) {
                textView1.setText(R.string.thermodry);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==3) {
                textView1.setText(R.string.thermocuring);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }

        });

    }
}
