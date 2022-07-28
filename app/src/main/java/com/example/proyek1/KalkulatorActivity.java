package com.example.proyek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        getSupportActionBar().setTitle(R.string.kalkulator);

        EditText etAngka1 = findViewById(R.id.et_angka1);
        EditText etAngka2 = findViewById(R.id.et_angka2);

        Button bTambah = findViewById(R.id.b_tambah);
        Button bKurang = findViewById(R.id.b_kurang);
        Button bKali = findViewById(R.id.b_kali);
        Button bBagi = findViewById(R.id.b_bagi);
        Button bBersih = findViewById(R.id.b_bersih);

        TextView tvHasil = findViewById(R.id.tv_hasil);

        bTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    double hasil = angka1 + angka2;
                    String sHasil = getString(R.string.teks_hasil, hasil);
                    tvHasil.setText(sHasil);
                }else {
                    Toast.makeText(KalkulatorActivity.this, getString(R.string.pesan_kesalahan), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    Double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    Double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    double hasil = angka1 - angka2;
                    String sHasil = getString(R.string.teks_hasil, hasil);
                    tvHasil.setText(sHasil);
                }else {
                    Toast.makeText(KalkulatorActivity.this, getString(R.string.pesan_kesalahan), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    Double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    Double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    double hasil = angka1 * angka2;
                    String sHasil = getString(R.string.teks_hasil, hasil);
                    tvHasil.setText(sHasil);
                }else {
                    Toast.makeText(KalkulatorActivity.this, getString(R.string.pesan_kesalahan), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    Double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    Double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    double hasil = angka1 / angka2;
                    String sHasil = getString(R.string.teks_hasil, hasil);
                    tvHasil.setText(sHasil);
                }else {
                    Toast.makeText(KalkulatorActivity.this, getString(R.string.pesan_kesalahan), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bBersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etAngka1.setText("");
                etAngka2.setText("");
                tvHasil.setText("");
            }
        });
    }
}