package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FabricWidth2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabric_width2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1,tex2 ;
        final EditText edit1,edit2;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        edit1 =  findViewById(R.id.edit01ID);
        edit2 =  findViewById(R.id.edit02ID);

        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);


        BTN.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();





                if(string1.equals("")){

                    edit1.setError("Needle number");
                    edit1.requestFocus();
                    return;
                }
                if(string2.equals("")){

                    edit2.setError("Yarn Count");
                    edit2.requestFocus();
                    return;
                }









                float edt1 = Float.parseFloat(edit1.getText().toString());
                float sqrt = (float) Math.sqrt(Float.parseFloat(edit2.getText().toString()));
                float btn_calculation1 = (float) (28*sqrt);
                float btn_calculation2 = (float) (1/btn_calculation1);
                float btn_calculation3 = (float) (4*btn_calculation2);
                float btn_calculation4 = (float) (edt1*btn_calculation3);
                tex1.setText(Float.toString((float) btn_calculation4));
                tex2.setText("Inch");



            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                tex1.setText("");
                tex2.setText("");


            }
        });

    }
}

