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
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;


public class TotalDataview extends AppCompatActivity {
    ListView lst1;
    ArrayList<String> title = new ArrayList<String>();
    ArrayAdapter arrayAdapter;

    androidx.appcompat.widget.SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_dataview);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        searchView= (androidx.appcompat.widget.SearchView) findViewById(R.id.search);


        lst1 = findViewById(R.id.list2);
        SQLiteDatabase db = openOrCreateDatabase("superv", Context.MODE_PRIVATE, null);

        final Cursor p = db.rawQuery("select * from TotalDatasave", null);
        int id =p.getColumnIndex("id");
        int date = p.getColumnIndex("date");
        int category = p.getColumnIndex("category");
        int construction = p.getColumnIndex("construction");
        int fabconstruction = p.getColumnIndex("fabconstruction");
        int width = p.getColumnIndex("width");
        int qty = p.getColumnIndex("qty");
        int convert = p.getColumnIndex("convert");
        int machine = p.getColumnIndex("machine");



        title.clear();



        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, title);
        lst1.setAdapter(arrayAdapter);

        final ArrayList<prod> proud = new ArrayList<prod>();
        if (p.moveToFirst()) {
            do {
                prod pa = new prod();
                pa.id =p.getString(id);
                pa.dateview = p.getString(date);
                pa.categoryview = p.getString(category);
                pa.constructionview= p.getString(construction);
                pa.fabconstructionv= p.getString(fabconstruction);
                pa.widthview= p.getString(width);
                pa.qtyview= p.getString(qty);
                pa.convert= p.getString(convert);
                pa.machineview= p.getString(machine);

                proud.add(pa);
                title.add("\t"+"Serial No:"+ p.getString(id)+"\t"+"\t"+"Order No:"+ p.getString(category)+"\t"+"\t"+"Date:"+"\t"+ p.getString(date)+"\t"+"\t"+"BUYER:"+"\t"+p.getString(construction)+"\t"+"\t"+"CONSTRUCTION:"+"\t"+"\t"+p.getString(fabconstruction)+"\t"+"\t"+"WIDTH:"+"\t"+p.getString(width)+"\t"+"\t"+"QUANTITY:"+"\t"+p.getString(qty)+"\t"+p.getString(convert)+"\t"+"\t"+"Process:"+"\t"+p.getString(machine)+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");

            } while (p.moveToNext());
            arrayAdapter.notifyDataSetChanged();
            lst1.invalidateViews();

        }


        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                prod pa=proud.get(position);
                Intent i=new Intent(getApplicationContext(),AllEdit.class);
                i.putExtra("id",pa.id);
                i.putExtra("dateview",pa.dateview);
                i.putExtra("categoryview",pa.categoryview);
                i.putExtra("constructionview",pa.constructionview);
                i.putExtra("fabconstructionv",pa.fabconstructionv);
                i.putExtra("widthview",pa.widthview);
                i.putExtra("qtyview",pa.qtyview);
                i.putExtra("convert",pa.convert);
                i.putExtra("machineview",pa.machineview);
                startActivity(i);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }

}