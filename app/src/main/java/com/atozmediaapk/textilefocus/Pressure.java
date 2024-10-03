package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pressure extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    TextView textView;
    private double view;
    double view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       /* MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/

        ed1=findViewById(R.id.weight1id);
        sp1=findViewById(R.id.fromid);
        sp2=findViewById(R.id.toid);
        b1=findViewById(R.id.btnw);
        textView=(TextView) findViewById(R.id.t1);


        String[] from={"Pascals","Bar","Pound force per square inches","Atmospheres","Inches of Water","Millimeters of water","Millibar","Kilogram force per square meter","Newtons per metre squared","Pounds per square foot"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Pascals","Bar","Pound force per square inches","Atmospheres","Inches of Water","Millimeters of water","Millibar","Kilogram force per square meter","Newtons per metre squared","Pounds per square foot"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    //Pascal
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/100000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/6894.757;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/101325;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount/249.0889;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount/9.80665;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount/100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount/9.80665;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pascals" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount/47.88026;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Bar

                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*100000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount*14.50377;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/1.01325;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount*401.4631;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*10197.16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*10197.16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*100000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Bar" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount*2088.543;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    //Pound force per square inches
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*6894.757;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/14.50377;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/14.69595;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount*27.6799;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*703.0696;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount*68.94757;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*703.0696;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*6894.757;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pound force per square inches" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount*144;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Atmospheres
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*101325;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount*1.01325;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount*14.69595;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount*406.7825;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*10332.27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount*1013.25;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*10332.27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*101325;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Atmospheres" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount*2116.217;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    //Inches of Water


                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*249.0889;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/401.4631;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/27.6799;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/406.7825;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*25.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount*2.490889;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*25.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*249.0889;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches of Water" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount*5.20233;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Millimeters of water

                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*9.80665;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/10197.16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/703.0696;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/10332.27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount/25.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount/10.19716;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*9.80665;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millimeters of water" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount/4.882428;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Millibar


                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*100;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/68.94757;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/1013.25;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount/2.490889;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*10.19716;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*10.19716;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Millibar" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount*2.088543;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }


                    //Kilogram force per square meter
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*9.80665;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/10197.16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/703.0696;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/10332.27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount/25.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount/10.19716;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*9.80665;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram force per square meter" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount/4.882428;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Newtons per metre squared

                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/100000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/6894.757;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/101325;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount/249.0889;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount/9.80665;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount/100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount/9.80665;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newtons per metre squared" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount/47.88026;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Pounds per square foot

                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Pascals")
                    {
                        tot = amount*47.88026;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Bar")
                    {
                        tot = amount/2088.543;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Pound force per square inches")
                    {
                        tot = amount/144;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Atmospheres")
                    {
                        tot = amount/2116.217;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Inches of Water")
                    {
                        tot = amount/5.20233;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Millimeters of water")
                    {
                        tot = amount*4.882428;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Millibar")
                    {
                        tot = amount/2.088543;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Kilogram force per square meter")
                    {
                        tot = amount*4.882428;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Newtons per metre squared")
                    {
                        tot = amount*47.88026;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds per square foot" && sp2.getSelectedItem().toString()=="Pounds per square foot")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }




                }catch (Exception e){

                    Toast.makeText(Pressure.this,"Please enter Pressure",Toast.LENGTH_LONG).show();

                }

            }
        });

    }

   /* private void loadAd() {
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-7027345196988376/5436345617", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                Log.d(TAG, "Ad was clicked.");
                                finish();
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                Log.d(TAG, "Ad dismissed fullscreen content.");
                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                Log.e(TAG, "Ad failed to show fullscreen content.");
                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdImpression() {
                                Log.d(TAG, "Ad recorded an impression.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                Log.d(TAG, "Ad showed fullscreen content.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });

    }

    @Override
    public void finish() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
            super.finish();
        }

    }*/
}