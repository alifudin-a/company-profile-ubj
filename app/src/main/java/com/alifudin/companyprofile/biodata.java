package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biodata extends AppCompatActivity {

    private Button btnBio1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        btnBio1 = (Button) findViewById(R.id.btnBio1);
        btnBio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(biodata.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}