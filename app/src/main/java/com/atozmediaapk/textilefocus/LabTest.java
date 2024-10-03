package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class LabTest extends AppCompatActivity {
    TextView textView1;
    SearchView searchView;
    ImageView imageView;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textView1=findViewById(R.id.textviewid1);
        searchView=findViewById(R.id.search);
        ListView listView = findViewById(R.id.list);
        List<String> list = new ArrayList<>();


        list.add("Molarity,Normality & Their Relation");
        list.add("Sulfuric Acid(H2SO4)");
        list.add("Hydrochloric Acid(HCl)");
        list.add("Acetic Acid(CH3COOH) ");
        list.add("Oxalic acid(COOH)2");
        list.add("Citric Acid(C6H6O7)");
        list.add("Boric Acid(H3BO3)");
        list.add("Lactic Acid(C3H6O3)");
        list.add("Phosphoric acid(H3PO4)");
        list.add("Hydogen Peroxide(H2O2)");
        list.add("Sodium Hydoxide(NaOH)");
        list.add("Sodium Bicarbonate(NaHCO3)");
        list.add("Soda Ash(Na2CO3)");
        list.add("Sodium Sulphate(Na2SO4)");
        list.add("Sodium Thiosulphate(Na2S2O3)");
        list.add("Sodium silicate(Na2SiO3)");
        list.add("Sodium dithionite(Na2S2O3)");
        list.add("Sodium Chloride(NaCl)");
        list.add("Water Hardness Test");
        list.add("Formaldehyde Content Test(CH2O)");
        list.add("ETP Water Test Manual");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position==0){
                textView1.setText(R.string.molarity_normality);

                //startActivity(new Intent(LabTest.this,Dyeing.class));

            }else if (position==1){
                //startActivity(new Intent(LabTest.this,Molarity.class));
                textView1.setText(R.string.sulfuric_acid);
            }else if(position==2) {
                textView1.setText(R.string.hydrocloric_avid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==3) {
                textView1.setText(R.string.acitic_acid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==4) {
                textView1.setText(R.string.oxalic_acid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==5) {
                textView1.setText(R.string.citricacid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==6) {
                textView1.setText(R.string.boricacid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==7) {
                textView1.setText(R.string.lacticacid);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==8) {
                textView1.setText(R.string.phosphoric);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==9) {
                textView1.setText(R.string.hydrogenperoxide);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==10) {
                textView1.setText(R.string.sodiumhydro);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==11) {
                textView1.setText(R.string.sodiumbi);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==12) {
                textView1.setText(R.string.sodaash);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==13) {
                textView1.setText(R.string.sodiumsulphet);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==14) {
                textView1.setText(R.string.sodiumthio);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==15) {
                textView1.setText(R.string.sodiumslicate);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==16) {
                textView1.setText(R.string.sodiumdi);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==17) {
                textView1.setText(R.string.sodiumcloride);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==18) {
                textView1.setText(R.string.waterheardness);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==19) {
                textView1.setText(R.string.formaldihide);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }else if(position==20) {
                textView1.setText(R.string.etpwatertest);
                //startActivity(new Intent(LabTest.this,Dyeing.class));
            }
        });




    }
}