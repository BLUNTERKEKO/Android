package com.example.androidtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import static com.example.androidtestapp.SplashActivity.listofQ;

public class WonActivity extends AppCompatActivity {

    ProgressBar circularProgressBar;
    TextView resultText;
    int correct, wrong;
    private Button btn_restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);

        correct=getIntent().getIntExtra("correct", 0);
        wrong=getIntent().getIntExtra("wrong", 0);

        circularProgressBar=findViewById(R.id.progress_bar_2);
        resultText=findViewById(R.id.resultText);

        circularProgressBar.setMax(listofQ.size());
        circularProgressBar.setProgress(correct);
        resultText.setText(correct + "/" + listofQ.size());

        btn_restart = findViewById(R.id.btn_restart);
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
    }
}