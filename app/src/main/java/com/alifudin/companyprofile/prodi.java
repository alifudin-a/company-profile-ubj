package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prodi extends AppCompatActivity {

    private Button btnBack, btnPr1, btnPr2, btnPr3, btnPr4, btnPr5, btnPr6, btnPr7, btnPr8, btnPr9, btnPr12, btnPr13, btnPr10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodi);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnPr1 = (Button) findViewById(R.id.btnPr1);
        btnPr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkh_ilmu_hukum.class);
                startActivity(i);
            }
        });

        btnPr2 = (Button) findViewById(R.id.btnPr2);
        btnPr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkh_magister_hukum.class);
                startActivity(i);
            }
        });

        btnPr3 = (Button) findViewById(R.id.btnPr3);
        btnPr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkt_industri.class);
                startActivity(i);
            }
        });

        btnPr4 = (Button) findViewById(R.id.btnPr4);
        btnPr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkt_kimia.class);
                startActivity(i);
            }
        });

        btnPr5 = (Button) findViewById(R.id.btnPr5);
        btnPr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkt_lingkungan.class);
                startActivity(i);
            }
        });


        btnPr6 = (Button) findViewById(R.id.btnPr6);
        btnPr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkt_perminyakan.class);
                startActivity(i);
            }
        });

        btnPr7 = (Button) findViewById(R.id.btnPr7);
        btnPr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkedb_akuntansi.class);
                startActivity(i);
            }
        });

        btnPr8 = (Button) findViewById(R.id.btnPr8);
        btnPr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkedb_manajemen.class);
                startActivity(i);
            }
        });

        btnPr9 = (Button) findViewById(R.id.btnPr9);
        btnPr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkedb_magister_manajemen.class);
                startActivity(i);
            }
        });

        btnPr12 = (Button) findViewById(R.id.btnPr12);
        btnPr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fip_pendidikan_guru_sekolah_dasar.class);
                startActivity(i);
            }
        });

        btnPr13 = (Button) findViewById(R.id.btnPr13);
        btnPr13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fip_pendidikan_kepelatihan_olahraga.class);
                startActivity(i);
            }
        });

        btnPr10 = (Button) findViewById(R.id.btnPr10);
        btnPr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi.this, prodi_fkt_informatika.class);
                startActivity(i);
            }
        });
    }
}