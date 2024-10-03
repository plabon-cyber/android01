package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CirculerKnittingPerShift extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuler_knitting_per_shift);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1 ,tex2,tex3,tex4,tex5;
        final EditText edit1,edit2,edit3,edit4,edit5;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        tex3 =  findViewById(R.id.tex03ID);
        tex4 =  findViewById(R.id.tex04ID);
        tex5 =  findViewById(R.id.tex05ID);
        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3 = findViewById(R.id.edit03ID);
        edit4 = findViewById(R.id.edit04ID);
        edit5 = findViewById(R.id.edit05ID);
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




                if(string1.equals("")){

                    edit1.setError("Dia");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("Speed");
                    edit2.requestFocus();
                    return;
                }
                if(string3.equals("")){

                    edit3.setError("F.Number");
                    edit3.requestFocus();
                    return;
                }
                if(string4.equals("")){

                    edit4.setError("CofN");
                    edit4.requestFocus();
                    return;
                }
                if(string5.equals("")){

                    edit5.setError("efficency");
                    edit5.requestFocus();
                    return;
                }









                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());
                float edt5 = Float.parseFloat(edit5.getText().toString());



                double btn_calculation1 =  edt2*edt3;
                float btn_calculation2=(float) btn_calculation1/edt4;
                float btn_calculation3=(float) edt5/100;
                float btn_calculation4=(float) 60*8;
                float btn_calculation41=(float) 60/edt3;
                float btn_calculation5=(float) btn_calculation4/edt3;
                float btn_calculation6=(float) btn_calculation2*btn_calculation3*btn_calculation5;
                float btn_calculation7=(float) btn_calculation2*btn_calculation3*btn_calculation41;
                tex1.setText(Float.toString((float) btn_calculation1));
                tex2.setText(Float.toString((float) btn_calculation6));
                tex4.setText(Float.toString((float) btn_calculation7));
                tex3.setText("Yards Per Shift");
                tex5.setText("Yards Per Hour");


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
                tex1.setText("");
                tex2.setText("");
                tex3.setText("");
                tex4.setText("");
                tex5.setText("");


            }
        });

    }
}

