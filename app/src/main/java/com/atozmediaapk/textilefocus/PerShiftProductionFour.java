package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerShiftProductionFour extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_shift_production_four);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1 ,tex2,tex21,tex3,tex4,tex5,tex51,tex6,tex61;
        final EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        tex21 =  findViewById(R.id.tex021ID);
        tex3 =  findViewById(R.id.tex03ID);
        tex4 =  findViewById(R.id.tex04ID);
        tex5 =  findViewById(R.id.tex05ID);
        tex51 =  findViewById(R.id.tex051ID);
        tex6 =  findViewById(R.id.tex06ID);
        tex61 =  findViewById(R.id.tex061ID);


        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3 = findViewById(R.id.edit03ID);
        edit4 = findViewById(R.id.edit04ID);
        edit5 = findViewById(R.id.edit05ID);
        edit6 = findViewById(R.id.edit06ID);
        edit7 = findViewById(R.id.edit07ID);


        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);


        BTN.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();
                String string3=edit3.getText().toString();
                String string4=edit4.getText().toString();
                String string5=edit5.getText().toString();
                String string6=edit6.getText().toString();
                String string7=edit7.getText().toString();





                if(string1.equals("")){

                    edit1.setError("inch");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("gauge");
                    edit2.requestFocus();
                    return;
                }
                if(string3.equals("")){

                    edit3.setError("num");
                    edit3.requestFocus();
                    return;
                }
                if(string4.equals("")){

                    edit4.setError("rpm");
                    edit4.requestFocus();
                    return;
                }
                if(string5.equals("")){

                    edit5.setError("mm");
                    edit5.requestFocus();
                    return;
                }
                if(string6.equals("")){

                    edit6.setError("Tex");
                    edit6.requestFocus();
                    return;
                }

                if(string7.equals("")){

                    edit7.setError("%");
                    edit7.requestFocus();
                    return;
                }










                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());
                float edt5 = Float.parseFloat(edit5.getText().toString());
                float edt6 = Float.parseFloat(edit6.getText().toString());
                float edt7 = Float.parseFloat(edit7.getText().toString());



              //wales
                double btn_calculation1 =  edt1*edt2*3.1415;
                //coures
                float btn_calculation2= (float) (edt5*btn_calculation1);
                float btn_calculation3=(float) btn_calculation2/1000;
                //coures/minute
                float btn_calculation4=(float) edt3*edt4;
                //coures/8hour
                float btn_calculation5=(float)btn_calculation4*60*8;
                //measure yarn
                float btn_calculation6=(float) btn_calculation5*btn_calculation3;
                //pro 8 hour
                float btn_calculation7=(float) edt7/100;

                float btn_calculation8=(float) 1000*1000;
                float btn_calculation9=(float) edt6/btn_calculation8;

                float btn_calculation10=(float)btn_calculation6*btn_calculation7*btn_calculation9;

                tex1.setText(Float.toString((float) btn_calculation1));
                tex2.setText(Float.toString((float) btn_calculation3));
                tex3.setText(Float.toString((float) btn_calculation4));
                tex4.setText(Float.toString((float) btn_calculation5));
                tex5.setText(Float.toString((float) btn_calculation6));
                tex6.setText(Float.toString((float) btn_calculation10));
                tex21.setText("MTR");
                tex51.setText("MTR");
                tex61.setText("Kg");




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
                edit7.setText("");

                tex1.setText("");
                tex2.setText("");
                tex3.setText("");
                tex4.setText("");
                tex5.setText("");
                tex6.setText("");
                tex21.setText("");
                tex51.setText("");
                tex61.setText("");



            }
        });

    }
}

