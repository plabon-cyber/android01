package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerShiftProductionthree extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_shift_productionthree);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView tex1 ,tex2,tex3,tex4;
        final EditText edit1,edit2,edit3,edit4,edit5,edit6,edit8,edit9;
        Button BTN, btnRest;



        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);
        tex3 =  findViewById(R.id.tex03ID);
        tex4 =  findViewById(R.id.tex04ID);

        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3 = findViewById(R.id.edit03ID);
        edit4 = findViewById(R.id.edit04ID);
        edit5 = findViewById(R.id.edit05ID);
        edit6 = findViewById(R.id.edit06ID);

        edit8 = findViewById(R.id.edit08ID);
        edit9 = findViewById(R.id.edit09ID);
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
                String string6=edit6.getText().toString();

                String string8=edit8.getText().toString();
                String string9=edit9.getText().toString();




                if(string1.equals("")){

                    edit1.setError("rpm");
                    edit1.requestFocus();
                    return;
                }

                if(string2.equals("")){

                    edit2.setError("number");
                    edit2.requestFocus();
                    return;
                }
                if(string3.equals("")){

                    edit3.setError("cm");
                    edit3.requestFocus();
                    return;
                }
                if(string4.equals("")){

                    edit4.setError("gauge");
                    edit4.requestFocus();
                    return;
                }
                if(string5.equals("")){

                    edit5.setError("cm");
                    edit5.requestFocus();
                    return;
                }
                if(string6.equals("")){

                    edit6.setError("%");
                    edit6.requestFocus();
                    return;
                }

                if(string8.equals("")){

                    edit8.setError("cm");
                    edit8.requestFocus();
                    return;
                }
                if(string9.equals("")){

                    edit9.setError("sq.mtr");
                    edit9.requestFocus();
                    return;
                }









                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());
                float edt5 = Float.parseFloat(edit5.getText().toString());
                float edt6 = Float.parseFloat(edit6.getText().toString());

                float edt8 = Float.parseFloat(edit8.getText().toString());
                float edt9 = Float.parseFloat(edit9.getText().toString());


                //production mtr/8hour
                double btn_calculation1 =  edt1*edt2*60*8;
                float btn_calculation2=(float) edt8*100;
                float btn_calculation3=(float) edt6/100;
                float btn_calculation4=(float) btn_calculation1/btn_calculation2;
                float btn_calculation5=(float)btn_calculation3*btn_calculation4;
                //production fabric open width with mtr
                float btn_calculation6=(float) 3.1415*edt3*edt4;
                float btn_calculation7=(float) btn_calculation6/edt5;
                float btn_calculation8=(float) btn_calculation7/100;
                //kgs/8hour
                float btn_calculation9=(float) btn_calculation5*btn_calculation7*edt9;
                float btn_calculation10=(float) btn_calculation9/1000;

                tex1.setText(Float.toString((float) btn_calculation5));
                tex2.setText(Float.toString((float) btn_calculation8));
                tex3.setText(Float.toString((float) btn_calculation10));
                tex4.setText("Kg/8 hour");




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
                edit8.setText("");
                edit9.setText("");

                tex1.setText("");
                tex2.setText("");
                tex3.setText("");
                tex4.setText("");



            }
        });

    }
}

