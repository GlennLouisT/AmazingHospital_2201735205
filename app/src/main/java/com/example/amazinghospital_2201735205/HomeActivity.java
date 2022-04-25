package com.example.amazinghospital_2201735205;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.amazinghospital_2201735205.Adapter.ProvinceAdapter;
import com.example.amazinghospital_2201735205.model.Hospital;
import com.example.amazinghospital_2201735205.model.Province;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    Button btn_hospital;
    RecyclerView rvProvince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        

        rvProvince = findViewById(R.id.rv_province);

        ArrayList<Province> provinces = new ArrayList<>();
        provinces.add(new Province("Aceh"));
        provinces.add(new Province("Sumatera Utara"));
        provinces.add(new Province("Sumatera Barat"));
        provinces.add(new Province("Banten"));
        provinces.add(new Province("Jakarta"));
        provinces.add(new Province("Jawa Barat"));
        provinces.add(new Province("Jawa Tengah"));
        provinces.add(new Province("Jawa Timur"));
        provinces.add(new Province("Bali"));
        provinces.add(new Province("Nusa Tenggara Barat"));
        provinces.add(new Province("Nusa Tenggara Timur"));
        provinces.add(new Province("Kalimantan Timur"));
        provinces.add(new Province("Kalimantan Barat"));
        provinces.add(new Province("Kalimantan Tengah"));

        ProvinceAdapter adapter = new ProvinceAdapter(HomeActivity.this);
        adapter.setProvinces(provinces);

        rvProvince.setAdapter(adapter);
        rvProvince.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.home:
                Intent intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
            case R.id.setting:
                Intent intent2 = new Intent(this,SettingActivity.class);
                startActivity(intent2);
            case R.id.faq:
                Intent intent3 = new Intent(this,FaqActivity.class);
                startActivity(intent3);
        }
        return true;
    }
    



}