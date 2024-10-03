package com.atozmediaapk.textilefocus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class YarnCount extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    TextView textView;
    private double view;
    double view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yarn_count);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ed1=findViewById(R.id.weight1id);
        sp1=findViewById(R.id.fromid);
        sp2=findViewById(R.id.toid);
        b1=findViewById(R.id.btnw);
        textView=(TextView) findViewById(R.id.t1);


        String[] from={"Cotton Count","Denier","Worsted Count","Wool Count","Linan Lea","Woolen Cut","Woolen Run","Jute Count","Metric Count","Grains/120 yards","Tex"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Cotton Count","Denier","Worsted Count","Wool Count","Linan Lea","Woolen Cut","Woolen Run","Jute Count","Metric Count","Grains/120 yards","Tex"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 5315/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount*1.50;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*52.5;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount*2.80;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount*2.80;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount*0.525;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 17.14/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount*1.693;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 1000/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Cotton Count" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = 590.5/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }







                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = 5315/amount;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = 7972/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = 279030/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = 14880/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = 14880/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = 2800/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = amount/0.003225;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = 9000/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = amount*0.1881;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Denier" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = amount*0.1111;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount/1.50;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 7972/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*35.0;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount*1.867;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount*1.867;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount*0.350;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 25.71/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount*1.129;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 1500/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Worsted Count" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = 885.8/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }







                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount/52.50;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 279030/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount*35.0;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount/18.75;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount/18.75;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount/100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 900/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount/31.0;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 30975/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Wool Count" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = 30975/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount/2.80;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 14880/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount/1.867;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*18.75;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount*18.75;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount/5.33;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 48.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount/0.605;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 2800/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Linan Lea" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = 1654/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount/2.80;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 14880/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount/1.867;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*18.75;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount*18.75;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount/5.33;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 48.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount*0.605;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 2800/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Cut" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = 1654/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount/0.525;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 2800/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount/0.350;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*100;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount*5.33;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount*5.33;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 9.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount/0.31;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 525.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Woolen Run" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot =310.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = 17.14/amount;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = amount*310;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = 25.71/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = 900/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = 48.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = 48.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = 9.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = 29.03/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = amount*85.33;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Jute Count" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = amount*34.45;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }



                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = amount*0.5905;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = 9000/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = amount/1.129;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = amount*31.0;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = amount/0.605;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = amount/0.605;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = amount/0.310;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = 29.03/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = 1693/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Metric Count" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = 1000/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot = 1000/amount;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = amount/0.1881;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot =1500/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = 52500/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = 2800/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = 2800/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = 525.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = amount/58.33;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot = 1693/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Grains/120 yards" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = amount/0.5905;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Cotton Count")
                    {
                        tot =590.5/amount;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Denier")
                    {
                        tot = amount/0.1111;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Worsted Count")
                    {
                        tot = 885.8/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Wool Count")
                    {
                        tot = 31000/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Linan Lea")
                    {
                        tot = 1654/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Woolen Cut")
                    {
                        tot = 1654/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Woolen Run")
                    {
                        tot = 310.0/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Jute Count")
                    {
                        tot = amount/34.45;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Metric Count")
                    {
                        tot =1000/amount;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Grains/120 yards")
                    {
                        tot = amount/0.5905;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Tex" && sp2.getSelectedItem().toString()=="Tex")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }



                }catch (Exception e){

                    Toast.makeText(YarnCount.this,"Please enter Yarn Count",Toast.LENGTH_LONG).show();


                }

            }
        });

    }
}