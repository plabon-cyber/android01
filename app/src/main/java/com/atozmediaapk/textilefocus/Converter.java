package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Converter extends AppCompatActivity {
  /*  private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;
    TextView textView;
    private double view;
    double view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/

        ed1=findViewById(R.id.weight1id);
        sp1=findViewById(R.id.fromid);
        sp2=findViewById(R.id.toid);
        b1=findViewById(R.id.btnw);
        textView=(TextView) findViewById(R.id.t1);


        String[] from={"Celsius","Fahrenheit","Kelvin","Newton"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Celsius","Fahrenheit","Kelvin","Newton"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    if (sp1.getSelectedItem().toString()=="Celsius" && sp2.getSelectedItem().toString()=="Fahrenheit")
                    {
                        tot = amount*1.800+32;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Celsius" && sp2.getSelectedItem().toString()=="Kelvin")
                    {
                        tot = amount*1.000+273.15;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Celsius" && sp2.getSelectedItem().toString()=="Newton")
                    {
                        tot = amount/3.030;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Celsius" && sp2.getSelectedItem().toString()=="Celsius")
                    {
                        tot = amount/1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Fahrenheit" && sp2.getSelectedItem().toString()=="Fahrenheit")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Fahrenheit" && sp2.getSelectedItem().toString()=="Kelvin")
                    {
                        tot = amount-32/1.800+273.15;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Fahrenheit" && sp2.getSelectedItem().toString()=="Newton")
                    {
                        tot = amount-32/5.455;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Fahrenheit" && sp2.getSelectedItem().toString()=="Celsius")
                    {
                        tot = amount-32/1.800;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }





                    if (sp1.getSelectedItem().toString()=="Kelvin" && sp2.getSelectedItem().toString()=="Fahrenheit")
                    {
                        tot = (amount-273.15)*1.800+32;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kelvin" && sp2.getSelectedItem().toString()=="Kelvin")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kelvin" && sp2.getSelectedItem().toString()=="Newton")
                    {
                        tot = amount-273.15/3.030;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kelvin" && sp2.getSelectedItem().toString()=="Celsius")
                    {
                        tot = (amount-273.15)*1.000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }






                    if (sp1.getSelectedItem().toString()=="Newton" && sp2.getSelectedItem().toString()=="Fahrenheit")
                    {
                        tot = amount*5.455+32;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Newton" && sp2.getSelectedItem().toString()=="Kelvin")
                    {
                        tot = amount*3.030+273.15;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newton" && sp2.getSelectedItem().toString()=="Newton")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newton" && sp2.getSelectedItem().toString()=="Celsius")
                    {
                        tot = amount*3.030;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }



                }catch (Exception e){

                    Toast.makeText(Converter.this,"Please enter Temperature",Toast.LENGTH_LONG).show();

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