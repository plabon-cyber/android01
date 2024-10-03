package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rolled_Fab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolled_fab);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1;
        final EditText edit2,edit3,edit4;
        Button BTN, btnRest;


        tex1 =  findViewById(R.id.tex01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3= findViewById(R.id.edit03ID);
        edit4=  findViewById(R.id.edit04ID);
        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);



        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string2=edit2.getText().toString();
                String string3=edit3.getText().toString();
                String string4=edit4.getText().toString();




                if(string2.equals("")){

                    edit2.setError("Please Enter Thickness of fabrics");
                    edit2.requestFocus();
                    return;
                }

                if(string3.equals("")){

                    edit3.setError("Please Enter Outside diameter");
                    edit3.requestFocus();
                    return;
                }

                if(string4.equals("")){

                    edit4.setError("Please Enter Inside diameter");
                    edit4.requestFocus();
                    return;
                }




                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());



                double btn_calculation1 =  edt3*edt3;
                double btn_calculation01= btn_calculation1/4;
                double btn_calculation2 = edt4*edt4;
                double btn_calculation02=btn_calculation2/4;
                double btn_calculation3 = btn_calculation01-btn_calculation02;
                double btn_calculation4= btn_calculation3/2;
                float btn_calculation5 = (float) (btn_calculation4*3.14159);
                float btn_calculation6= (float) ((float) btn_calculation5/39.37);

                tex1.setText(Float.toString(btn_calculation6));


            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                tex1.setText("");

            }
        });

    }
}

