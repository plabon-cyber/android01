package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WaleWidth extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wale_width);
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

                    edit1.setError("Yarn Count");
                    edit1.requestFocus();
                    return;
                }









                //float edt1 = Float.parseFloat(edit1.getText().toString());
                float sqrt = (float) Math.sqrt(Float.parseFloat(edit1.getText().toString()));
                float btn_calculation1 = (float) (28*sqrt);
                float btn_calculation2 = (float) (1/btn_calculation1);
                float btn_calculation3 = (float) (4*btn_calculation2);
                tex1.setText(Float.toString((float) btn_calculation3));
                tex2.setText("Inch");



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

