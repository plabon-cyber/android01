package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ComberProduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comber_production2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1,tex2,tex3 ;
        final EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7;
        Button BTN, btnRest,btnhome;


        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        //tex3=   findViewById(R.id.texview2);
        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3= findViewById(R.id.edit03ID);
        edit4=  findViewById(R.id.edit04ID);
        edit5=  findViewById(R.id.edit05ID);
        edit6=findViewById(R.id.edit06ID);
        edit7= findViewById(R.id.edit07ID);
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
                String string7=edit7.getText().toString();



                if(string1.equals("")){

                    edit1.setError("Please Enter Nips/Min");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("Please Enter Feed/Nips");
                    edit2.requestFocus();
                    return;
                }

                if(string3.equals("")){

                    edit3.setError("Please Enter No.Ofhead");
                    edit3.requestFocus();
                    return;
                }

                if(string4.equals("")){

                    edit4.setError("Please Enter Noil %");
                    edit4.requestFocus();
                    return;
                }



                if(string5.equals("")){

                    edit5.setError("Please Enter Lap wt.");
                    edit5.requestFocus();
                    return;
                }
                if(string6.equals("")){

                    edit6.setError("Please Enter Efficincy");
                    edit6.requestFocus();
                    return;
                }
                if(string7.equals("")){

                    edit7.setError("Please Enter Batt Tension");
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


                float btn_calculation1 =  edt1*edt2*edt3*edt4*edt5*edt6*edt7*60*8;
                float btn_calculation2 =  1000*1000;
                float btn_calculation3 =  btn_calculation1/btn_calculation2;
                float btn_calculation4 =  btn_calculation3/8;


                tex1.setText(Float.toString(btn_calculation4));
                tex2.setText(Float.toString(btn_calculation3));


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
            }
        });

    }
}

