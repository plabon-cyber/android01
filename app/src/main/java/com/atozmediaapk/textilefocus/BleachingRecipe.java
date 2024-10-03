package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class BleachingRecipe extends AppCompatActivity {
   /* private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    @SuppressLint({"SourceLockedOrientationActivity", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleaching_recipe);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/

        final TextView glmtext, recipe1 ;
        final EditText be;
        Button BTN, btnRest;
        final int a = 100;
        final int b = 130;
        final int c = 260;
        final int d = 500;




        glmtext= findViewById(R.id.gltextID);
        recipe1= findViewById(R.id.gltext1ID);
        be = findViewById(R.id.BeID);
        BTN = findViewById(R.id.BTNID);
        btnRest = findViewById(R.id.btn02);

        BTN.setOnClickListener(v -> {

            String string1=be.getText().toString();

            if(string1.equals("")){

                be.setError("Please Enter Your Fabrics GSM");
                be.requestFocus();
                return;
            }

            int aa= Integer.parseInt(be.getText().toString());

            if (aa>=a)
            {

                glmtext.setText(R.string.oneHundred1);
                recipe1.setText(R.string.oneHundred2);
            }if (aa>=b) {
                glmtext.setText(R.string.oneHundred31);
                recipe1.setText(R.string.oneHundred32);

            }if (aa>=c){

                glmtext.setText(R.string.twoHundred60);
                recipe1.setText(R.string.twoHundred61);

            }if (aa>=d){

                glmtext.setText("Limited Your GSM");
                recipe1.setText("Limited Your GSM");

            }


        });

        btnRest.setOnClickListener(v -> {

            glmtext.setText("");
            recipe1.setText("");
            be.setText("");

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


