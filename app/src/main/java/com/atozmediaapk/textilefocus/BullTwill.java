package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BullTwill extends AppCompatActivity {
    TextView context ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bull_twill);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        context =  findViewById(R.id.hiden);
        registerForContextMenu(context);
        //ContextMenu Option

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Select the option");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        int id=item.getItemId();

        if (id==R.id.item_1) {
            Intent intent01= new Intent(BullTwill.this,NotificationOpen.class);
            startActivity(intent01);

        }
        else if (id==R.id.item_2) {
            Intent intent02= new Intent(BullTwill.this,About.class);
            startActivity(intent02);

        }

        return super.onContextItemSelected(item);
    }
}