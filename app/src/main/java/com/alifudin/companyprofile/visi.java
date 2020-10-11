package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class visi extends AppCompatActivity {

    private Button btnVisi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visi);
        btnVisi1 = (Button) findViewById(R.id.btnVisi1);
        btnVisi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(visi.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}