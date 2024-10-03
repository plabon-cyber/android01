package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SingeingCon extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singeing_con);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/

        final TextView tex1,tex2,tex3,tex4,tex5,tex6,tex7,tex8,tex9,tex10,tex11;
        final EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10,edit11,edit12,edit13,edit14,edit15;
        Button BTN, btnRest;

        tex1 = (TextView) findViewById(R.id.glmid);
        tex2 = (TextView) findViewById(R.id.en);
        tex3 = (TextView) findViewById(R.id.wet);
        tex4 = (TextView) findViewById(R.id.seq);
        tex5 = (TextView) findViewById(R.id.ace);
        tex6 = (TextView) findViewById(R.id.enr);
        tex7 = (TextView) findViewById(R.id.wetr);
        tex8 = (TextView) findViewById(R.id.seqr);
        tex9 = (TextView) findViewById(R.id.acer);
        tex10 = (TextView) findViewById(R.id.pm);
        tex11 = (TextView) findViewById(R.id.tc);
        edit1 = (EditText) findViewById(R.id.edit01ID);
        edit2= (EditText) findViewById(R.id.edit02ID);
        edit3= (EditText) findViewById(R.id.edit03ID);
        edit4= (EditText) findViewById(R.id.edit04ID);
        edit5= (EditText) findViewById(R.id.edit05ID);
        edit6= (EditText) findViewById(R.id.fabricID);
        edit7= (EditText) findViewById(R.id.enzID);
        edit8= (EditText) findViewById(R.id.wettid);
        edit9= (EditText) findViewById(R.id.seqid);
        edit10= (EditText) findViewById(R.id.aceid);
        edit11= (EditText) findViewById(R.id.rate1);
        edit12= (EditText) findViewById(R.id.rate2);
        edit13= (EditText) findViewById(R.id.rate3);
        edit14= (EditText) findViewById(R.id.rate4);
        edit15= (EditText) findViewById(R.id.pickup);
        BTN = (Button) findViewById(R.id.BTNID);
        btnRest = (Button) findViewById(R.id.btn02ID);



        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string3=edit3.getText().toString();
                String string4=edit4.getText().toString();
                String string1=edit1.getText().toString();
                String string2=edit2.getText().toString();
                String string5=edit5.getText().toString();
                String string6=edit6.getText().toString();
                String string7=edit7.getText().toString();
                String string8=edit8.getText().toString();
                String string9=edit9.getText().toString();
                String string10=edit10.getText().toString();
                String string11=edit11.getText().toString();
                String string12=edit12.getText().toString();
                String string13=edit13.getText().toString();
                String string14=edit14.getText().toString();
                String string15=edit15.getText().toString();




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
                if(string6.equals("")){

                    edit6.setError("Please Enter Fabrics QTY");
                    edit6.requestFocus();
                    return;
                }
                if(string7.equals("")){

                    edit7.setError("Please Enter Recipe");
                    edit7.requestFocus();
                    return;
                }if(string8.equals("")){

                    edit8.setError("Please Enter Recipe");
                    edit8.requestFocus();
                    return;
                }if(string9.equals("")){

                    edit9.setError("Please Enter Recipe");
                    edit9.requestFocus();
                    return;
                }if(string10.equals("")){

                    edit10.setError("Please Enter Recipe");
                    edit10.requestFocus();
                    return;
                }
                if(string11.equals("")){

                    edit11.setError("Please Enter Rate");
                    edit11.requestFocus();
                    return;
                }
                if(string12.equals("")){

                    edit12.setError("Please Enter Rate");
                    edit12.requestFocus();
                    return;
                }
                if(string13.equals("")){

                    edit13.setError("Please Enter Rate");
                    edit13.requestFocus();
                    return;
                }
                if(string14.equals("")){

                    edit14.setError("Please Enter Rate");
                    edit14.requestFocus();
                    return;
                }
                if(string15.equals("")){

                    edit15.setError("Please Enter %");
                    edit15.requestFocus();
                    return;
                }




                float edt1 = Float.parseFloat(edit1.getText().toString());
                float edt2 = Float.parseFloat(edit2.getText().toString());
                float edt3 = Float.parseFloat(edit3.getText().toString());
                float edt4 = Float.parseFloat(edit4.getText().toString());
                float edt5 = Float.parseFloat(edit5.getText().toString());
                float edt6 = Float.parseFloat(edit6.getText().toString());
                float edt7 = Float.parseFloat(edit7.getText().toString());
                float edt8 = Float.parseFloat(edit8.getText().toString());
                float edt9 = Float.parseFloat(edit9.getText().toString());
                float edt10 = Float.parseFloat(edit10.getText().toString());
                float edt11 = Float.parseFloat(edit11.getText().toString());
                float edt12 = Float.parseFloat(edit12.getText().toString());
                float edt13 = Float.parseFloat(edit13.getText().toString());
                float edt14 = Float.parseFloat(edit14.getText().toString());
                float edt15 = Float.parseFloat(edit15.getText().toString());


                double btn_calculation1 =  edt3/edt1;
                double btn_calculation2 = edt4/edt2;
                double btn_calculation3 = btn_calculation2+btn_calculation1;
                float btn_calculation4 = (float) (btn_calculation3*25.64);
                double btn_calculation5 = btn_calculation4*edt5;
                float btn_calculation6 = (float) (btn_calculation5/39.37);
                float btn_calculation7=(float) (btn_calculation6*edt6/1000*edt7/1000);
                float btn_calculation8=(float) (btn_calculation6*edt6/1000*edt8/1000);
                float btn_calculation9=(float) (btn_calculation6*edt6/1000*edt9/1000);
                float btn_calculation10=(float) (btn_calculation6*edt6/1000*edt10/1000);
                float btn_calculation11=(float)(btn_calculation7*edt15/100*edt11);
                float btn_calculation12=(float)(btn_calculation8*edt15/100*edt12);
                float btn_calculation13=(float)(btn_calculation9*edt15/100*edt13);
                float btn_calculation14=(float)(btn_calculation10*edt15/100*edt14);
                float btn_calculation16=(float)(btn_calculation11+btn_calculation12+btn_calculation13+btn_calculation14);
                float btn_calculation15=(float)(btn_calculation16/edt6);
                float btn_calculation17=(float)(btn_calculation7*edt15/100);
                float btn_calculation18=(float)(btn_calculation8*edt15/100);
                float btn_calculation19=(float)(btn_calculation9*edt15/100);
                float btn_calculation20=(float)(btn_calculation10*edt15/100);

                tex1.setText(Float.toString(btn_calculation6));
                tex2.setText(Float.toString(btn_calculation17));
                tex3.setText(Float.toString(btn_calculation18));
                tex4.setText(Float.toString(btn_calculation19));
                tex5.setText(Float.toString(btn_calculation20));
                tex6.setText(Float.toString(btn_calculation11));
                tex7.setText(Float.toString(btn_calculation12));
                tex8.setText(Float.toString(btn_calculation13));
                tex9.setText(Float.toString(btn_calculation14));
                tex10.setText(Float.toString(btn_calculation15));
                tex11.setText(Float.toString(btn_calculation16));

            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                edit5.setText("");
                edit6.setText("");
                edit7.setText("");
                edit8.setText("");
                edit9.setText("");
                edit10.setText("");
                edit11.setText("");
                edit12.setText("");
                edit13.setText("");
                edit14.setText("");
                edit15.setText("");
                tex1.setText("");
                tex2.setText("");
                tex3.setText("");
                tex4.setText("");
                tex5.setText("");
                tex6.setText("");
                tex7.setText("");
                tex8.setText("");
                tex9.setText("");
                tex10.setText("");
                tex11.setText("");
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

