package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CFT_Calculation extends AppCompatActivity {
    TextView tex1, tex2;
    EditText edit1, edit2, edit3, edit4, edit5,edit6;
    Button BTN, btnRest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cft_calculation);

        tex1 =  findViewById(R.id.cfttexview);

        edit1 =  findViewById(R.id.fed1);
        edit2=  findViewById(R.id.fed2);
        edit3= findViewById(R.id.fed3);
        edit4=  findViewById(R.id.ied1);
        edit5=  findViewById(R.id.ied2);
        edit6=  findViewById(R.id.ied3);


        btnRest =  findViewById(R.id.cftb1);
        BTN = findViewById(R.id.cftb2);


        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();
                String string3=edit3.getText().toString();
                String string4=edit4.getText().toString();
                String string5=edit5.getText().toString();
                String string6=edit6.getText().toString();





                if(string1.equals("")){

                    edit1.setError("Please Enter Foot");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("Please Enter Foot");
                    edit2.requestFocus();
                    return;
                }
                if(string3.equals("")){

                    edit3.setError("Please Enter Foot");
                    edit3.requestFocus();
                    return;
                }

                if(string4.equals("")){

                    edit4.setError("Please Enter Inches");
                    edit4.requestFocus();
                    return;
                }

                if(string5.equals("")){

                    edit5.setError("Please Enter Inches");
                    edit5.requestFocus();
                    return;
                }
                if(string6.equals("")){

                    edit6.setError("Please Enter Inches");
                    edit6.requestFocus();
                    return;
                }






                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());
                float edt5 = Float.parseFloat(edit5.getText().toString());
                float edt6 = Float.parseFloat(edit6.getText().toString());



                double btn_calculation1 =  edt4/12;
                double btn_calculation2 =  edt5/12;
                double btn_calculation3 =  edt6/12;
                double btn_calculation4 = btn_calculation1+edt1;
                double btn_calculation5 = btn_calculation2+edt2;
                double btn_calculation6 = btn_calculation3+edt3;
                double btn_calculation7 = btn_calculation4*btn_calculation5*btn_calculation6;
                tex1.setText(Float.toString((float) btn_calculation7));


            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                edit5.setText("");
                edit6.setText("");
                tex1.setText("");

            }
        });

    }
}