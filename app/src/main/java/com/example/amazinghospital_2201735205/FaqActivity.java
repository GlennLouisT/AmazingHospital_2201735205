package com.example.amazinghospital_2201735205;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FaqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
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
                Intent intent = new Intent(FaqActivity.this,HomeActivity.class);
                startActivity(intent);
            case R.id.setting:
                Intent intent2 = new Intent(FaqActivity.this,SettingActivity.class);
                startActivity(intent2);
            case R.id.faq:
                Intent intent3 = new Intent(FaqActivity.this,FaqActivity.class);
                startActivity(intent3);

        }
        return true;
    }
}