package com.example.androidtestapp;

import static com.example.androidtestapp.SplashActivity.listofQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    List<ModelClass> allQuestionsList;
    ModelClass modelClass;
    int index=0;
    TextView card_question, optionA, optionB, optionC, optionD;
    CardView cardOA, cardOB, cardOC, cardOD;
    int correctCount=0;
    int wrongCount=0;
    LinearLayout nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Hooks();
        setAllData();

        allQuestionsList=listofQ;
        Collections.shuffle(allQuestionsList);
        modelClass=listofQ.get(index);

        nextBtn.setClickable(false);
    }
    private void setAllData() {

        card_question.setText(modelClass.getQuestion());
        optionA.setText(modelClass.getoA());
        optionB.setText(modelClass.getoB());
        optionC.setText(modelClass.getoC());
        optionD.setText(modelClass.getoD());
    }
    private void Hooks() {
        card_question=findViewById(R.id.card_question);
        optionA=findViewById(R.id.card_optionA);
        optionB=findViewById(R.id.card_optionB);
        optionC=findViewById(R.id.card_optionC);
        optionD=findViewById(R.id.card_optionD);

        cardOA=findViewById(R.id.cardA);
        cardOB=findViewById(R.id.cardB);
        cardOC=findViewById(R.id.cardC);
        cardOD=findViewById(R.id.cardD);

        nextBtn=findViewById(R.id.nextBtn);
    }
    public void Correct(CardView cardView) {
        cardView.setBackgroundColor(getResources().getColor(R.color.green));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                correctCount++;
                index++;
                modelClass = listofQ.get(index);
                setAllData();
                resetColor();
            }
        });
    }
    public void Wrong(CardView cardOA) {
        cardOA.setCardBackgroundColor(getResources().getColor(R.color.red));

        nextBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongCount++;

                if(index<listofQ.size()-1){
                    index++;
                    modelClass =listofQ.get(index);
                    setAllData();
                }else{
                    GameWon();
                }
            }
        }));
    }
    private void GameWon() {
        Intent intent= new Intent(DashboardActivity.this, WonActivity.class);
        intent.putExtra("Correct", correctCount);
        intent.putExtra("Wrong", wrongCount);
        startActivity(intent);
    }
    public void enableButton(){
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);
    }
    public void disableButton(){
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);
    }
    public void resetColor(){
        cardOA.setBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setBackgroundColor(getResources().getColor(R.color.white));
    }
    public void optionAClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoA().equals(modelClass.getAns())){
            cardOA.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index<listofQ.size()-1) {
                Correct(cardOA);

            }else {
                GameWon();
            }
        }else {
            Wrong(cardOA);
        }
    }
    public void optionBClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoB().equals(modelClass.getAns())){
            cardOB.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index<listofQ.size()-1) {
                Correct(cardOB);

            }else {
                GameWon();
            }
        }else {
            Wrong(cardOB);
        }
    }
    public void optionCClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoC().equals(modelClass.getAns())){
            cardOC.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index<listofQ.size()-1) {
                Correct(cardOC);

            }else {
                GameWon();
            }
        }else {
            Wrong(cardOC);
        }
    }
    public void optionDClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoD().equals(modelClass.getAns())){
            cardOD.setCardBackgroundColor(getResources().getColor(R.color.green));

            if(index<listofQ.size()-1) {
                Correct(cardOD);

            }else {
                GameWon();
            }
        }else {
            Wrong(cardOD);
        }
    }
}