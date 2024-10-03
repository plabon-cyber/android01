package com.atozmediaapk.textilefocus;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class TotalDatasave extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Spinner spinner,spinner1,spinner2,spinner3,spinner4;
    ArrayList<String> title1 = new ArrayList<String>();
    ArrayList<String> title2 = new ArrayList<String>();
    ArrayList<String> title3 = new ArrayList<String>();
    ArrayList<String> title4 = new ArrayList<String>();
    ArrayAdapter arrayAdapter1;
    ArrayAdapter arrayAdapter2;
    ArrayAdapter arrayAdapter3;
    ArrayAdapter arrayAdapter4;
    Button b1,b2;


    private DatePickerDialog datePickerDialog;
    private Button dateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_datasave);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        spinner=findViewById(R.id.spmy);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.number, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        initDatePicker();
        dateButton = findViewById(R.id.datePickerButton);
        dateButton.setText(getTodaysDate());


        spinner1 = findViewById(R.id.sp1);
        spinner2 = findViewById(R.id.sp2);
        spinner3 = findViewById(R.id.sp3);
        spinner4 = findViewById(R.id.sp4);
        b1 = findViewById(R.id.save);
        b2 = findViewById(R.id.cancel);
        ed2=(EditText)findViewById(R.id.width);
        ed3=(EditText)findViewById(R.id.qty);






        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insert();


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(TotalDatasave.this, Database.class);
                startActivity(intent2);

            }
        });



        SQLiteDatabase db = openOrCreateDatabase("superpos", Context.MODE_PRIVATE, null);

        final Cursor c = db.rawQuery("select * from category", null);
        int category = c.getColumnIndex("category");

        title1.clear();


        arrayAdapter1 = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, title1);
        spinner1.setAdapter(arrayAdapter1);

        final ArrayList<cate> catee = new ArrayList<cate>();
        if (c.moveToFirst()) {
            do {
                cate ca = new cate();
                ca.categoryview= c.getString(category);
                catee.add(ca);

                title1.add(c.getString(category));


            } while (c.moveToNext());
            arrayAdapter1.notifyDataSetChanged();

        }

        final Cursor b = db.rawQuery("select * from construction", null);
        int construction = b.getColumnIndex("construction");

        title2.clear();


        arrayAdapter2 = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, title2);
        spinner2.setAdapter(arrayAdapter2);

        final ArrayList<cons> cateee = new ArrayList<cons>();
        if (b.moveToFirst()) {
            do {
                cons ba = new cons();
                ba.constructionview= b.getString(construction);
                cateee.add(ba);

                title2.add(b.getString(construction));


            } while (b.moveToNext());
            arrayAdapter2.notifyDataSetChanged();

        }



        final Cursor f = db.rawQuery("select * from fabconstruction", null);
        int fabconstruction = f.getColumnIndex("fabconstruction");

        title3.clear();



        arrayAdapter3 = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, title3);
        spinner3.setAdapter(arrayAdapter3);

        final ArrayList<fabcon> fcateee = new ArrayList<fabcon>();
        if (f.moveToFirst()) {
            do {
                fabcon fa = new fabcon();
                fa.fabconstructionv= f.getString(fabconstruction);
                fcateee.add(fa);

                title3.add(f.getString(fabconstruction));


            } while (f.moveToNext());
            arrayAdapter3.notifyDataSetChanged();

        }



        final Cursor m = db.rawQuery("select * from machine", null);
        int machine = m.getColumnIndex("machine");

        title4.clear();


        arrayAdapter4 = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, title4);
        spinner4.setAdapter(arrayAdapter4);

        final ArrayList<mc> mcateee = new ArrayList<mc>();
        if (m.moveToFirst()) {
            do {
                mc ma = new mc();
                ma.machineview= m.getString(machine);
                mcateee.add(ma);

                title4.add(m.getString(machine));


            } while (m.moveToNext());
            arrayAdapter4.notifyDataSetChanged();

        }


    }


    public void insert(){

        try {
            String date = dateButton.getText().toString();
            String width = ed2.getText().toString();
            String qty = ed3.getText().toString();
            String category = spinner1.getSelectedItem().toString();
            String construction = spinner2.getSelectedItem().toString();
            String fabconstruction = spinner3.getSelectedItem().toString();
            String convert = spinner.getSelectedItem().toString();
            String machine = spinner4.getSelectedItem().toString();



            SQLiteDatabase db = openOrCreateDatabase("superv", Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS totaldatasave(id INTEGER PRIMARY KEY AUTOINCREMENT, date VARCHAR,category VARCHAR,construction VARCHAR,fabconstruction VARCHAR,width VARCHAR,qty VARCHAR,convert VARCHAR,machine VARCHAR)");


            String sql = "insert into totaldatasave(date,category,construction,fabconstruction,width,qty,convert,machine)values(?,?,?,?,?,?,?,?)";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,date);
            statement.bindString(2,category);
            statement.bindString(3,construction);
            statement.bindString(4,fabconstruction);
            statement.bindString(5,width);
            statement.bindString(6,qty);
            statement.bindString(7,convert);
            statement.bindString(8,machine);
            statement.execute();
            Toast.makeText(this,"Total Data Save", Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this,"Data Save Faild",Toast.LENGTH_SHORT).show();

        }
    }



    private String getTodaysDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }

    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                month = month + 1;
                String date = makeDateString(day, month, year);
                dateButton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);
        //datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());

    }

    private String makeDateString(int day, int month, int year)
    {
        return getMonthFormat(month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month)
    {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OCT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }

    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }


}