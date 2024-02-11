package com.geeks.home_work_2_3_ai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.conteiner, firstFragment).commit();
    }
}