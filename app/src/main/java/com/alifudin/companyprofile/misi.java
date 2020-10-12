package com.alifudin.companyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class misi extends AppCompatActivity {

    private Button btnMisi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misi);
        btnMisi1 = (Button) findViewById(R.id.btnMisi1);
        btnMisi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(misi.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}