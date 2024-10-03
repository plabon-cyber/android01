package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Printing extends AppCompatActivity {
   /* private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/
    /*ImageView imageView;



    ListView listView1,listView2,listView3,listView03,listView4,listView5,listView6,listView7,listView8;
    String [] listviewitems1=new String[]{"1. GSM & GLM CALCULATOR"};
    String [] listviewitems2=new String[]{"2. PICKUP %"};
    String [] listviewitems3=new String[]{"3. Caustic Baume Calculator"};
    String [] listviewitems03=new String[]{"4. Various Dyeing Machine Prameter"};
    String [] listviewitems4=new String[]{"5. Different Type of Dyes with Chemical Structure"};
    String [] listviewitems5=new String[]{"6. Amount Of Dye"};
    String [] listviewitems6=new String[]{"7. Soda Ash Calculation"};
    String [] listviewitems7=new String[]{"8. Pantone Color Book"};
    String [] listviewitems8=new String[]{"9. Elongation Percent & Shrinkage Percent"};*/


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printing);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




       /* imageView= findViewById(R.id.preimage);
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





        listView1 =  findViewById(R.id.list1);
        listView2 =  findViewById(R.id.list2);
        listView3 =  findViewById(R.id.list3);
        listView03 =  findViewById(R.id.list03);
        listView4 =  findViewById(R.id.list4);
        listView5 =  findViewById(R.id.list5);
        listView6 =  findViewById(R.id.list6);
        listView7 =  findViewById(R.id.list7);
        listView8 =  findViewById(R.id.list8);



        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems1);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems1[position];
                Intent intent1=new Intent(Printing.this,GsmGlm.class);
                intent1.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent1);
            }
        });



        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems2[position];
                Intent intent2=new Intent(Printing.this,CPB.class);
                intent2.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent2);
            }
        });


        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems3[position];
                Intent intent3=new Intent(Printing.this,Termosul.class);
                intent3.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent3);
            }
        });


        ArrayAdapter<String> adapter03=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems03);
        listView03.setAdapter(adapter03);
        listView03.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems03[position];
                Intent intent03=new Intent(Printing.this,Pad_Steam.class);
                intent03.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent03);
            }
        });

        ArrayAdapter<String>adapter4=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems4);
        listView4.setAdapter(adapter4);
        listView4.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview=listviewitems4[position].toString();
            Intent intent4=new Intent(Printing.this,Dyeing_Calculation.class);
            intent4.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent4);
        });

        ArrayAdapter<String>adapter5=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems5);
        listView5.setAdapter(adapter5);
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems5[position];
                Intent intent5=new Intent(Printing.this,Dye_Calculation.class);
                intent5.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent5);
            }
        });

        ArrayAdapter<String>adapter6=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems6);
        listView6.setAdapter(adapter6);
        listView6.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems6[position];
            Intent intent6=new Intent(Printing.this,Auxiliarise.class);
            intent6.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent6);
        });



        ArrayAdapter<String>adapter7=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems7);
        listView7.setAdapter(adapter7);
        listView7.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview=listviewitems7[position].toString();
            Intent intent7=new Intent(Printing.this,ColorCode.class);
            intent7.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent7);
        });

        ArrayAdapter<String>adapter8=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems8);
        listView8.setAdapter(adapter8);
        listView8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems8[position].toString();
                Intent intent8=new Intent(Printing.this,Elengation.class);
                intent8.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent8);
            }
        });*/







       /* MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/


    }

   /* private void loadAd() {

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
    }*/


   /* @Override
    public void finish() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
            super.finish();
        }

    }*/
}