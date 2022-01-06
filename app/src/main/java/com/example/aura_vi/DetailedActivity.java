package com.example.aura_vi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailedActivity extends AppCompatActivity {

    private Button visualize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        visualize = findViewById(R.id.visualize);

        visualize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailedActivity.this, ArActivity.class));
                finish();
            }
        });


    }
}
