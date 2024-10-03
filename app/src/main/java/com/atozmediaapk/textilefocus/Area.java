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

public class Area extends AppCompatActivity {
  /*  private InterstitialAd mInterstitialAd;
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
        setContentView(R.layout.activity_area);
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


        String[] from={"Hectares","Square Meters","Acres","Square Feet","Square Kilometers","Square Miles","Square Centimeters","Square Millimeters","Square Yards","Square Inches"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Hectares","Square Meters","Acres","Square Feet","Square Kilometers","Square Miles","Square Centimeters","Square Millimeters","Square Yards","Square Inches"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    //Hectares
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Hectarse") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount *10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount *107639.1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount /100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount /258.9988;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount *100000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 1e+10;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount*11959.9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount*15500031;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Hectares" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount*2.471054;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    //Acres

                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /2.471054;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount *4046.856;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount *43560;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount /247.1054;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 640;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount *4.046856e+7;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 4.046856e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount *4840;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount *6272640;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Acres" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Feet

                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /107639.1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount /10.76391;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount / 1.076391e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 2.78784e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 929.0304;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 92903.04;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount / 9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount *144;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Feet" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount / 43560;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Kilometers

                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount * 100;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount *1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount * 1.076391e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 2.589988;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 1e+10;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 1e+12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount *1195990;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount *1550003e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Kilometers" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount *247.1054;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Miles

                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount * 258.9988;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount *2589988;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount * 2.78784e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount *2.589988;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 2.589988e+10;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 2.589988e+12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount *3097600;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount *4.01449e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Miles" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount *640;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Centimeters

                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /1e+8;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount /10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount/929.0304 ;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount / 1e+10;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount /2.589988e+10;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount / 8361.274;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount / 6.4516;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Centimeters" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount / 4.046856e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Millimeters

                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /1e+10;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount /1000000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount /92903.04;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount / 1e+12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 2.589988e+12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount /100;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount / 836127.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount / 645.16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Millimeters" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount /4.046856e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Yards

                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /11959.9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount /1.19599;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount *9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount / 1195990;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 3097600;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 8361.274;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 836127.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount *1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount *1296;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Yards" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount *4840;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Inches

                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /1.550003e+7;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount /1550.003;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount/144;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount / 1.550003e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 4.01449e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 6.4516;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 645.16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount /1296;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount * 1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Inches" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount / 6272640;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //Square Meters

                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Hectares") {
                        tot = amount /10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Meters") {
                        tot = amount *1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Feet") {
                        tot = amount*10.76391;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Kilometers") {
                        tot = amount /1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Miles") {
                        tot = amount / 2589988;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Centimeters") {
                        tot = amount * 10000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Millimeters") {
                        tot = amount * 1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Yards") {
                        tot = amount *1.19599;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Square Inches") {
                        tot = amount * 1550.003;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString() == "Square Meters" && sp2.getSelectedItem().toString() == "Acres") {
                        tot = amount / 4046.856;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }










                }catch (Exception e){

                    Toast.makeText(Area.this,"Please enter Area",Toast.LENGTH_LONG).show();

                }
            }
        });

    }
 /*   private void loadAd() {
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