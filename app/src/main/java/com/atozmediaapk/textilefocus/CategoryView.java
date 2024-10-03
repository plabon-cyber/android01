package com.atozmediaapk.textilefocus;

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

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CategoryView extends AppCompatActivity {
    ListView lst1;
    ArrayList<String> title = new ArrayList<String>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_view);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lst1 =findViewById(R.id.list1);
        SQLiteDatabase db = openOrCreateDatabase("superpos", Context.MODE_PRIVATE,null);
        final Cursor c = db.rawQuery("select * from category",null);
        int category = c.getColumnIndex("category");

        title.clear();

        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,title);
        lst1.setAdapter(arrayAdapter);

        final  ArrayList<cate> catee = new ArrayList<cate>();
        if (c.moveToFirst()){
            do{
                cate ca =new cate();
                ca.categoryview=c.getString(category);
                catee.add(ca);
                title.add("\t"+c.getString(category));

            }while (c.moveToNext());
            arrayAdapter.notifyDataSetChanged();
            lst1.invalidateViews();
        }
        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String aaa=title.get(position).toString();
                cate ca=catee.get(position);
                Intent i=new Intent(getApplicationContext(),Edit.class);
                i.putExtra("category",ca.categoryview);
                startActivity(i);
            }
        });
    }

}
