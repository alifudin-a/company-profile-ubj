package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prodi_fkh_ilmu_hukum extends AppCompatActivity {

    private Button btnBack, btnBackk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodi_fkh_ilmu_hukum);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi_fkh_ilmu_hukum.this, fk_hukum.class);
                startActivity(i);
            }
        });

        btnBackk = (Button) findViewById(R.id.btnBackk);
        btnBackk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi_fkh_ilmu_hukum.this, prodi.class);
                startActivity(i);
            }
        });
    }
}