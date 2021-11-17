package com.example.androidtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WonActivity extends AppCompatActivity {

    ProgressBar circularProgressBar;
    TextView resultText;
    int correct, wrong;
    LinearLayout btn_exit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);

        correct=getIntent().getIntExtra("correct", 0);
        wrong=getIntent().getIntExtra("wrong", 0);

        circularProgressBar=findViewById(R.id.CircularProgressBar);
        resultText=findViewById(R.id.resultText);
        btn_exit2=findViewById(R.id.btn_exit2);

        circularProgressBar.setProgress(correct);
        resultText.setText(correct + "/30");

        btn_exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());

                overridePendingTransition(0, 0);
                String time = System.currentTimeMillis() + "";
            }
        });
    }
}