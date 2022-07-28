package com.example.proyek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        getSupportActionBar().setTitle(R.string.nama);

        EditText etNama = findViewById(R.id.et_nama);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ambil nilai etnama
                String nama = etNama.getText().toString();
                //tampilkan dalam toast
                Toast.makeText(NamaActivity.this, "Hey, "+nama, Toast.LENGTH_SHORT).show();
            }
        });
    }
}