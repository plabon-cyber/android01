package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class GsmGlm extends AppCompatActivity {
    //private InterstitialAd mInterstitialAd;
    //private final String TAG = "Admob";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsm_glm);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



       /* MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/




        final TextView tex1,tex2;
        final EditText edit1,edit2,edit3,edit4,edit5;
        Button BTN, btnRest;


        tex1 =  findViewById(R.id.tex01ID);
        tex2 =  findViewById(R.id.tex02ID);

        edit1 =  findViewById(R.id.edit01ID);
        edit2=  findViewById(R.id.edit02ID);
        edit3= findViewById(R.id.edit03ID);
        edit4=  findViewById(R.id.edit04ID);
        edit5=  findViewById(R.id.edit05ID);
        BTN = findViewById(R.id.BTNID);
        btnRest =  findViewById(R.id.btn02ID);





        BTN.setOnClickListener(v -> {
            String string3=edit3.getText().toString();
            String string4=edit4.getText().toString();
            String string1=edit1.getText().toString();
            String string2=edit2.getText().toString();
            String string5=edit5.getText().toString();



            if(string3.equals("")){

                edit3.setError("Please Enter Your EPI");
                edit3.requestFocus();
                return;
            }

            if(string4.equals("")){

                edit4.setError("Please Enter Your PPI");
                edit4.requestFocus();
                return;
            }

            if(string1.equals("")){

                edit1.setError("Please Enter Your Warp Count");
                edit1.requestFocus();
                return;
            }

            if(string2.equals("")){

                edit2.setError("Please Enter Your Weft Count");
                edit2.requestFocus();
                return;
            }



            if(string5.equals("")){

                edit5.setError("Please Enter Your Width");
                edit5.requestFocus();
                return;
            }




            float edt1 = Float.parseFloat(edit1.getText().toString());
            float edt2 = Float.parseFloat(edit2.getText().toString());
            float edt3 = Float.parseFloat(edit3.getText().toString());
            float edt4 = Float.parseFloat(edit4.getText().toString());
            float edt5 = Float.parseFloat(edit5.getText().toString());


            double btn_calculation1 =  edt3/edt1;
            double btn_calculation2 = edt4/edt2;
            double btn_calculation3 = btn_calculation2+btn_calculation1;
            float btn_calculation4 = (float) (btn_calculation3*25.64);
            double btn_calculation5 = btn_calculation4*edt5;
            float btn_calculation6 = (float) (btn_calculation5/39.37);
            tex1.setText(Float.toString(btn_calculation4));
            tex2.setText(Float.toString(btn_calculation6));

        });

        btnRest.setOnClickListener(v -> {
            edit1.setText("");
            edit2.setText("");
            edit3.setText("");
            edit4.setText("");
            edit5.setText("");
            tex1.setText("");
            tex2.setText("");
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

