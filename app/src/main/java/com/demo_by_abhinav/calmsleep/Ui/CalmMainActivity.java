package com.demo_by_abhinav.calmsleep.Ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.demo_by_abhinav.calmsleep.Adapter.Calm_Adapter;
import com.demo_by_abhinav.calmsleep.Data.DataModel;
import com.demo_by_abhinav.calmsleep.R;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.AVLoadingIndicatorDialog;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CalmMainActivity extends AppCompatActivity {

    DatabaseReference dbRef;
    RecyclerView recyclerView;
    Calm_Adapter calm_adapter;
    ArrayList<DataModel> calm_models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();
        callmodel();
    }

    private void callmodel() {

        AVLoadingIndicatorDialog progressDialog = new AVLoadingIndicatorDialog(this);
        progressDialog.setMessage(" Please Wait ...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        dbRef = FirebaseDatabase.getInstance().getReference()
                .child("calm_sleep").child("sleep_type");
//        dbRef.child("sleep_type").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
//        })
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        calm_models = new ArrayList<>();
        calm_adapter = new Calm_Adapter(this,calm_models);
        recyclerView.setAdapter(calm_adapter);
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot:snapshot.getChildren()) {

                    progressDialog.dismiss();
                    DataModel dataModel = dataSnapshot.getValue(DataModel.class);
                    Log.e("TAG", "onDataChange: "+dataModel );
                    calm_models.add(dataModel);


                }
                calm_adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void inti() {
        recyclerView = findViewById(R.id.calm_rv);
    }
}