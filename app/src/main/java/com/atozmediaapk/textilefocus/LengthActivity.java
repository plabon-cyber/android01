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

public class LengthActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    TextView textView;
    private double view;
    double view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ed1=findViewById(R.id.weight1id);
        sp1=findViewById(R.id.fromid);
        sp2=findViewById(R.id.toid);
        b1=findViewById(R.id.btnw);
        textView=(TextView) findViewById(R.id.t1);


        String[] from={"Kilometers","Meters","Miles","Centimeters","Milimeters","Feet","Inches","Yards"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Kilometers","Meters","Miles","Centimeters","Milimeters","Feet","Inches","Yards"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount*1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount/1.609;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount/1.000e+5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount/1.000e+6;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount*3281;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount*3.937e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilometers" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount*1094;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount/1609;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount*100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount*3.281;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount*39.37;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Meters" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount*1.0936;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }




                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount*1.609;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount*1609;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount*1.609e+5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount*1.609e+6;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount*5280;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount*6.336e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Miles" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount*1760;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }



                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount/1.6092e+5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount/1.000e+5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount/100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount*10;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount/30.48;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount/2.540;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Centimeters" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount/91.44;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount/5280;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount/3281;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount/3.281;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount*30.48;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount*304.8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount*12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Feet" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount/3;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount/6.336e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount/3.937e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount/39.37;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount*2.540;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount*25.40;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount/12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Inches" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount/36;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }




                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Miles")
                    {
                        tot = amount/1760;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Kilometers")
                    {
                        tot = amount/1094;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Meters")
                    {
                        tot = amount/1.0936;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Centimeters")
                    {
                        tot = amount*91.44;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Milimeters")
                    {
                        tot = amount*914.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Feet")
                    {
                        tot = amount*3;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Inches")
                    {
                        tot = amount*36;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Yards" && sp2.getSelectedItem().toString()=="Yards")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                }catch (Exception e){

                    Toast.makeText(LengthActivity.this,"Please enter Length",Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}