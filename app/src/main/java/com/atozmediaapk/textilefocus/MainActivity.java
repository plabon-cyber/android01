package com.atozmediaapk.textilefocus;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    GridLayout gridLayout,gridLayout1;
    Button btn2,btn3,btn4,btn5;
    ImageSlider mainslider;

    NavigationView nav;
    BottomNavigationView bottomnav;


    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    // AdView mAdView;
    // Button bottom;
    //public static int CategoryClicked = -10;

    @SuppressLint({"SourceLockedOrientationActivity", "MissingInflatedId", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(SCREEN_ORIENTATION_USER_PORTRAIT);

        StartAppAd.showAd(this);





        FirebaseMessaging.getInstance().subscribeToTopic("Textile")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "done";
                        if (!task.isSuccessful()) {
                            msg = "failed";
                        }
                    }
                });




        /*mAdView = findViewById(R.id.adView);

        mAdView.setVisibility(View.GONE);
        if (getString(R.string.show_admob_ad).contains("ON")){
            loadBannerAd();
            //loadFullscreenAd();
        }*/




        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav= findViewById(R.id.navmenu);
        bottomnav=findViewById(R.id.bottomnav);
        drawerLayout= findViewById(R.id.drawer);


        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(menuItem -> {
            int id=menuItem.getItemId();

            if (id==R.id.menu_home) {
                Intent intent01= new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent01);
                drawerLayout.closeDrawer(GravityCompat.START);
            }
            else if (id==R.id.menu_call) {
                Intent intent02= new Intent(MainActivity.this,About.class);
                startActivity(intent02);
                drawerLayout.closeDrawer(GravityCompat.START);
            }

            return true;
        });

        bottomnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();

                if (id==R.id.menu_call1) {
                    Intent intent01= new Intent(MainActivity.this,ColorCode.class);
                    startActivity(intent01);
                    //StartAppAd.showAd(MainActivity.this);
                    StartAppAd rewardedApps = new StartAppAd(MainActivity.this);
                    rewardedApps.setVideoListener(new VideoListener() {
                        @Override
                        public void onVideoCompleted() {

                        }
                    });
                   rewardedApps.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, new AdEventListener() {
                       @Override
                       public void onReceiveAd(@NonNull Ad ad) {
                           rewardedApps.showAd();
                       }

                       @Override
                       public void onFailedToReceiveAd(@Nullable Ad ad) {

                       }
                   });

                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if (id==R.id.data) {
                    Intent intent02= new Intent(MainActivity.this,Database.class);
                    startActivity(intent02);
                    StartAppAd.showAd(MainActivity.this);
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (id==R.id.notification) {
                    Intent intent03= new Intent(MainActivity.this, Notification.class);
                    startActivity(intent03);
                    drawerLayout.closeDrawer(GravityCompat.START);

                }
                return true;

            }
        });





        TextView textView=findViewById(R.id.maintext);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
        mainslider= findViewById(R.id.image_slider1);
        /*ArrayList<SlideModel> arrayList = new ArrayList<>();
        arrayList.add(new SlideModel(R.drawable.plabon2, ScaleTypes.CENTER_CROP));
        arrayList.add(new SlideModel(R.drawable.plabon2,ScaleTypes.CENTER_CROP));
        arrayList.add(new SlideModel(R.drawable.plabon2,ScaleTypes.CENTER_CROP));
        arrayList.add(new SlideModel(R.drawable.plabon2,ScaleTypes.CENTER_CROP));

        mainslider.setImageList(arrayList);*/


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef1 = database.getReference("Maintext");
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


        final List<SlideModel> remoteimages=new ArrayList<>();

        FirebaseDatabase.getInstance().getReference().child("Main")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                    {
                        for(DataSnapshot data:dataSnapshot.getChildren())
                            remoteimages.add(new SlideModel(data.child("url").getValue().toString(), ScaleTypes.FIT));

                        mainslider.setImageList(remoteimages,ScaleTypes.FIT);

                        mainslider.setItemClickListener(new ItemClickListener() {
                            @Override
                            public void onItemSelected(int i) {
                                Toast.makeText(getApplicationContext(),remoteimages.get(i).toString(), Toast.LENGTH_SHORT).show();
                            }
                        });

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });




       /* btn2= findViewById(R.id.imageidone);
        btn2.setOnClickListener(v -> {
            Intent intent2= new Intent(MainActivity.this,About.class);
            startActivity(intent2);

        });

        btn3= findViewById(R.id.imageidtwo);
        btn3.setOnClickListener(v -> {
            Intent intent3= new Intent(MainActivity.this,Calculator.class);
            startActivity(intent3);

        });


        btn4= findViewById(R.id.imageidthree);
        btn4.setOnClickListener(v -> {
            Intent intent4= new Intent(MainActivity.this,Database.class);
            startActivity(intent4);

        });

        btn5= findViewById(R.id.calender);
        btn5.setOnClickListener(v -> {
            Intent intent4= new Intent(MainActivity.this,Calender.class);
            startActivity(intent4);

        });*/




        gridLayout= findViewById(R.id.gridID);
        gridLayout1= findViewById(R.id.grid1ID);



        setSingleEvent(gridLayout);
        setSingle1Event(gridLayout1);

    }



    private void setSingleEvent(GridLayout gridLayout) {
        for (int i=0;i<gridLayout.getChildCount();i++) {
            CardView cardview = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardview.setOnClickListener(v -> {
                if (finalI == 0) {
                    Intent intent1 = new Intent(MainActivity.this, Pretreatment.class);
                    startActivity(intent1);
                     StartAppAd.showAd(MainActivity.this);
                    /*if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, Pretreatment.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/




                } else if (finalI == 1) {
                    Intent intent2 = new Intent(MainActivity.this, Dyeing.class);
                    startActivity(intent2);
                    StartAppAd.showAd(MainActivity.this);
                   /* if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, Dyeing.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                } else if (finalI == 2) {
                    Intent intent3 = new Intent(MainActivity.this,Printing.class);
                    startActivity(intent3);


                } else if (finalI == 3) {
                    Intent intent4 = new Intent(MainActivity.this, Finishing.class);
                    startActivity(intent4);
                    StartAppAd.showAd(MainActivity.this);
                } else if (finalI == 4) {
                    Intent intent5 = new Intent(MainActivity.this, Inspection.class);
                    startActivity(intent5);
                    StartAppAd.showAd(MainActivity.this);
                } else if (finalI == 5) {
                    Intent intent6 = new Intent(MainActivity.this, LabTest.class);
                    startActivity(intent6);
                    StartAppAd.showAd(MainActivity.this);
                   /* if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, LabTest.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                }

                else if (finalI == 6) {
                    Intent intent7 = new Intent(MainActivity.this, InterView.class);
                    startActivity(intent7);
                    StartAppAd.showAd(MainActivity.this);
                }


            });

        }
    }

    private void setSingle1Event(GridLayout gridLayout1) {
        for (int i1=0;i1<gridLayout1.getChildCount();i1++) {
            CardView cardview1 = (CardView) gridLayout1.getChildAt(i1);
            final int finalI = i1;
            cardview1.setOnClickListener(v -> {
                if (finalI == 0) {
                    Intent intent1 = new Intent(MainActivity.this, Conversion.class);
                    startActivity(intent1);
                    StartAppAd.showAd(MainActivity.this);
                  /*  if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, Conversion.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                } else if (finalI == 1) {
                    Intent intent2 = new Intent(MainActivity.this, Spinning.class);
                    startActivity(intent2);
                    StartAppAd.showAd(MainActivity.this);
                    /*if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this,Spinning.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                } else if (finalI == 2) {
                    Intent intent3 = new Intent(MainActivity.this, Show.class);
                    startActivity(intent3);
                    StartAppAd.showAd(MainActivity.this);
                   /* if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, Show.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                } else if (finalI == 3) {
                    Intent intent4 = new Intent(MainActivity.this, Weaving.class);
                    startActivity(intent4);
                    StartAppAd.showAd(MainActivity.this);
                   /* if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, Weaving.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                } else if (finalI == 4) {
                    Intent intent5 = new Intent(MainActivity.this, Knitting.class);
                    startActivity(intent5);
                    StartAppAd.showAd(MainActivity.this);
                } else if (finalI == 5) {
                    Intent intent6 = new Intent(MainActivity.this, Knit_Dyeing.class);
                    startActivity(intent6);
                    StartAppAd.showAd(MainActivity.this);
                }

                else if (finalI == 6) {
                    Intent intent7 = new Intent(MainActivity.this, Garments.class);
                    startActivity(intent7);
                    StartAppAd.showAd(MainActivity.this);
                   /* if (mInterstitialAd==null){
                        startActivity(new Intent(MainActivity.this, Garments.class));
                    }else{
                        mInterstitialAd.show(MainActivity.this);
                    }*/
                }


            });

        }
    }
    /*int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }*/
    // loadFullscreenAd method starts here.....
    /*InterstitialAd mInterstitialAd;

    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();

                        if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Pretreatment.class));
                        }else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Dyeing.class));
                        }else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, LabTest.class));
                        }else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Conversion.class));
                        } else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Spinning.class));
                        }else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Show.class));
                        }else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Weaving.class));
                        }else if (CategoryClicked>=0){
                            startActivity(new Intent(MainActivity.this, Garments.class));
                        }
                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }*/
    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



}
