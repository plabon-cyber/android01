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

public class Dyeing extends AppCompatActivity {
    ImageView imageView;

    //ViewFlipper v_flipper;

    ListView listView1,listView2,listView3,listView03,listView4,listView5,listView6,listView7,listView8;
    String [] listviewitems1=new String[]{"1. GSM & GLM CALCULATOR"};
    String [] listviewitems2=new String[]{"2. PICKUP %"};
    String [] listviewitems3=new String[]{"3. Caustic Baume Calculator"};
    String [] listviewitems03=new String[]{"4. Cold Pad Batch (CPB) Dyeing Machine"};
    String [] listviewitems4=new String[]{"5. Different Type of Dyes with Chemical Structure"};
    String [] listviewitems5=new String[]{"6. Thermosol Dyeing Machine"};
    String [] listviewitems6=new String[]{"7. Pad Steam Dyeing Machine"};
    String [] listviewitems7=new String[]{"8. Pantone Color Book"};
    String [] listviewitems8=new String[]{"9. Elongation Percent & Shrinkage Percent"};



    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyeing);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        /*TextView textView=findViewById(R.id.texscouring);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);*/

        imageView= findViewById(R.id.preimage);
        TextView textView=findViewById(R.id.pretext);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("dyeimage");
        DatabaseReference myRef1 = database.getReference("dyetext");

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





        /*int images[]= {R.drawable.bleach,R.drawable.osthoffim,R.drawable.lab,R.drawable.mercerizingim1};
        v_flipper=findViewById(R.id.flipper);
        for (int i=0;i<images.length;i++){
            flipperImages(images[i]);

            for (int image: images){
                flipperImages(image);
            }

        }*/


        listView1 =  findViewById(R.id.list1);
        listView2 =  findViewById(R.id.list2);
        listView3 =  findViewById(R.id.list3);
        listView03 =  findViewById(R.id.list03);
        listView4 =  findViewById(R.id.list4);
        listView5 =  findViewById(R.id.list5);
        listView6 =  findViewById(R.id.list6);
        listView7 =  findViewById(R.id.list7);
        listView8 =  findViewById(R.id.list8);



        ArrayAdapter<String> adapter1= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems1);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems1[position];
            Intent intent1=new Intent(Dyeing.this,GsmGlm.class);
            intent1.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent1);
        });



        ArrayAdapter<String> adapter2= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems2[position];
            Intent intent2=new Intent(Dyeing.this,PickUp.class);
            intent2.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent2);
        });


        ArrayAdapter<String> adapter3= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems3[position];
            Intent intent3=new Intent(Dyeing.this,CausticBaume.class);
            intent3.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent3);
        });


        ArrayAdapter<String> adapter03= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems03);
        listView03.setAdapter(adapter03);
        listView03.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems03[position];
            Intent intent03=new Intent(Dyeing.this,CPB.class);
            intent03.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent03);
        });

        ArrayAdapter<String>adapter4= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems4);
        listView4.setAdapter(adapter4);
        listView4.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems4[position];
            Intent intent4=new Intent(Dyeing.this,Dyeing_Calculation.class);
            intent4.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent4);
        });

        ArrayAdapter<String>adapter5= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems5);
        listView5.setAdapter(adapter5);
        listView5.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems5[position];
            Intent intent5=new Intent(Dyeing.this,Termosul.class);
            intent5.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent5);
        });

        ArrayAdapter<String>adapter6= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems6);
        listView6.setAdapter(adapter6);
        listView6.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems6[position];
            Intent intent6=new Intent(Dyeing.this,Pad_Steam.class);
            intent6.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent6);
        });



        ArrayAdapter<String>adapter7= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems7);
        listView7.setAdapter(adapter7);
        listView7.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems7[position];
            Intent intent7=new Intent(Dyeing.this,ColorCode.class);
            intent7.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent7);
        });

        ArrayAdapter<String>adapter8= new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, listviewitems8);
        listView8.setAdapter(adapter8);
        listView8.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems8[position];
            Intent intent8=new Intent(Dyeing.this,Elengation.class);
            intent8.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent8);
        });


    }


   /* public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(5000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }*/
}

