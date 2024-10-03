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

public class Energy extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
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
        setContentView(R.layout.activity_energy);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       /* MobileAds.initialize(this, new OnInitializationCompleteListener() {
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


        String[] from={"Joules","Kilowatt-hours","Kilojoules","Megawatt-hours","Foot-Pounds","Newton-meters","Therms(US)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to={"Joules","Kilowatt-hours","Kilojoules","Megawatt-hours","Foot-Pounds","Newton-meters","Therms(US)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    //Joules
                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount/3600000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount/3.6e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount/1.355818;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Joules" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount/1.054804e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Kilowatt-hours

                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*3600000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount*3600;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount*2655224;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*3600000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilowatt-hours" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount/29.30011;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Kilojoules

                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*1000;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount/3600;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount/3600000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount*737.5622;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Kilojoules" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount/105480.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Megawatt-hours

                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*3.6e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount*1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount*3600000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount*2.655224e+9;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*3.6e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Megawatt-hours" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount*34.12956;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Foot-Pounds

                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*1.355818;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount/2655224;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount/737.5622;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount/2.655224e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*1.355818;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Foot-Pounds" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount/7.779835e+7;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Newton-meters

                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*1;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount/3600000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount/1000;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount/3.6e+9;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount/1.355818;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Newton-meters" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount/1.054804e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    //Therms(US)

                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Joules")
                    {
                        tot = amount*1.054804e+8;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Kilowatt-hours")
                    {
                        tot = amount*29.30011;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Kilojoules")
                    {
                        tot = amount*105480.4;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Megawatt-hours")
                    {
                        tot = amount/34.12956;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Foot-Pounds")
                    {
                        tot = amount*7.779835e+7;

                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }

                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Newton-meters")
                    {
                        tot = amount*1.054804e+8;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }
                    if (sp1.getSelectedItem().toString()=="Therms(US)" && sp2.getSelectedItem().toString()=="Therms(US)")
                    {
                        tot = amount*1;
                        textView.setText(tot.toString());
                        Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                    }








                }catch (Exception e){

                    Toast.makeText(Energy.this,"Please enter Energy",Toast.LENGTH_LONG).show();

                }

            }
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