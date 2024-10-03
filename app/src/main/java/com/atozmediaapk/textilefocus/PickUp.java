package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class PickUp extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/


        final TextView tex1;
        final EditText edit1,edit2;
        Button BTN, btnRest;


        tex1 = findViewById(R.id.texpID);

        edit1 = findViewById(R.id.editp1ID);
        edit2= findViewById(R.id.editp2ID);

        BTN = findViewById(R.id.BTNP1);
        btnRest = findViewById(R.id.btnp2);

        BTN.setOnClickListener(v -> {
            String string1=edit1.getText().toString();
            String string2=edit2.getText().toString();


            if(string1.equals("")){

                edit1.setError("Please Enter Your Before Weight");
                edit1.requestFocus();
                return;
            }

            if(string2.equals("")){

                edit2.setError("Please Enter Your After Weight");
                edit2.requestFocus();
                return;
            }

            float edt1 = Float.parseFloat(edit1.getText().toString());
            float edt2 = Float.parseFloat(edit2.getText().toString());

            double btn_calculation1 =  edt1-edt2;
            double btn_calculation2 = btn_calculation1/edt2;
            double btn_calculation3 = btn_calculation2*100;
            tex1.setText(Float.toString((float) btn_calculation3));
        });

        btnRest.setOnClickListener(v -> {
            edit1.setText("");
            edit2.setText("");
            tex1.setText("");

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

