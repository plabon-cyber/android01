package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoofNeedles extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noof_needles);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1 ;
        final EditText edit1,edit2;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);


        BTN.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();





                if(string1.equals("")){

                    edit1.setError("Dia");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("gauge");
                    edit2.requestFocus();
                    return;
                }










                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());



                double btn_calculation1 =  edt1*edt2*3.14159265;

                tex1.setText(Float.toString((float) btn_calculation1));


            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");

                tex1.setText("");

            }
        });

    }
}

