package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prodi_fip_pendidikan_kepelatihan_olahraga extends AppCompatActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodi_fip_pendidikan_kepelatihan_olahraga);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prodi_fip_pendidikan_kepelatihan_olahraga.this, prodi.class);
                startActivity(i);
            }
        });
    }
}