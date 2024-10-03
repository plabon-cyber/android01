package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class ColorCode extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    View vColor;
    TextView tvCode;
    TextView tvValue,percentage,percentryb;
    TextView pantone;
    SeekBar sbRed, sbGreen, sbBlue;
    int red = 0, green = 0, blue = 0;




    SearchView searchView;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_code);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                loadAd();
            }
        });*/


        searchView = findViewById(R.id.search);
        vColor = findViewById(R.id.v_color);
        tvCode = findViewById(R.id.tv_code);
        tvValue = findViewById(R.id.tv_value);
        pantone = findViewById(R.id.tv_test);
        sbRed = findViewById(R.id.sb_red);
        sbGreen = findViewById(R.id.sb_green);
        sbBlue = findViewById(R.id.sb_blue);
        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        percentage=findViewById(R.id.percentx);
        percentryb=findViewById(R.id.percentryb);





        ListView listView = findViewById(R.id.listView);
        List<String> list = new ArrayList<>();

        list.add("PANTONE 11-0103 TCX");
        list.add("PANTONE 11-0104 TCX");
        list.add("PANTONE 11-0105 TCX");
        list.add("PANTONE 11-0107 TCX");
        list.add("PANTONE 11-0205 TCX");
        list.add("PANTONE 11-0304 TCX");
        list.add("PANTONE 11-0410 TCX");
        list.add("PANTONE 11-0507 TCX");
        list.add("PANTONE 11-0510 TCX");
        list.add("PANTONE 11-0601 TCX");
        list.add("PANTONE 11-0602 TCX");
        list.add("PANTONE 11-0603 TCX");
        list.add("PANTONE 11-0604 TCX");
        list.add("PANTONE 11-0605 TCX");
        list.add("PANTONE 11-0606 TCX");
        list.add("PANTONE 11-0609 TCX");
        list.add("PANTONE 11-0615 TCX");
        list.add("PANTONE 11-0616 TCX");
        list.add("PANTONE 11-0617 TCX");
        list.add("PANTONE 11-0618 TCX");
        list.add("PANTONE 11-0619 TCX");
        list.add("PANTONE 11-0620 TCX");
        list.add("PANTONE 11-0622 TCX");
        list.add("PANTONE 11-0701 TCX");
        list.add("PANTONE 11-0710 TCX");
        list.add("PANTONE 11-0809 TCX");
        list.add("PANTONE 11-0907 TCX");
        list.add("Up Comming Next Version");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position == 0) {

                //vColor.setBackgroundColor(0xFFEFEEE5);
                vColor.setBackgroundColor(Color.rgb(red = 239, green = 238, blue = 229));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");

                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 1) {

                //vColor.setBackgroundColor(0xFFEFEFDF);
                vColor.setBackgroundColor(Color.rgb(red = 239, green = 239, blue = 223));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");

                    float r = red / 255;
                    float g = green/255;
                    float b = blue/255;
                    float ryb_yy=(r+g);
                    float ryb_bb=(r+b);
                    float ryb_y=g/ryb_yy;
                    float ryb_b=b/ryb_bb;
                    float ryb_r=r*100;
                    float ryb_y1=ryb_y*100;
                    float ryb_b1=ryb_b*100;
                    percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                            ryb_y1 + "%, " +
                            ryb_b1 + "%");


            } else if (position == 2) {

                vColor.setBackgroundColor(Color.rgb(red = 239, green = 234, blue = 215));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float red=255;
                float green=255;
                float blue=255;
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " + ryb_y1 + "%, " + ryb_b1 + "%");
            } else if (position == 3) {

                vColor.setBackgroundColor(Color.rgb(red = 242, green = 239, blue = 220));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 4) {

                vColor.setBackgroundColor(Color.rgb(red = 239, green = 239, blue = 213));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 5) {

                vColor.setBackgroundColor(Color.rgb(red = 223, green = 230, blue = 218));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 6) {

                vColor.setBackgroundColor(Color.rgb(red = 232, green = 234, blue = 206));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 7) {

                vColor.setBackgroundColor(Color.rgb(red = 242, green = 237, blue = 216));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 8) {

                vColor.setBackgroundColor(Color.rgb(red = 245, green = 238, blue = 211));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 9) {

                vColor.setBackgroundColor(Color.rgb(red = 241, green = 242, blue = 241));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 10) {

                vColor.setBackgroundColor(Color.rgb(red = 240, green = 240, blue = 236));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 11) {

                vColor.setBackgroundColor(Color.rgb(red = 231, green = 223, blue = 217));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 12) {

                vColor.setBackgroundColor(Color.rgb(red = 238, green = 234, blue = 227));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));

                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");
            } else if (position == 13) {

                vColor.setBackgroundColor(Color.rgb(red = 241, green = 232, blue = 224));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 14) {

                vColor.setBackgroundColor(Color.rgb(red = 240, green = 237, blue = 225));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 15) {

                vColor.setBackgroundColor(Color.rgb(red = 239, green = 239, blue = 208));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");

                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " + ryb_y1 + "%, " + ryb_b1 + "%");

            } else if (position == 16) {

                vColor.setBackgroundColor(Color.rgb(red = 244, green = 238, blue = 215));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 17) {

                vColor.setBackgroundColor(Color.rgb(red = 243, green = 230, blue = 173));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 18) {

                vColor.setBackgroundColor(Color.rgb(red = 246, green = 238, blue = 196));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));

                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 19) {

                vColor.setBackgroundColor(Color.rgb(red = 240, green = 238, blue = 176));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 20) {

                vColor.setBackgroundColor(Color.rgb(red = 246, green = 235, blue = 203));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 21) {

                vColor.setBackgroundColor(Color.rgb(red = 239, green = 237, blue = 152));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 22) {

                vColor.setBackgroundColor(Color.rgb(red = 237, green = 235, blue = 185));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 23) {

                vColor.setBackgroundColor(Color.rgb(red = 240, green = 237, blue = 226));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");

                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 24) {

                vColor.setBackgroundColor(Color.rgb(red = 239, green = 238, blue = 178));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");

                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            } else if (position == 25) {

                vColor.setBackgroundColor(Color.rgb(red = 242, green = 228, blue = 209));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");
                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");


            } else if (position == 26) {
                vColor.setBackgroundColor(Color.rgb(red = 240, green = 228, blue = 210));
                String code = HexCode(red, green, blue);
                tvCode.setText(code.toUpperCase());
                tvValue.setText(String.format("RGB (%d,%d,%d)", red, green, blue));
                percentage.setText("RGB Percentage: " + red * 100 / 255 + "%," + green * 100 / 255 + "%," + blue * 100 / 255 + "%");

                float r = red / 255;
                float g = green/255;
                float b = blue/255;
                float ryb_yy=(r+g);
                float ryb_bb=(r+b);
                float ryb_y=g/ryb_yy;
                float ryb_b=b/ryb_bb;
                float ryb_r=r*100;
                float ryb_y1=ryb_y*100;
                float ryb_b1=ryb_b*100;
                percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                        ryb_y1 + "%, " +
                        ryb_b1 + "%");

            }
        });


    }



  /*  private void loadAd() {
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

}*/

    @Override
   /* public void finish() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
            super.finish();
        }

    }*/


    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        int id=seekBar.getId();

        if (id==R.id.sb_red) {
            red = i;
        } else if (id==R.id.sb_green) {
            green=i;
        } else if (id==R.id.sb_blue) {
            blue=i;
        }



        updateRGBPercent(red, green, blue);
        updateRYBPercent(red, green, blue);

        vColor.setBackgroundColor(Color.rgb(red,green,blue));

        String code = HexCode(red,green,blue);
        tvCode.setText(code.toUpperCase());
        tvValue.setText(String.format("RGB (%d,%d,%d)",red,green,blue));
    }

    private void updateRYBPercent(float red, float green, float blue) {
        float r = red / 255;
        float g = green/255;
        float b = blue/255;
        float ryb_yy=(r+g);
        float ryb_bb=(r+b);
        float ryb_y=g/ryb_yy;
        float ryb_b=b/ryb_bb;
        float ryb_r=r*100;
        float ryb_y1=ryb_y*100;
        float ryb_b1=ryb_b*100;
        percentryb.setText("RYB Percentage: " + ryb_r + "%, " +
                ryb_y1 + "%, " +
                ryb_b1 + "%");
    }

    private void updateRGBPercent(int red, int green, int blue) {
        percentage.setText("RGB Percentage: " + red * 100 / 255 + "%, " +
                green * 100 / 255 + "%, " +
                blue * 100 / 255 + "%");
    }


    private String HexCode(int red, int green, int blue) {
        String code;
        code = "#";
        code +=Integer.toHexString(red);
        code +=Integer.toHexString(green);
        code +=Integer.toHexString(blue);
        return  code;

    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}