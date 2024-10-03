package com.atozmediaapk.textilefocus;

import static androidx.appcompat.R.layout.support_simple_spinner_dropdown_item;

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

public class ConstructionV extends AppCompatActivity {

    ListView lst1;
    ArrayList<String> title = new ArrayList<String>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction_v);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lst1 =findViewById(R.id.list2);
        SQLiteDatabase db = openOrCreateDatabase("superpos", Context.MODE_PRIVATE,null);

        final Cursor b = db.rawQuery("select * from construction",null);
        int construction = b.getColumnIndex("construction");

        title.clear();;

        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,title);
        lst1.setAdapter(arrayAdapter);

        final  ArrayList<cons> cateee = new ArrayList<cons>();
        if (b.moveToFirst()){
            do{
                cons ba =new cons();
                ba.constructionview=b.getString(construction);
                cateee.add(ba);
                title.add("\t"+b.getString(construction));

            }while (b.moveToNext());
            arrayAdapter.notifyDataSetChanged();
            lst1.invalidateViews();
        }
        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String aaa=title.get(position).toString();
                cons ba=cateee.get(position);
                Intent i=new Intent(getApplicationContext(),BuyerEdit.class);
                i.putExtra("construction",ba.constructionview);
                startActivity(i);
            }
        });
    }
}