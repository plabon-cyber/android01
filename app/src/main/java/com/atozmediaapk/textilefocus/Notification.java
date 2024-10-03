package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {

    /*private InterstitialAd mInterstitialAd;
    private final String TAG = "Admob";*/

    DatabaseReference ref,ref1;
    ArrayList<Model> list;
    ArrayList<ModelUser1> AddList;
    RecyclerView recyclerView,recyclerView1;
    SearchView searchView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);




        ref = FirebaseDatabase.getInstance().getReference().child("Users1");
        ref1 = FirebaseDatabase.getInstance().getReference().child("User");
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView1 = findViewById(R.id.recyclerview1);
        searchView = findViewById(R.id.searchview);


    }




    @Override
    protected void onStart() {
        super.onStart();

        if(ref != null){
            ref.addValueEventListener(new ValueEventListener() {
                @NonNull
                @Override
                protected Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }

                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if(snapshot.exists()){
                        list= new ArrayList<>();
                        for(DataSnapshot ds : snapshot.getChildren()){
                            list.add(ds.getValue(Model.class));

                        }
                        MyAdapter adapterClass = new MyAdapter(list);
                        recyclerView.setAdapter(adapterClass);
                        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
                        layoutManager.setReverseLayout(true);
                        layoutManager.setStackFromEnd(true);
                        recyclerView.setLayoutManager(layoutManager);


                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(Notification.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(ref1 != null){
            ref1.addValueEventListener(new ValueEventListener() {
                @NonNull
                @Override
                protected Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }

                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if(snapshot.exists()){
                        AddList= new ArrayList<>();
                        for(DataSnapshot ds : snapshot.getChildren()){
                            AddList.add(ds.getValue(ModelUser1.class));

                        }
                        MyAdapterUser1 adapterClass = new MyAdapterUser1(AddList);
                        recyclerView1.setAdapter(adapterClass);
                        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
                        layoutManager.setReverseLayout(true);
                        layoutManager.setStackFromEnd(true);
                        recyclerView1.setLayoutManager(layoutManager);


                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(Notification.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (searchView != null){
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    search(newText);
                    return true;
                }
            });
        }

    }

    private void search(String str) {
        if (!str.equals("")){
            ArrayList<Model> myList = new ArrayList<>();
            for (Model object : list){
                if(object.getSurname().toLowerCase().contains(str.toLowerCase())){
                    myList.add(object);
                }
            }
            MyAdapter adapterClass = new MyAdapter(myList);
            recyclerView.setAdapter(adapterClass);
        }

    }


}
