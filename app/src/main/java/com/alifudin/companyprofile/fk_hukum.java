package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fk_hukum extends AppCompatActivity {

    private Button btnBack, btnProdiS1, btnProdiS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fk_hukum);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fk_hukum.this, fakultas.class);
                startActivity(i);
            }
        });

        btnProdiS1 = (Button) findViewById(R.id.btnProdiS1);
        btnProdiS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fk_hukum.this, prodi_fkh_ilmu_hukum.class);
                startActivity(i);
            }
        });

        btnProdiS2 = (Button) findViewById(R.id.btnProdiS2);
        btnProdiS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(fk_hukum.this, prodi_fkh_magister_hukum.class);
                startActivity(i);
            }
        });
    }
}