package com.example.amazinghospital_2201735205;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.amazinghospital_2201735205.model.Hospital;

import java.util.ArrayList;

public class HospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        insertHospital();

        String ProvinceName = (String) getIntent().getSerializableExtra("ProvinceName");


    }

    public void insertHospital(){
        ArrayList<Hospital> hospitals = new ArrayList<>();
        hospitals.add(new Hospital("Rs. Satya Negara","SatyaNegara@gmail.com",
                "081661616161","Jakarta"));
        hospitals.add(new Hospital("Rs. Royal Progress","RoyalProgress@gmail.com",
                "086374673467","Jakarta"));
    }
}