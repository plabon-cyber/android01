package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WidthDefferent extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_width_defferent);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1,tex2 ;
        final EditText edit1,edit2,edit3;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3 = findViewById(R.id.edit03ID);
        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);


        BTN.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();
                String string3=edit3.getText().toString();




                if(string1.equals("")){

                    edit1.setError("Old Width");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("New Count");
                    edit2.requestFocus();
                    return;
                }
                if(string3.equals("")){

                    edit3.setError("Old Count");
                    edit3.requestFocus();
                    return;
                }










                float edt1 = Float.parseFloat(edit1.getText().toString());


                float sqrt1 = (float) Math.sqrt(Float.parseFloat(edit2.getText().toString()));
                float sqrt2 = (float) Math.sqrt(Float.parseFloat(edit3.getText().toString()));
                float btn_calculation1 = (float) (sqrt2/sqrt1);
                float btn_calculation2=(float) btn_calculation1*edt1;
                tex1.setText(Float.toString((float) btn_calculation2));
                tex2.setText("Inch");

            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                tex1.setText("");
                tex2.setText("");

            }
        });

    }
}

