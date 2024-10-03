package com.atozmediaapk.textilefocus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MachineView extends AppCompatActivity {
    ListView lst1;
    ArrayList<String> title = new ArrayList<String>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_view);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lst1 =findViewById(R.id.list1);
        SQLiteDatabase db = openOrCreateDatabase("superpos", Context.MODE_PRIVATE,null);

        final Cursor m = db.rawQuery("select * from machine",null);
        int machine = m.getColumnIndex("machine");

        title.clear();;

        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,title);
        lst1.setAdapter(arrayAdapter);

        final  ArrayList<mc> mcatee = new ArrayList<mc>();
        if (m.moveToFirst()){
            do{
                mc ma =new mc();
                ma.machineview=m.getString(machine);
                mcatee.add(ma);
                title.add("\t"+m.getString(machine));

            }while (m.moveToNext());
            arrayAdapter.notifyDataSetChanged();
            lst1.invalidateViews();
        }

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String aaa=title.get(position).toString();
                mc ma=mcatee.get(position);
                Intent i=new Intent(getApplicationContext(),MachineEdit.class);
                i.putExtra("machine",ma.machineview);
                startActivity(i);
            }
        });
    }
}