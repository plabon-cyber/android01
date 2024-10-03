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

public class Blow_Room extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/


    //ViewFlipper v_flipper;
    ImageView imageView;

    ListView listView2,listView3,listView4,listView5,listView6,listView7,listView8,listView9,listView10;
    String [] listviewitems2=new String[]{"1. Cleaning Eficiency"};
    String [] listviewitems3=new String[]{"2. Beater wise wate"};
    String [] listviewitems4=new String[]{"3. Total Blow Room waste"};
    String [] listviewitems5=new String[]{"4. Beater wise trash"};
    String [] listviewitems6=new String[]{"5. Beats/inch"};
    String [] listviewitems7=new String[]{"6. Weigt of lap"};
    String [] listviewitems8=new String[]{"7. Production/scutcher/hrs"};
    String [] listviewitems9=new String[]{"8. Draft of a scutcher"};
    String [] listviewitems10=new String[]{"9. % Waste"};

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blow_room);
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



        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitems2[position].toString();
                Intent intent2=new Intent(Blow_Room.this,Cleaning_Efficency.class);
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
                Intent intent3=new Intent(Blow_Room.this,Beater_wise_waste.class);
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
                Intent intent4=new Intent(Blow_Room.this,Total_Blow_Room_waste.class);
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
                Intent intent5=new Intent(Blow_Room.this,Beater_trash_percent.class);
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
                Intent intent6=new Intent(Blow_Room.this,Beats_per_inch.class);
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
                Intent intent7=new Intent(Blow_Room.this,Weight_of_lap.class);
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
                Intent intent8=new Intent(Blow_Room.this,Production_scutcher.class);
                intent8.putExtra( "ListViewclickvalue",Templistview);
                startActivity(intent8);
            }
        });

        ArrayAdapter<String>adapter9=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems9);
        listView9.setAdapter(adapter9);
        listView9.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview= listviewitems9[position];
            Intent intent9=new Intent(Blow_Room.this,Draf_of_a_scutcher.class);
            intent9.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent9);
        });
        ArrayAdapter<String>adapter10=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems10);
        listView10.setAdapter(adapter10);
        listView10.setOnItemClickListener((parent, view, position, id) -> {
            String Templistview=listviewitems10[position].toString();
            Intent intent10=new Intent(Blow_Room.this,Percent_waste.class);
            intent10.putExtra( "ListViewclickvalue",Templistview);
            startActivity(intent10);
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

