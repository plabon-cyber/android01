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

public class Volume extends AppCompatActivity {
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
        setContentView(R.layout.activity_volume);
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


        String[] from={"Liters","Kiloliters","Microliters","Centiliters","Milliliters","Cubic Inches","Cubic Centimeters","Cubic Millimeters","Cubic Meters","Cubic Yards","Cubic Feet","US Gallons(Liquid)","US Barrels(Liquid)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to= {"Liters","Kiloliters","Microliters","Centiliters","Milliliters","Cubic Inches","Cubic Centimeters","Cubic Millimeters","Cubic Meters","Cubic Yards","Cubic Feet","US Gallons(Liquid)","US Barrels(Liquid)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    //Liters
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *100;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount /61.02374;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/764.5549;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/28.31685;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/3.785412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Liters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/119.2405;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Kiloliters

                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *100000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *61023.74;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount*1.307951;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount*35.31467;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount*264.1721;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Kiloliters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount*8.386414;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Microliters

                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount /1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /1e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount /10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount /1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount /16387.06;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount /1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /1e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/7.645549e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/2.831685e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/3785412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Microliters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/1.192405e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Centiliters

                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount /100;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /100000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *10;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount /1.638706;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *10;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /100000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/76455.49;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/2831.685;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/378.5412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Centiliters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/11924.05;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Milliliters

                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount /1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount /10;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount /16.38706;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/764554.9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/28316.85;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/3785.412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Milliliters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/119240.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Cubic Inches

                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount /61.02374;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /61023.74;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *16387.06;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *1.638706;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *16.38706;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *16.38706;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *16387.06;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /61023.74;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/46656;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/1728;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/231;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Inches" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/7276.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Cubic Centimeters

                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount /1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount /10;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount /16.38706;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/764554.9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/28316.85;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/3785.412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Centimeters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/119240.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Cubic Millimeters

                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount /1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /1e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount /10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount /1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount /16387.06;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount /1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount / 1e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/7.645549e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/2.831685e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount/3785412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Millimeters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/1.192405e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Cubic Meters


                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *100000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *61023.74;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount*1.307951;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount*35.31467;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount*264.1721;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Meters" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount*8.386414;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Cubic Yards

                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *764.5549;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /1.307951;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *7.645549e+8;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *76455.49;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *764554.9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *46656;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *764554.9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *7.645549e+8;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount/1.307951;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount*27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount*201.974;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Yards" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount*6.411874;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //Cubic Feet

                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *28.31685;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /35.31467;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *2.831685e+7;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *2831.685;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *28316.85;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *1728;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *28316.85;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *2.831685e+7;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /35.31467;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount*7.480519;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Cubic Feet" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/4.210938;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //US Gallons(Liquid)
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *3.785412;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /264.1721;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *3785412;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *378.5412;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *3785.412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *231;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *3785.412;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *3785412;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /264.1721;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/201.974;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount/7.480519;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Gallons(Liquid)" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount/31.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    //US Barrels(Liquid)

                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Liters") {
                        tot = amount *119.2405;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Kiloliters") {
                        tot = amount /8.386414;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Microliters") {
                        tot = amount *1.192405e+8;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Centiliters") {
                        tot = amount *11924.05;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Milliliters") {
                        tot = amount *119240.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Inches") {
                        tot = amount *7276.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Centimeters") {
                        tot = amount *119240.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Millimeters") {
                        tot = amount *1.192405e+8;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Meters") {
                        tot = amount /8.386414;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Yards") {
                        tot = amount/6.411874;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "Cubic Feet") {
                        tot = amount*4.210938;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "US Gallons(Liquid)") {
                        tot = amount*31.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "US Barrels(Liquid)" && sp2.getSelectedItem().toString() == "US Barrels(Liquid)") {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                }catch (Exception e){

                    Toast.makeText(Volume.this,"Please enter Volume",Toast.LENGTH_LONG).show();

                }
            }
        });

    }
  /*  private void loadAd() {
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