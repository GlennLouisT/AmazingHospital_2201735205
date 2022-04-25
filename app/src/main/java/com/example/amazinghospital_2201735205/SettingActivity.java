package com.example.amazinghospital_2201735205;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class SettingActivity extends AppCompatActivity {
    public static boolean DARK_THEME = false;

    RadioButton rb_yes;
    RadioButton rb_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadTheme();
        setContentView(R.layout.activity_setting);

        rb_yes = findViewById(R.id.rb_yes);
        rb_no = findViewById(R.id.rb_no);

        rb_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DARK_THEME = true;
                recreate();
            }
        });

        rb_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DARK_THEME = false;
                recreate();
            }
        });
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
                Intent intent = new Intent(SettingActivity.this,HomeActivity.class);
                startActivity(intent);
            case R.id.setting:
                Intent intent2 = new Intent(SettingActivity.this,SettingActivity.class);
                startActivity(intent2);
            case R.id.faq:
                Intent intent3 = new Intent(SettingActivity.this,FaqActivity.class);
                startActivity(intent3);

        }
        return true;
    }




    public void loadTheme(){
        if(DARK_THEME == true)
        {
            setTheme(R.style.Theme_DarkMode);
        }
        else
        {
            setTheme(R.style.Theme_AmazingHospital_2201735205);
        }
    }
}