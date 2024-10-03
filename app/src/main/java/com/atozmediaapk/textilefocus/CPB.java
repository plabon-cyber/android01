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

public class CPB extends AppCompatActivity {
    TextView textView1;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpb);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textView1=findViewById(R.id.textviewid1);
        ListView listView = findViewById(R.id.list);
        List<String> list = new ArrayList<>();

        list.add("Intrduction");
        list.add("This Dyeing Process has gained wide acceptance due to the following reasons");
        list.add("Compare with others dyeing(knit or woven) minimize");
        list.add("Drakback of this process");
        list.add("Which fabric is suitable for CPB Dyeing");
        list.add("General Parameter of CPB Machine");
        list.add("A Typical Recipe for CPB Dyeing");
        list.add("Color Liquid");
        list.add("Chemical Liquid(Alkali)");
        list.add("Cold Pad Batch(CPB)Process Flow Chart");




        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position==0){
                textView1.setText(R.string.cpbIntro);

                //startActivity(new Intent(LabTest.this,Dyeing.class));

            }else if (position==1){
                //startActivity(new Intent(LabTest.this,Molarity.class));
                textView1.setText(R.string.cpbreasons);
            }else if(position==2) {
                textView1.setText(R.string.cpbCompare);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==3) {
                textView1.setText(R.string.cpbdrawbacks);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==4) {
                textView1.setText(R.string.cpbsuitable);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==5) {
                textView1.setText(R.string.cpbprameter);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==6) {
                textView1.setText(R.string.cpbtypical);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==7) {
                textView1.setText(R.string.cpbcolorliquid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==8) {
                textView1.setText(R.string.cpbalkali);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==9) {
                textView1.setText(R.string.cpbflowchart);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }

        });

    }
}