package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Production_Capacity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_capacity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1 ;
        final EditText edit1,edit2,edit3;
        Button BTN, btnRest;


        tex1 =  findViewById(R.id.tex01ID);
        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3 =  findViewById(R.id.edit03ID);
        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);



        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();
                String string3=edit3.getText().toString();





                if(string1.equals("")){

                    edit1.setError("Please Enter Machine(hr)Capacity per Day");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("Please Enter Line Efficiency of Factory");
                    edit2.requestFocus();
                    return;
                }
                if(string3.equals("")){

                    edit3.setError("Please Enter Garment SAM or SMV");
                    edit3.requestFocus();
                    return;
                }


                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());


                float btn_calculation1=edt1*edt2*60;
                float btn_calculation2=edt3*100;
                float btn_calculation3=btn_calculation1/btn_calculation2;


                tex1.setText(Float.toString((float) btn_calculation3));


            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                tex1.setText("");

            }
        });

    }
}
