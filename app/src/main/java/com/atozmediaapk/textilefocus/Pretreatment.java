package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class Pretreatment extends AppCompatActivity {

    //ViewFlipper v_flipper;
    ImageView imageView;

    ListView listView2,listView3,listView4,listView5,listView6,listView7,listView8,listView9,listView10,listView11;
    String [] listviewitems2=new String[]{"1. GSM & GLM CALCULATOR"};
    String [] listviewitems3=new String[]{"2. SCOURING & BLEACHIN STANDER RECIPE"};
    String [] listviewitems4=new String[]{"3. PICKUP %"};
    String [] listviewitems5=new String[]{"4. Caustic Baume Calculator"};
    String [] listviewitems6=new String[]{"5. Singeing M/C Prameter"};
    String [] listviewitems7=new String[]{"6. Caustic To Fabrics Meter"};
    String [] listviewitems8=new String[]{"7. QUALITY CHECK"};
    String [] listviewitems9=new String[]{"8. H2O2 TITRATION"};
    String [] listviewitems10=new String[]{"9. NaOH TITRATION"};
    String [] listviewitems11=new String[]{"10. Pretreatment Consumption"};

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pretreatment);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imageView= findViewById(R.id.preimage);
        TextView textView=findViewById(R.id.pretext);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("preimage");
        DatabaseReference myRef1 = database.getReference("pretext");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(imageView);
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });

        myRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String t=dataSnapshot.getValue(String.class);
                textView.setText(t);
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });



        /*FirebaseDatabase.getInstance().getReference().child("Use")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                    {
                        for(DataSnapshot data:dataSnapshot.getChildren()) {
                            String value =String.valueOf(data.child("image").getValue());
                            Picasso.get().load(value).into(imageView);
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });*/




        /*int images[]= {R.drawable.bleach,R.drawable.osthoffim,R.drawable.lab,R.drawable.mercerizingim1};
        v_flipper=findViewById(R.id.flipper);
        for (int i=0;i<images.length;i++){
            flipperImages(images[i]);
            for (int image: images){
                flipperImages(image);
            }
        }*/


        listView2 =  findViewById(R.id.list2);
        listView3 =  findViewById(R.id.list3);
        listView4 =  findViewById(R.id.list4);
        listView5 =  findViewById(R.id.list5);
        listView6 = findViewById(R.id.list6);
        listView7 =  findViewById(R.id.list7);
        listView8 =  findViewById(R.id.list8);
        listView9 =  findViewById(R.id.list9);
        listView10 =  findViewById(R.id.list10);
        listView11 =  findViewById(R.id.list11);


        ArrayAdapter<String> adapter2= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems2[position];
            Intent intent2=new Intent(Pretreatment.this,GsmGlm.class);
            intent2.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent2);
        });

        ArrayAdapter<String>adapter3= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems3[position];
            Intent intent3=new Intent(Pretreatment.this,BleachingRecipe.class);
            intent3.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent3);
        });

        ArrayAdapter<String>adapter4= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems4);
        listView4.setAdapter(adapter4);
        listView4.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems4[position];
            Intent intent4=new Intent(Pretreatment.this,PickUp.class);
            intent4.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent4);
        });

        ArrayAdapter<String>adapter5= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems5);
        listView5.setAdapter(adapter5);
        listView5.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems5[position];
            Intent intent5=new Intent(Pretreatment.this,CausticBaume.class);
            intent5.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent5);
        });

        ArrayAdapter<String>adapter6= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems6);
        listView6.setAdapter(adapter6);
        listView6.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems6[position];
            Intent intent6=new Intent(Pretreatment.this,Singeing.class);
            intent6.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent6);
        });

        ArrayAdapter<String>adapter7= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems7);
        listView7.setAdapter(adapter7);
        listView7.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems7[position];
            Intent intent7=new Intent(Pretreatment.this,Natomtr.class);
            intent7.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent7);
        });



        ArrayAdapter<String>adapter8= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems8);
        listView8.setAdapter(adapter8);
        listView8.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems8[position];
            Intent intent8=new Intent(Pretreatment.this,Quality.class);
            intent8.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent8);
        });

        ArrayAdapter<String>adapter9= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems9);
        listView9.setAdapter(adapter9);
        listView9.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems9[position];
            Intent intent9=new Intent(Pretreatment.this,HydrogenTitrate.class);
            intent9.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent9);
        });

        ArrayAdapter<String>adapter10= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems10);
        listView10.setAdapter(adapter10);
        listView10.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems10[position];
            Intent intent10=new Intent(Pretreatment.this,CausticTitrate.class);
            intent10.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent10);
        });


        ArrayAdapter<String>adapter11= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems11);
        listView11.setAdapter(adapter11);
        listView11.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems11[position];
            Intent intent11=new Intent(Pretreatment.this,PreConsumption.class);
            intent11.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent11);
        });

    }

   /* private void showCustomDialog() {
        final Dialog dialog= new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);

        dialog.setCancelable(true);

        WindowManager.LayoutParams lp= new WindowManager.LayoutParams();

        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width= WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height=WindowManager.LayoutParams.WRAP_CONTENT;

        dialog.show();
        dialog.getWindow().setAttributes(lp);

    }*/


    /*public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(5000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }*/
}

