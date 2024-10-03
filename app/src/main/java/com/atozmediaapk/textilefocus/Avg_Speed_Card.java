package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Avg_Speed_Card extends AppCompatActivity {
   /* private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg_speed_card);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/
        final TextView tex1;
        final EditText edit1, edit2;
        Button BTN1, BTN2, btnRest;


        tex1 = findViewById(R.id.tex01ID);
        edit1 = findViewById(R.id.edit01ID);
        edit2 = findViewById(R.id.edit02ID);
        BTN1 = findViewById(R.id.BTNID1);
        BTN2 = findViewById(R.id.BTNID2);
        btnRest = findViewById(R.id.btn02ID);


        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = edit1.getText().toString();
                String string2 = edit2.getText().toString();

                if (string1.equals("")) {

                    edit1.setError("Please Enter Dia in Inches");
                    edit1.requestFocus();
                    return;
                }

                if (string2.equals("")) {

                    edit2.setError("Please Enter Height in inches");
                    edit2.requestFocus();
                    return;
                }
                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                double btn_calculation1 = (float) (edt1 * edt1);
                double btn_calculation2 = (float) (btn_calculation1 * 0.002557 * edt2);
                tex1.setText(Float.toString((float) btn_calculation2));
            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = edit1.getText().toString();
                String string2 = edit2.getText().toString();

                if (string1.equals("")) {

                    edit1.setError("Please Enter Dia in Inches");
                    edit1.requestFocus();
                    return;
                }

                if (string2.equals("")) {

                    edit2.setError("Please Enter Height in inches");
                    edit2.requestFocus();
                    return;
                }
                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                double btn_calculation1 = (float) (edt1 * edt1);
                double btn_calculation2 = (float) (btn_calculation1 * 0.002756 * edt2);
                tex1.setText(Float.toString((float) btn_calculation2));
            }
        });


        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                tex1.setText("");

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

