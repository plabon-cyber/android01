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

public class Inspection extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/
    ImageView imageView;



    ListView listView1,listView2,listView3,listView03,listView4,listView5,listView6,listView7,listView8,
            listView9,listView10,listView11,listView12,listView13,listView14,listView15,listView16,listView17,listView18;
    String [] listviewitems1=new String[]{"1. Relation between count and GSM"};
    String [] listviewitems2=new String[]{"2. 4 Point System Calculation"};
    String [] listviewitems3=new String[]{"3. Fabric Major Defects "};
    String [] listviewitems03=new String[]{"4. Various Defect for Quality Control"};
    String [] listviewitems4=new String[]{"5. Woven Fabric GSM and GLM"};
    String [] listviewitems5=new String[]{"6. Sewing Control Technique"};
    String [] listviewitems6=new String[]{"7. Stitch Per 3CM. According to Machine Type"};
    String [] listviewitems7=new String[]{"8. Quality Management for Production"};
    String [] listviewitems8=new String[]{"9. Quality Management"};
    String [] listviewitems9=new String[]{"10. Quality Management System in Garment Industry"};
    String [] listviewitems10=new String[]{"11. Quality for Export Garment"};
    String [] listviewitems11=new String[]{"12. Quality Level of a Garment"};
    String [] listviewitems12=new String[]{"13. Garment Quality"};
    String [] listviewitems13=new String[]{"14. Testing Quality"};
    String [] listviewitems14=new String[]{"15. Packaging Quality"};
    String [] listviewitems15=new String[]{"16. Quality Policy"};
    String [] listviewitems16=new String[]{"17. Guidelines to In-Line Quality Inspection"};
    String [] listviewitems17=new String[]{"18. Guidelines to Table Quality Inspection"};
    String [] listviewitems18=new String[]{"19. Quality Control Advise"};




    @SuppressLint({"SourceLockedOrientationActivity", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspection);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);





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





        listView1 =  findViewById(R.id.list1);
        listView2 =  findViewById(R.id.list2);
        listView3 =  findViewById(R.id.list3);
        listView03 =  findViewById(R.id.list03);
        listView4 =  findViewById(R.id.list4);
        listView5 =  findViewById(R.id.list5);
        listView6 =  findViewById(R.id.list6);
        listView7 =  findViewById(R.id.list7);
        listView8 =  findViewById(R.id.list8);
        listView9 =  findViewById(R.id.list9);
        listView10 =  findViewById(R.id.list10);
        listView11 =  findViewById(R.id.list11);
        listView12 =  findViewById(R.id.list12);
        listView13 =  findViewById(R.id.list13);
        listView14 =  findViewById(R.id.list14);
        listView15 =  findViewById(R.id.list15);
        listView16 =  findViewById(R.id.list16);
        listView17 =  findViewById(R.id.list17);
        listView18 =  findViewById(R.id.list18);



        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems1);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems1[position];
                Intent intent1=new Intent(Inspection.this,CountGsm.class);
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
                Intent intent2=new Intent(Inspection.this,InspectionCalculation.class);
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
                Intent intent3=new Intent(Inspection.this,Various_Defect.class);
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
                Intent intent03=new Intent(Inspection.this,SewingDefect.class);
                intent03.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent03);
            }
        });

        ArrayAdapter<String>adapter4=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems4);
        listView4.setAdapter(adapter4);
        listView4.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview=listviewitems4[position].toString();
            Intent intent4=new Intent(Inspection.this,GsmGlm.class);
            intent4.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent4);
        });

        ArrayAdapter<String>adapter5=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems5);
        listView5.setAdapter(adapter5);
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview= listviewitems5[position];
                Intent intent5=new Intent(Inspection.this,SewingControlTec.class);
                intent5.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent5);
            }
        });

        ArrayAdapter<String>adapter6=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems6);
        listView6.setAdapter(adapter6);
        listView6.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems6[position];
            Intent intent6=new Intent(Inspection.this,StitchMachineType.class);
            intent6.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent6);
        });



        ArrayAdapter<String>adapter7=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems7);
        listView7.setAdapter(adapter7);
        listView7.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview=listviewitems7[position].toString();
            Intent intent7=new Intent(Inspection.this,QualityManagement.class);
            intent7.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent7);
        });

        ArrayAdapter<String>adapter8=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems8);
        listView8.setAdapter(adapter8);
        listView8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems8[position].toString();
                Intent intent8=new Intent(Inspection.this,Quality_Management_quality.class);
                intent8.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent8);
            }
        });

        ArrayAdapter<String>adapter9=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems9);
        listView9.setAdapter(adapter9);
        listView9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems9[position].toString();
                Intent intent9=new Intent(Inspection.this,Quality_Management_System.class);
                intent9.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent9);
            }
        });

        ArrayAdapter<String>adapter10=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems10);
        listView10.setAdapter(adapter10);
        listView10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems10[position].toString();
                Intent intent10=new Intent(Inspection.this,Quality_for_Export_Garment.class);
                intent10.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent10);
            }
        });

        ArrayAdapter<String>adapter11=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems11);
        listView11.setAdapter(adapter11);
        listView11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems11[position].toString();
                Intent intent11=new Intent(Inspection.this,Quality_Level_of_a_Garment.class);
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
                Intent intent12=new Intent(Inspection.this,Garment_Quality.class);
                intent12.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent12);
            }
        });

        ArrayAdapter<String>adapter13=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems13);
        listView13.setAdapter(adapter13);
        listView13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems13[position].toString();
                Intent intent13=new Intent(Inspection.this,Testing_Quality.class);
                intent13.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent13);
            }
        });

        ArrayAdapter<String>adapter14=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems14);
        listView14.setAdapter(adapter14);
        listView14.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems14[position].toString();
                Intent intent14=new Intent(Inspection.this,Packaging_Quality.class);
                intent14.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent14);
            }
        });

        ArrayAdapter<String>adapter15=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems15);
        listView15.setAdapter(adapter15);
        listView15.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems15[position].toString();
                Intent intent15=new Intent(Inspection.this,Quality_Policy.class);
                intent15.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent15);
            }
        });

        ArrayAdapter<String>adapter16=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems16);
        listView16.setAdapter(adapter16);
        listView16.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems16[position].toString();
                Intent intent16=new Intent(Inspection.this,Guidelines_to_InLine_Quality_Inspection.class);
                intent16.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent16);
            }
        });

        ArrayAdapter<String>adapter17=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems17);
        listView17.setAdapter(adapter17);
        listView17.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems17[position].toString();
                Intent intent17=new Intent(Inspection.this,Guidelines_to_Table_Quality_Inspection.class);
                intent17.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent17);
            }
        });
        ArrayAdapter<String>adapter18=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems18);
        listView18.setAdapter(adapter18);
        listView18.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems18[position].toString();
                Intent intent18=new Intent(Inspection.this,Quality_Control_Advise.class);
                intent18.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent18);
            }
        });







        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/



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