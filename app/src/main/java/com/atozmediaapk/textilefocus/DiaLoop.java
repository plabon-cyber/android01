package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DiaLoop extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_loop);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1,tex2 ;
        final EditText edit1;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        edit1 =  findViewById(R.id.edit01ID);

        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);


        BTN.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string1=edit1.getText().toString();





                if(string1.equals("")){

                    edit1.setError("Stitch length");
                    edit1.requestFocus();
                    return;
                }







                float edt1 = Float.parseFloat(edit1.getText().toString());


                float btn_calculation1 = (float) (edt1/3.14159265);
                tex1.setText(Float.toString((float) btn_calculation1));
                tex2.setText("mm");



            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                edit1.setText("");
                tex1.setText("");
                tex2.setText("");


            }
        });

    }
}

