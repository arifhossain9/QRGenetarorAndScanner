package com.example.ab.qrgenetarorandscanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainScn = findViewById(R.id.mainScn);
        mainScn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentScn = new Intent(MainActivity.this, ScannerActivity.class);
                startActivity(intentScn);
            }
        });
        Button mainGen =  findViewById(R.id.mainGen);
        mainGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGen = new Intent(MainActivity.this,GeneratorActivity.class);
                startActivity(intentGen);
            }
        });
        Button exitBtn =  findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
