package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
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

public class Weaving extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    //ViewFlipper v_flipper;
    ImageView imageView;

    ListView listView2,listView3,listView4,listView5,listView6,listView7,listView8,listView9,listView10,listView11,listView12,listView18,listView19,listView20,listView21,listView22,listView23,listView24,listView25,listView26,listView27,listView28,listView29,listView30,listView31,listView32;
    String [] listviewitems2=new String[]{"1. Reed Count"};
    String [] listviewitems3=new String[]{"2. Reed Width"};
    String [] listviewitems4=new String[]{"3. Crimp Percentage Length"};
    String [] listviewitems5=new String[]{"4. Crimp Percentage Width"};
    String [] listviewitems6=new String[]{"5. Warp Cover Factor"};
    String [] listviewitems7=new String[]{"6. Weft Cover Factor"};
    String [] listviewitems8=new String[]{"7. Cloth Cover Factor"};
    String [] listviewitems9=new String[]{"8. Maximum EPI for particular count for Plain Fabrics"};
    String [] listviewitems10=new String[]{"9. Maximum EPI for particular count for Drill Fabrics"};
    String [] listviewitems11=new String[]{"10. Maximum EPI for particular count for Sateen Fabrics"};
    String [] listviewitems12=new String[]{"11. Maximum EPI for particular count for Other Design"};
    String [] listviewitems18=new String[]{"17. Warp weight in grams /metre"};
    String [] listviewitems19=new String[]{"18. Weft weight in grams /metre "};
    String [] listviewitems20=new String[]{"19. Cloth length in metres"};
    String [] listviewitems21=new String[]{"20. Loom Speed"};
    String [] listviewitems22=new String[]{"21. Loom Effeciency Percentage"};
    String [] listviewitems23=new String[]{"22. Moisture Regain Percentage"};
    String [] listviewitems24=new String[]{"23. Moistue Content Percentage"};
    String [] listviewitems25=new String[]{"24. Warp Weight in Kg"};
    String [] listviewitems26=new String[]{"25. Weft Weight in Kg"};
    String [] listviewitems27=new String[]{"26. Cloth weight in GSM"};
    String [] listviewitems28=new String[]{"27. oz (ounce ) per sq. yard"};
    String [] listviewitems29=new String[]{"28. To calculate the length of any rolled fabrics"};
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weaving);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/


        imageView=(ImageView) findViewById(R.id.preimage);
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
        listView12 =  findViewById(R.id.list12);
        listView18 =  findViewById(R.id.list18);
        listView19 =  findViewById(R.id.list19);
        listView20 =  findViewById(R.id.list20);
        listView21 =  findViewById(R.id.list21);
        listView22 =  findViewById(R.id.list22);
        listView23 =  findViewById(R.id.list23);
        listView24 =  findViewById(R.id.list24);
        listView25 =  findViewById(R.id.list25);
        listView26 =  findViewById(R.id.list26);
        listView27 =  findViewById(R.id.list27);
        listView28 =  findViewById(R.id.list28);
        listView29 =  findViewById(R.id.list29);




        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems2[position].toString();
                Intent intent2=new Intent(Weaving.this,Reed_Count.class);
                intent2.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent2);
            }
        });

        ArrayAdapter<String>adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems3[position].toString();
                Intent intent3=new Intent(Weaving.this,Reed_Width.class);
                intent3.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent3);
            }
        });

        ArrayAdapter<String>adapter4=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems4);
        listView4.setAdapter(adapter4);
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems4[position].toString();
                Intent intent4=new Intent(Weaving.this,Crimp_Percent_length.class);
                intent4.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent4);
            }
        });

        ArrayAdapter<String>adapter5=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems5);
        listView5.setAdapter(adapter5);
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems5[position].toString();
                Intent intent5=new Intent(Weaving.this,Crimp_Percent_width.class);
                intent5.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent5);
            }
        });

        ArrayAdapter<String>adapter6=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems6);
        listView6.setAdapter(adapter6);
        listView6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems6[position].toString();
                Intent intent6=new Intent(Weaving.this,Warp_Cover_Factor.class);
                intent6.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent6);
            }
        });

        ArrayAdapter<String>adapter7=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems7);
        listView7.setAdapter(adapter7);
        listView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems7[position];
                Intent intent7=new Intent(Weaving.this,Weft_Cover_Factor.class);
                intent7.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent7);
            }
        });



        ArrayAdapter<String>adapter8=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems8);
        listView8.setAdapter(adapter8);
        listView8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems8[position];
                Intent intent8=new Intent(Weaving.this,Cloth_Cover_Factor.class);
                intent8.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent8);
            }
        });

        ArrayAdapter<String>adapter9=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems9);
        listView9.setAdapter(adapter9);
        listView9.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems9[position];
            Intent intent9=new Intent(Weaving.this,Plain_Fab.class);
            intent9.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent9);
        });
        ArrayAdapter<String>adapter10=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems10);
        listView10.setAdapter(adapter10);
        listView10.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview=listviewitems10[position].toString();
            Intent intent10=new Intent(Weaving.this,Drill_Fabrics.class);
            intent10.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent10);
        });


        ArrayAdapter<String>adapter11=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems11);
        listView11.setAdapter(adapter11);
        listView11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems11[position].toString();
                Intent intent11=new Intent(Weaving.this,Sateen_Fab.class);
                intent11.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent11);
            }
        });
        ArrayAdapter<String>adapter12=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems12);
        listView12.setAdapter(adapter12);
        listView12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems12[position].toString();
                Intent intent12=new Intent(Weaving.this,Other_Design.class);
                intent12.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent12);
            }
        });

        ArrayAdapter<String>adapter18=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems18);
        listView18.setAdapter(adapter18);
        listView18.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems18[position].toString();
                Intent intent18=new Intent(Weaving.this,Warp_Weight.class);
                intent18.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent18);
            }
        });
        ArrayAdapter<String>adapter19=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems19);
        listView19.setAdapter(adapter19);
        listView19.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems19[position].toString();
                Intent intent19=new Intent(Weaving.this,Weft_Weight.class);
                intent19.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent19);
            }
        });
        ArrayAdapter<String>adapter20=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems20);
        listView20.setAdapter(adapter20);
        listView20.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems20[position].toString();
                Intent intent20=new Intent(Weaving.this,Cloth_length_in_mtr.class);
                intent20.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent20);
            }
        });
        ArrayAdapter<String>adapter21=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems21);
        listView21.setAdapter(adapter21);
        listView21.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems21[position].toString();
                Intent intent21=new Intent(Weaving.this,Loom_Speed.class);
                intent21.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent21);
            }
        });
        ArrayAdapter<String>adapter22=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems22);
        listView22.setAdapter(adapter22);
        listView22.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems22[position].toString();
                Intent intent22=new Intent(Weaving.this,Loom_Efee.class);
                intent22.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent22);
            }
        });
        ArrayAdapter<String>adapter23=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems23);
        listView23.setAdapter(adapter23);
        listView23.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems23[position].toString();
                Intent intent23=new Intent(Weaving.this,Moisture_Regain.class);
                intent23.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent23);
            }
        });
        ArrayAdapter<String>adapter24=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems24);
        listView24.setAdapter(adapter24);
        listView24.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems24[position].toString();
                Intent intent24=new Intent(Weaving.this,Moisture_content.class);
                intent24.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent24);
            }
        });
        ArrayAdapter<String>adapter25=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems25);
        listView25.setAdapter(adapter25);
        listView25.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems25[position].toString();
                Intent intent25=new Intent(Weaving.this,Warp_weight_kg.class);
                intent25.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent25);
            }
        });
        ArrayAdapter<String>adapter26=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems26);
        listView26.setAdapter(adapter26);
        listView26.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems26[position].toString();
                Intent intent26=new Intent(Weaving.this,Weft_weight_kg.class);
                intent26.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent26);
            }
        });
        ArrayAdapter<String>adapter27=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems27);
        listView27.setAdapter(adapter27);
        listView27.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems27[position].toString();
                Intent intent27=new Intent(Weaving.this,Fabric_in_GSM.class);
                intent27.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent27);
            }
        });
        ArrayAdapter<String>adapter28=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems28);
        listView28.setAdapter(adapter28);
        listView28.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems28[position].toString();
                Intent intent28=new Intent(Weaving.this,Squreyds.class);
                intent28.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent28);
            }
        });
        ArrayAdapter<String>adapter29=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems29);
        listView29.setAdapter(adapter29);
        listView29.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems29[position].toString();
                Intent intent29=new Intent(Weaving.this,Rolled_Fab.class);
                intent29.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent29);
            }
        });

    }

    /*private void loadAd() {

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-7027345196988376/5436345617", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                Log.d(TAG, "Ad was clicked.");
                                finish();
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                Log.d(TAG, "Ad dismissed fullscreen content.");
                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                Log.e(TAG, "Ad failed to show fullscreen content.");
                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdImpression() {
                                Log.d(TAG, "Ad recorded an impression.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                Log.d(TAG, "Ad showed fullscreen content.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });

    }


    @Override
    public void finish() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
            super.finish();
        }

    }*/


}

