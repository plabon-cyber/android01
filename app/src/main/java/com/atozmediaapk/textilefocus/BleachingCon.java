package com.atozmediaapk.textilefocus;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BleachingCon extends AppCompatActivity {
    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleaching_con);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

      /*  MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/



        final TextView tex1,tex2,tex3,tex4,tex5,tex6,tex7,tex8,tex9,tex10,tex11,tex12,tex13;
        final EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10,edit11,
                edit12,edit13,edit14,edit15,edit16,edit17,edit18,edit19,edit20,edit21,be;
        Button BTN, btnRest;


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




        tex1 = (TextView) findViewById(R.id.glmid);
        tex2 = (TextView) findViewById(R.id.en);
        tex3 = (TextView) findViewById(R.id.wet);
        tex4 = (TextView) findViewById(R.id.seq);
        tex5 = (TextView) findViewById(R.id.causid);
        tex6 = (TextView) findViewById(R.id.stabid);
        tex7 = (TextView) findViewById(R.id.enr);
        tex8 = (TextView) findViewById(R.id.wetr);
        tex9 = (TextView) findViewById(R.id.seqr);
        tex10 = (TextView) findViewById(R.id.causr);
        tex11= (TextView) findViewById(R.id.stabr);
        tex12= (TextView) findViewById(R.id.tc);
        tex13= (TextView) findViewById(R.id.pm);
        edit1 = (EditText) findViewById(R.id.edit01ID);
        edit2= (EditText) findViewById(R.id.edit02ID);
        edit3= (EditText) findViewById(R.id.edit03ID);
        edit4= (EditText) findViewById(R.id.edit04ID);
        edit5= (EditText) findViewById(R.id.edit05ID);
        edit6= (EditText) findViewById(R.id.fabricID);
        edit7= (EditText) findViewById(R.id.h2o2ID);
        edit8= (EditText) findViewById(R.id.wettid);
        edit9= (EditText) findViewById(R.id.seqid);
        edit10= (EditText) findViewById(R.id.causticid);
        edit11= (EditText) findViewById(R.id.staid);
        edit12= (EditText) findViewById(R.id.gra1);
        edit13= (EditText) findViewById(R.id.gra2);
        edit14= (EditText) findViewById(R.id.gra3);
        edit15= (EditText) findViewById(R.id.gra4);
        edit16= (EditText) findViewById(R.id.rate1);
        edit17= (EditText) findViewById(R.id.rate2);
        edit18= (EditText) findViewById(R.id.rate3);
        edit19= (EditText) findViewById(R.id.rate4);
        edit20= (EditText) findViewById(R.id.rate5);
        edit21= (EditText) findViewById(R.id.pickup);
        be= (EditText) findViewById(R.id.cbaumeid);
        BTN = (Button) findViewById(R.id.BTNID);
        btnRest = (Button) findViewById(R.id.btn02ID);



        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string12=be.getText().toString();

                if(string12.equals("")){

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

                    be.setText(Float.toString(calculation1));

                }

                if (baume==2){

                    be.setText(Float.toString(calculation2));

                }

                if (baume==3){

                    be.setText(Float.toString(calculation3));

                }if (baume==4){

                    be.setText(Float.toString(calculation4));

                }if (baume==5){

                    be.setText(Float.toString(calculation5));

                }if (baume==6){

                    be.setText(Float.toString(calculation6));

                }if (baume==7){

                    be.setText(Float.toString(calculation7));

                }if (baume==8){

                    be.setText(Float.toString(calculation8));

                }if (baume==9){

                    be.setText(Float.toString(calculation9));

                }if (baume==10){

                    be.setText(Float.toString(calculation10));

                }if (baume==11){

                    be.setText(Float.toString(calculation11));

                }if (baume==12){

                    be.setText(Float.toString(calculation12));

                }if (baume==13){

                    be.setText(Float.toString(calculation13));

                }if (baume==14){

                    be.setText(Float.toString(calculation14));

                }if (baume==15){

                    be.setText(Float.toString(calculation15));

                }if (baume==16){

                    be.setText(Float.toString(calculation16));

                }if (baume==17){

                    be.setText(Float.toString(calculation17));

                }if (baume==18){

                    be.setText(Float.toString(calculation18));

                }if (baume==19){

                    be.setText(Float.toString(calculation19));

                }if (baume==20){

                    be.setText(Float.toString(calculation20));

                }if (baume==21){

                    be.setText(Float.toString(calculation21));

                }if (baume==22){

                    be.setText(Float.toString(calculation22));

                }if (baume==23){

                    be.setText(Float.toString(calculation23));

                }if (baume==24){

                    be.setText(Float.toString(calculation24));

                }if (baume==25){

                    be.setText(Float.toString(calculation25));

                }if (baume==26){

                    be.setText(Float.toString(calculation26));

                }if (baume==27){

                    be.setText(Float.toString(calculation27));

                }if (baume==28){

                    be.setText(Float.toString(calculation28));

                }if (baume==29){

                    be.setText(Float.toString(calculation29));

                }if (baume==30){

                    be.setText(Float.toString(calculation30));

                }if (baume==31){

                    be.setText(Float.toString(calculation31));

                }if (baume==32){

                    be.setText(Float.toString(calculation32));

                }if (baume==33){

                    be.setText(Float.toString(calculation33));

                }if (baume==34){

                    be.setText(Float.toString(calculation34));

                }if (baume==35){

                    be.setText(Float.toString(calculation35));

                }if (baume==36){

                    be.setText(Float.toString(calculation36));

                }if (baume==37){

                    be.setText(Float.toString(calculation37));

                }if (baume==38){

                    be.setText(Float.toString(calculation38));

                }if (baume==39){

                    be.setText(Float.toString(calculation39));

                }if (baume==40){

                    be.setText(Float.toString(calculation40));

                }if (baume==41){

                    be.setText(Float.toString(calculation41));

                }if (baume==42){

                    be.setText(Float.toString(calculation42));

                }if (baume==43){

                    be.setText(Float.toString(calculation43));

                }if (baume==44){

                    be.setText(Float.toString(calculation44));

                }if (baume==45){

                    be.setText(Float.toString(calculation45));

                }if (baume==46){

                    be.setText(Float.toString(calculation46));

                }if (baume==47){

                    be.setText(Float.toString(calculation47));

                }if (baume==48){

                    be.setText(Float.toString(calculation48));

                }if (baume==49){

                    be.setText(Float.toString(calculation49));

                }if (baume==50){

                    be.setText(Float.toString(calculation50));

                }







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
                String string012=edit12.getText().toString();
                String string13=edit13.getText().toString();
                String string14=edit14.getText().toString();
                String string15=edit15.getText().toString();
                String string16=edit16.getText().toString();
                String string17=edit17.getText().toString();
                String string18=edit18.getText().toString();
                String string19=edit19.getText().toString();
                String string20=edit20.getText().toString();
                String string21=edit21.getText().toString();





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
                }if(string11.equals("")){

                    edit11.setError("Please Enter Recipe");
                    edit11.requestFocus();
                    return;
                }

                if(string012.equals("")){

                    edit12.setError("Please Enter Recipe");
                    edit12.requestFocus();
                    return;
                }
                if(string13.equals("")){

                    edit13.setError("Please Enter Recipe");
                    edit13.requestFocus();
                    return;
                }

                if(string14.equals("")){

                    edit14.setError("Please Enter Recipe");
                    edit14.requestFocus();
                    return;
                }
                if(string15.equals("")){

                    edit15.setError("Please Enter Recipe");
                    edit15.requestFocus();
                    return;
                }
                if(string16.equals("")){

                    edit16.setError("Please Enter Recipe");
                    edit16.requestFocus();
                    return;
                }

                if(string17.equals("")){

                    edit17.setError("Please Enter Recipe");
                    edit17.requestFocus();
                    return;
                }
                if(string18.equals("")){

                    edit18.setError("Please Enter Recipe");
                    edit18.requestFocus();
                    return;
                }
                if(string19.equals("")){

                    edit19.setError("Please Enter Recipe");
                    edit19.requestFocus();
                    return;
                }
                if(string20.equals("")){

                    edit20.setError("Please Enter Recipe");
                    edit20.requestFocus();
                    return;
                }
                if(string21.equals("")){

                    edit21.setError("Please Enter Recipe");
                    edit21.requestFocus();
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
                float edt012 = Float.parseFloat(edit12.getText().toString());
                float edt13 = Float.parseFloat(edit13.getText().toString());
                float edt14 = Float.parseFloat(edit14.getText().toString());
                float edt15 = Float.parseFloat(edit15.getText().toString());
                float edt16 = Float.parseFloat(edit16.getText().toString());
                float edt17 = Float.parseFloat(edit17.getText().toString());
                float edt18 = Float.parseFloat(edit18.getText().toString());
                float edt19 = Float.parseFloat(edit19.getText().toString());
                float edt20 = Float.parseFloat(edit20.getText().toString());
                float edt21 = Float.parseFloat(edit21.getText().toString());
                float edt12 = Float.parseFloat(be.getText().toString());


                double btn_calculation1 =  edt3/edt1;
                double btn_calculation2 = edt4/edt2;
                double btn_calculation3 = btn_calculation2+btn_calculation1;
                float btn_calculation4 = (float) (btn_calculation3*25.64);
                double btn_calculation5 = btn_calculation4*edt5;
                float btn_calculation6 = (float) (btn_calculation5/39.37);
                float btn_calculation7=(float) (btn_calculation6*edt6/1000*edt7/1000*edt012*edt21/100);
                float btn_calculation8=(float) (btn_calculation6*edt6/1000*edt8/1000*edt13*edt21/100);
                float btn_calculation9=(float) (btn_calculation6*edt6/1000*edt9/1000*edt14*edt21/100);
                float btn_calculation10=(float) (btn_calculation6*edt6/1000*edt10/1000*edt12/1000);
                float btn_calculation11=(float) (btn_calculation6*edt6/1000*edt11/1000*edt15*edt21/100);
                float btn_calculation12=(float) (btn_calculation7*edt16);
                float btn_calculation13=(float) (btn_calculation8*edt17);
                float btn_calculation14=(float) (btn_calculation9*edt18);
                float btn_calculation15=(float) (btn_calculation10*edt19);
                float btn_calculation16=(float) (btn_calculation11*edt20);
                float btn_calculation17=(float) (btn_calculation12+btn_calculation13+btn_calculation14+btn_calculation15+btn_calculation16);
                float btn_calculation18=(float) (btn_calculation17/edt6);
                tex1.setText(Float.toString(btn_calculation6));
                tex2.setText(Float.toString(btn_calculation7));
                tex3.setText(Float.toString(btn_calculation8));
                tex4.setText(Float.toString(btn_calculation9));
                tex5.setText(Float.toString(btn_calculation10));
                tex6.setText(Float.toString(btn_calculation11));
                tex7.setText(Float.toString(btn_calculation12));
                tex8.setText(Float.toString(btn_calculation13));
                tex9.setText(Float.toString(btn_calculation14));
                tex10.setText(Float.toString(btn_calculation15));
                tex11.setText(Float.toString(btn_calculation16));
                tex12.setText(Float.toString(btn_calculation17));
                tex13.setText(Float.toString(btn_calculation18));

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
                edit16.setText("");
                edit17.setText("");
                edit18.setText("");
                edit19.setText("");
                edit20.setText("");
                edit21.setText("");
                be.setText("");
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
                tex12.setText("");
                tex13.setText("");
            }
        });

    }

 /*   private void loadAd() {

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

