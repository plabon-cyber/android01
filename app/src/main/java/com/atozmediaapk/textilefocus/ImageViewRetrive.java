package com.atozmediaapk.textilefocus;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ImageViewRetrive extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<ModelRetrive> dataList;
    private ImageViewAdapter adapter;
    //final private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Use");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_retrive);



        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataList = new ArrayList<>();
        adapter = new ImageViewAdapter(this, dataList);
        recyclerView.setAdapter(adapter);

        FirebaseDatabase.getInstance().getReference().child("Use")
                .addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelRetrive dataClass = dataSnapshot.getValue(ModelRetrive.class);
                    dataList.add(dataClass);


                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /*FirebaseDatabase.getInstance().getReference().child("Use")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                    {
                        for(DataSnapshot data:dataSnapshot.getChildren()) {
                            String value =String.valueOf(data.child("image").getValue());

                            Picasso.get().load(value).into(recyclerImage);
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });*/


    }
}