package com.atozmediaapk.textilefocus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Weight extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    TextView textView;
    private double view;
    double view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ed1=findViewById(R.id.weight1id);
        sp1=findViewById(R.id.fromid);
        sp2=findViewById(R.id.toid);
        b1=findViewById(R.id.btnw);
        textView=(TextView) findViewById(R.id.t1);


        String[] from={"Kilogram","Grams","Pounds","Ounces","Metric Tons","Milligrams","Micrograms","Grains"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Kilogram","Grams","Pounds","Ounces","Metric Tons","Milligrams","Micrograms","Grains"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount*1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount*2.204623;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount*35.27396;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount*15432.36;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*1.000000e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilogram" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount/453.5923;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount/28.34952;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/1000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount*15.43236;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*1.000000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grams" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }




                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount*0.4535923;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount*16;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/2204.623;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount*7000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*453592.3;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*4.535923e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Pounds" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount*453.5923;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }







                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount/35.27;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount/16.00;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/3.527e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount*437.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*2.835e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*2.835e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Ounces" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount*28.35;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount*2205;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount*3.527e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount*1.543e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*1.000e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*1.000e+12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Tons" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount*1.000e+6;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount/1.000e+6;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount/4.536e+5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount/2.835e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/1.000e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount/64.80;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Milligrams" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }







                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount/1.000e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount/4.536e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount/2.835e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/1.000e+12;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount/6.480e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Micrograms" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount/1.000e+6;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Kilogram")
                    {
                        tot = amount/1.543e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Pounds")
                    {
                        tot = amount/7000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Ounces")
                    {
                        tot = amount/437.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Metric Tons")
                    {
                        tot = amount/1.543e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Grains")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Milligrams")
                    {
                        tot = amount*64.80;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Micrograms")
                    {
                        tot = amount*6.480e+4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains" && sp2.getSelectedItem().toString()=="Grams")
                    {
                        tot = amount/15.43;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }



                }catch (Exception e){

                    Toast.makeText(Weight.this,"Please enter Weight",Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}