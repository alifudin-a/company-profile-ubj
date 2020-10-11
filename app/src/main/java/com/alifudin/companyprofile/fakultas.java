package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fakultas extends AppCompatActivity {

    private Button btnBack, btnFk1, btnFk3, btnFk4, btnFk5, btnFk6, btnFk7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakultas);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnFk1 = (Button) findViewById(R.id.btnFk1);
        btnFk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, fk_hukum.class);
                startActivity(i);
            }
        });

        btnFk3 = (Button) findViewById(R.id.btnFk3);
        btnFk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, fk_teknik.class);
                startActivity(i);
            }
        });

        btnFk4 = (Button) findViewById(R.id.btnFk4);
        btnFk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, fk_ekonomi_dan_bisnis.class);
                startActivity(i);
            }
        });

        btnFk5 = (Button) findViewById(R.id.btnFk5);
        btnFk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, fk_ilmu_komunikasi.class);
                startActivity(i);
            }
        });

        btnFk6 = (Button) findViewById(R.id.btnFk6);
        btnFk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, fk_psikologi.class);
                startActivity(i);
            }
        });

        btnFk7 = (Button) findViewById(R.id.btnFk7);
        btnFk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fakultas.this, fk_ilmu_pendidikan.class);
                startActivity(i);
            }
        });
    }
}