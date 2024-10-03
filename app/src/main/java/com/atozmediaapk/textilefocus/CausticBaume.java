package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class CausticBaume extends AppCompatActivity {
   /* private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    @SuppressLint({"SetTextI18n", "MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caustic_baume);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/


        final TextView glmtext,den1,be1 ;
        final EditText be,gm1;
        Button BTN, btnRest,BTN1,rest1;
        final float a= (float) 5.1;
        final float b= (float) 5.2;
        final float c= (float) 5.3;
        final float d= (float) 5.4;
        final float e= (float) 5.5;
        final float f= (float) 5.6;
        final float g= (float) 5.7;
        final float h= (float) 5.8;
        final float i= (float) 5.9;
        final float j= (float) 6.0;
        final float k= (float) 6.1;
        final float l= (float) 6.2;
        final float m= (float) 6.3;
        final float n= (float) 6.4;
        final float o= (float) 6.5;
        final float p= (float) 6.6;
        final float q= (float) 6.7;
        final float r= (float) 6.8;
        final float s= (float) 6.9;
        final float t= (float) 7.0;
        final float u= (float) 7.1;
        final float vo=(float) 7.2;
        final float w= (float) 7.3;
        final float x= (float) 7.4;
        final float y= (float) 7.5;
        final float z= (float) 7.6;
        final float aa= (float) 7.7;
        final float bb= (float) 7.8;
        final float cc= (float) 7.9;
        final float dd= (float) 8.0;
        final float ee= (float) 8.1;
        final float ff= (float) 8.2;
        final float gg= (float) 8.3;
        final float hh= (float) 8.4;
        final float ii= (float) 8.5;
        final float jj= (float) 8.6;
        final float kk= (float) 8.7;
        final float ll= (float) 8.8;
        final float mm= (float) 8.9;
        final float nn= (float) 9.0;
        final float oo= (float) 9.1;
        final float pp= (float) 9.2;
        final float qq= (float) 9.3;
        final float rr= (float) 9.4;
        final float ss= (float) 9.5;
        final float tt= (float) 9.6;
        final float uu= (float) 9.7;
        final float vv= (float) 9.8;
        final float ww= (float) 9.9;
        final float xx= (float) 10.0;




        glmtext= findViewById(R.id.gltextID);
        den1= findViewById(R.id.den);
        be = findViewById(R.id.BeID);
        BTN = findViewById(R.id.BTNID);
        btnRest = findViewById(R.id.btn02);


        gm1= findViewById(R.id.gm1);
        be1= findViewById(R.id.be1);
        BTN1= findViewById(R.id.BTNID1);
        rest1= findViewById(R.id.rest1);

        BTN.setOnClickListener(v -> {

            String string1=be.getText().toString();

            if(string1.equals("")){

                be.setError("Please Enter Your Caustic Baume");
                be.requestFocus();
                return;
            }

            float baume = Float.parseFloat(be.getText().toString());

            float calculation100= 145-baume;
            float calculation200 =145/calculation100;

            float calculation1 = baume*calculation200*a;float calculation2 = baume*calculation200*b;
            float calculation3 = baume*calculation200*c;float calculation4 = baume*calculation200*d;
            float calculation5 = baume*calculation200*e;float calculation6 = baume*calculation200*f;
            float calculation7 = baume*calculation200*g;float calculation8 = baume*calculation200*h;
            float calculation9 = baume*calculation200*i;float calculation10 = baume*calculation200*j;
            float calculation11 = baume*calculation200*k;float calculation12 = baume*calculation200*l;
            float calculation13 = baume*calculation200*m;float calculation14 = baume*calculation200*n;
            float calculation15 = baume*calculation200*o;float calculation16 = baume*calculation200*p;
            float calculation17 = baume*calculation200*q;float calculation18 = baume*calculation200*r;
            float calculation19 = baume*calculation200*s;float calculation20 = baume*calculation200*t;
            float calculation21 = baume*calculation200*u;float calculation22 = baume*calculation200*vo;
            float calculation23 = baume*calculation200*w;float calculation24 = baume*calculation200*x;
            float calculation25 = baume*calculation200*y;float calculation26 = baume*calculation200*z;
            float calculation27 = baume*calculation200*aa;float calculation28 = baume*calculation200*bb;
            float calculation29 = baume*calculation200*cc;float calculation30 = baume*calculation200*dd;
            float calculation31 = baume*calculation200*ee;float calculation32 = baume*calculation200*ff;
            float calculation33 = baume*calculation200*gg;float calculation34 = baume*calculation200*hh;
            float calculation35 = baume*calculation200*ii;float calculation36 = baume*calculation200*jj;
            float calculation37 = baume*calculation200*kk;float calculation38 = baume*calculation200*ll;
            float calculation39 = baume*calculation200*mm;float calculation40 = baume*calculation200*nn;
            float calculation41 = baume*calculation200*oo;float calculation42 = baume*calculation200*pp;
            float calculation43 = baume*calculation200*qq;float calculation44 = baume*calculation200*rr;
            float calculation45 = baume*calculation200*ss;float calculation46 = baume*calculation200*tt;
            float calculation47 = baume*calculation200*uu;float calculation48 = baume*calculation200*vv;
            float calculation49 = baume*calculation200*ww;float calculation50 = baume*calculation200*xx;



            if (baume==1){

                glmtext.setText(Float.toString(calculation1));
                den1.setText(Float.toString(calculation200));
            }
            if (baume==2){

                glmtext.setText(Float.toString(calculation2));
                den1.setText(Float.toString(calculation200));
            }

            if (baume==3){

                glmtext.setText(Float.toString(calculation3));
                den1.setText(Float.toString(calculation200));
            }if (baume==4){

                glmtext.setText(Float.toString(calculation4));
                den1.setText(Float.toString(calculation200));
            }if (baume==5){

                glmtext.setText(Float.toString(calculation5));
                den1.setText(Float.toString(calculation200));
            }if (baume==6){

                glmtext.setText(Float.toString(calculation6));
                den1.setText(Float.toString(calculation200));
            }if (baume==7){

                glmtext.setText(Float.toString(calculation7));
                den1.setText(Float.toString(calculation200));
            }if (baume==8){

                glmtext.setText(Float.toString(calculation8));
                den1.setText(Float.toString(calculation200));
            }if (baume==9){

                glmtext.setText(Float.toString(calculation9));
                den1.setText(Float.toString(calculation200));
            }if (baume==10){

                glmtext.setText(Float.toString(calculation10));
                den1.setText(Float.toString(calculation200));
            }if (baume==11){

                glmtext.setText(Float.toString(calculation11));
                den1.setText(Float.toString(calculation200));
            }if (baume==12){

                glmtext.setText(Float.toString(calculation12));
                den1.setText(Float.toString(calculation200));
            }if (baume==13){

                glmtext.setText(Float.toString(calculation13));
                den1.setText(Float.toString(calculation200));
            }if (baume==14){

                glmtext.setText(Float.toString(calculation14));
                den1.setText(Float.toString(calculation200));
            }if (baume==15){

                glmtext.setText(Float.toString(calculation15));
                den1.setText(Float.toString(calculation200));
            }if (baume==16){

                glmtext.setText(Float.toString(calculation16));
                den1.setText(Float.toString(calculation200));
            }if (baume==17){

                glmtext.setText(Float.toString(calculation17));
                den1.setText(Float.toString(calculation200));
            }if (baume==18){

                glmtext.setText(Float.toString(calculation18));
                den1.setText(Float.toString(calculation200));
            }if (baume==19){

                glmtext.setText(Float.toString(calculation19));
                den1.setText(Float.toString(calculation200));
            }if (baume==20){

                glmtext.setText(Float.toString(calculation20));
                den1.setText(Float.toString(calculation200));
            }if (baume==21){

                glmtext.setText(Float.toString(calculation21));
                den1.setText(Float.toString(calculation200));
            }if (baume==22){

                glmtext.setText(Float.toString(calculation22));
                den1.setText(Float.toString(calculation200));
            }if (baume==23){

                glmtext.setText(Float.toString(calculation23));
                den1.setText(Float.toString(calculation200));
            }if (baume==24){

                glmtext.setText(Float.toString(calculation24));
                den1.setText(Float.toString(calculation200));
            }if (baume==25){

                glmtext.setText(Float.toString(calculation25));
                den1.setText(Float.toString(calculation200));
            }if (baume==26){

                glmtext.setText(Float.toString(calculation26));
                den1.setText(Float.toString(calculation200));
            }if (baume==27){

                glmtext.setText(Float.toString(calculation27));
                den1.setText(Float.toString(calculation200));
            }if (baume==28){

                glmtext.setText(Float.toString(calculation28));
                den1.setText(Float.toString(calculation200));
            }if (baume==29){

                glmtext.setText(Float.toString(calculation29));
                den1.setText(Float.toString(calculation200));
            }if (baume==30){

                glmtext.setText(Float.toString(calculation30));
                den1.setText(Float.toString(calculation200));
            }if (baume==31){

                glmtext.setText(Float.toString(calculation31));
                den1.setText(Float.toString(calculation200));
            }if (baume==32){

                glmtext.setText(Float.toString(calculation32));
                den1.setText(Float.toString(calculation200));
            }if (baume==33){

                glmtext.setText(Float.toString(calculation33));
                den1.setText(Float.toString(calculation200));
            }if (baume==34){

                glmtext.setText(Float.toString(calculation34));
                den1.setText(Float.toString(calculation200));
            }if (baume==35){

                glmtext.setText(Float.toString(calculation35));
                den1.setText(Float.toString(calculation200));
            }if (baume==36){

                glmtext.setText(Float.toString(calculation36));
                den1.setText(Float.toString(calculation200));
            }if (baume==37){

                glmtext.setText(Float.toString(calculation37));
                den1.setText(Float.toString(calculation200));
            }if (baume==38){

                glmtext.setText(Float.toString(calculation38));
                den1.setText(Float.toString(calculation200));
            }if (baume==39){

                glmtext.setText(Float.toString(calculation39));
                den1.setText(Float.toString(calculation200));
            }if (baume==40){

                glmtext.setText(Float.toString(calculation40));
                den1.setText(Float.toString(calculation200));
            }if (baume==41){

                glmtext.setText(Float.toString(calculation41));
                den1.setText(Float.toString(calculation200));
            }if (baume==42){

                glmtext.setText(Float.toString(calculation42));
                den1.setText(Float.toString(calculation200));
            }if (baume==43){

                glmtext.setText(Float.toString(calculation43));
                den1.setText(Float.toString(calculation200));
            }if (baume==44){

                glmtext.setText(Float.toString(calculation44));
                den1.setText(Float.toString(calculation200));
            }if (baume==45){

                glmtext.setText(Float.toString(calculation45));
                den1.setText(Float.toString(calculation200));
            }if (baume==46){

                glmtext.setText(Float.toString(calculation46));
                den1.setText(Float.toString(calculation200));
            }if (baume==47){

                glmtext.setText(Float.toString(calculation47));
                den1.setText(Float.toString(calculation200));
            }if (baume==48){

                glmtext.setText(Float.toString(calculation48));
                den1.setText(Float.toString(calculation200));
            }if (baume==49){

                glmtext.setText(Float.toString(calculation49));
                den1.setText(Float.toString(calculation200));
            }if (baume==50){

                glmtext.setText(Float.toString(calculation50));
                den1.setText(Float.toString(calculation200));
            }

        });

        btnRest.setOnClickListener(v -> {

            glmtext.setText("");
            den1.setText("");
            be.setText("");

        });





        final float glm1= (float) 1;
        final float glm2= (float) 1.2;
        final float glm3= (float) 1.4;
        final float glm4= (float) 1.6;
        final float glm5= (float) 1.8;
        final float glm6= (float) 2.0;

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string1=gm1.getText().toString();

                if(string1.equals("")){

                    gm1.setError("Caustic Flakes");
                    gm1.requestFocus();
                    return;
                }

                float gram = Float.parseFloat(gm1.getText().toString());

                if (gram==5){
                    be1.setText(Float.toString(glm1));
                }
                if (gram==6){
                    be1.setText(Float.toString(glm2));
                }
                if (gram==7){
                    be1.setText(Float.toString(glm3));
                }
                if (gram==8){
                    be1.setText(Float.toString(glm4));
                }
                if (gram==9){
                    be1.setText(Float.toString(glm5));
                }
                if (gram==10){
                    be1.setText(Float.toString(glm6));
                }

            }
        });

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

