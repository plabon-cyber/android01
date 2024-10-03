package com.atozmediaapk.textilefocus;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Various_Dyeing_Machine extends AppCompatActivity {
    ListView listView1,listView2,listView3;
    String [] listviewitems1=new String[]{"1. Cold Pad Batch(CPB) Dyeing"};
    String [] listviewitems2=new String[]{"2. Thermosol Dyeing Machine"};
    String [] listviewitems3=new String[]{"3. Pad Steam Dyeing Machine"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_various_dyeing_machine);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 =  findViewById(R.id.list1);
        listView2 =  findViewById(R.id.list2);
        listView3 =  findViewById(R.id.list3);



        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems1);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems1[position].toString();
                Intent intent1=new Intent(Various_Dyeing_Machine.this,CPB.class);
                intent1.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent1);
            }
        });

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems2[position].toString();
                Intent intent2=new Intent(Various_Dyeing_Machine.this,Termosul.class);
                intent2.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent2);
            }
        });

        ArrayAdapter<String>adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems3[position].toString();
                Intent intent3=new Intent(Various_Dyeing_Machine.this,Pad_Steam.class);
                intent3.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent3);
            }
        });
    }
}