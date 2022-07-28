package com.example.proyek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        getSupportActionBar().setTitle(R.string.kalkulator);
    }
}