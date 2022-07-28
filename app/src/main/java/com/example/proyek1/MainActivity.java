package com.example.proyek1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.m_nama){
            Intent intent = new Intent(this, NamaActivity.class);
            startActivity(intent);
        }else if (item.getItemId() == R.id.m_kalkulator){
            Intent intent = new Intent(this, KalkulatorActivity.class);
            startActivity(intent);
        }else if (item.getItemId() == R.id.m_negara){
            Intent intent = new Intent(this, NegaraActivity.class);
            startActivity(intent);
        }
        return true;
    }
}