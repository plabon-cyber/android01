package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class T_Shirt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1,tex2,tex3 ;
        final EditText edit1,edit2,edit3,edit4,edit5,edit6;
        Button BTN, btnRest;


        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        tex3=   findViewById(R.id.texview2);
        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3= findViewById(R.id.edit03ID);
        edit4=  findViewById(R.id.edit04ID);
        edit5=  findViewById(R.id.edit05ID);
        edit6=findViewById(R.id.edit06ID);
        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);



        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string3=edit3.getText().toString();
                String string4=edit4.getText().toString();
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();
                String string5=edit5.getText().toString();
                String string6=edit6.getText().toString();




                if(string1.equals("")){

                    edit1.setError("Please Enter Length");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("Please Enter Width");
                    edit2.requestFocus();
                    return;
                }

                if(string3.equals("")){

                    edit3.setError("Please Enter Sleeve Length");
                    edit3.requestFocus();
                    return;
                }

                if(string4.equals("")){

                    edit4.setError("Please Enter Full Arm Hole");
                    edit4.requestFocus();
                    return;
                }



                if(string5.equals("")){

                    edit5.setError("Please Enter GSM");
                    edit5.requestFocus();
                    return;
                }
                if(string6.equals("")){

                    edit6.setError("Please Enter Number");
                    edit6.requestFocus();
                    return;
                }





                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());
                float edt5 = Float.parseFloat(edit5.getText().toString());
                float edt6= Float.parseFloat(edit6.getText().toString());



                double btn_calculation1 =  edt1*edt2*2;
                double btn_calculation2 = edt3*edt4*2;
                double btn_calculation3 = btn_calculation1+btn_calculation2;
                double btn_calculation4 = btn_calculation3/10000;
                double btn_calculation5=edt5/1000;
                double btn_calculation6= btn_calculation4*btn_calculation5;
                double btn_calculation7= btn_calculation6*103;
                float btn_calculation8=(float) btn_calculation7/100;
                float btn_calculation9 =(float) btn_calculation8*edt6;
                float btn_calculation10=edt6;


                tex1.setText(Float.toString(btn_calculation8));
                tex2.setText(Float.toString(btn_calculation9));
                tex3.setText(Float.toString(btn_calculation10));


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
                tex2.setText("");
                tex3.setText("");
            }
        });

    }
}

