package com.example.androidtestapp;

import static com.example.androidtestapp.SplashActivity.listofQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
    ProgressBar progBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        allQuestionsList=listofQ;
        Collections.shuffle(allQuestionsList);
        modelClass=listofQ.get(index);
        Hooks();
        setAllData();
        progBar=findViewById(R.id.progress_bar_1);
        progBar.setMax(listofQ.size());
        progBar.setProgress(index);
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

    public void correct(String cardV) {
        Log.d("correct", "Setting green");
        if(cardV.equals("A")){
            cardOA.setBackgroundColor(Color.GREEN);
        }else if(cardV.equals("B")){
            cardOB.setBackgroundColor(Color.GREEN);
        }else if(cardV.equals("C")){
            cardOC.setBackgroundColor(Color.GREEN);
        }else if(cardV.equals("D")){
            cardOD.setBackgroundColor(Color.GREEN);
        }
        correctCount++;
    }
    public void wrong(String cardV) {
        Log.d("wrong", "Setting red");
        if(cardV.equals("A")){
            cardOA.setBackgroundColor(Color.RED);
        }else if(cardV.equals("B")){
            cardOB.setBackgroundColor(Color.RED);
        }else if(cardV.equals("C")){
            cardOC.setBackgroundColor(Color.RED);
        }else if(cardV.equals("D")){
            cardOD.setBackgroundColor(Color.RED);
        }
        wrongCount++;
    }
    private void gameWon() {
        Intent intent= new Intent(DashboardActivity.this, WonActivity.class);
        intent.putExtra("correct", correctCount);
        intent.putExtra("wrong", wrongCount);
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
        Log.d("resetColor", "Cleaning cards");
        cardOA.setBackgroundColor(Color.WHITE);
        cardOB.setBackgroundColor(Color.WHITE);
        cardOC.setBackgroundColor(Color.WHITE);
        cardOD.setBackgroundColor(Color.WHITE);
        Log.d("resetColor", "END of cleaning cards");
    }
    public void optionAClick(View view) {
        Log.d("optionA", "Clicking A");
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoA().equals(modelClass.getAns())){
            if(index<listofQ.size()) {
                Log.d("optionA", "Correct A");
                correct("A");
            }else {
                gameWon();
            }
        }else {
            Log.d("optionA", "Wrong A");
            wrong("A");
        }
    }
    public void optionBClick(View view) {
        Log.d("optionB", "Clicking B");
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoB().equals(modelClass.getAns())){
            if(index<listofQ.size()) {
                Log.d("optionB", "Correct B");
                correct("B");
            }else {
                gameWon();
            }
        }else {
            Log.d("optionB", "Wrong B");
            wrong("B");
        }
    }
    public void optionCClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoC().equals(modelClass.getAns())){
            if(index<listofQ.size()) {
                correct("C");
            }else {
                gameWon();
            }
        }else {
            wrong("C");
        }
    }
    public void optionDClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if(modelClass.getoD().equals(modelClass.getAns())){
            if(index<listofQ.size()) {
                correct("D");
            }else {
                gameWon();
            }
        }else {
            wrong("D");
        }
    }
    public void nextOnClick(View view) {
        Log.d("nextButton", "Clicking next");
        index++;
        if(index < listofQ.size()){
            Log.d("nextButton", "Going next");
            modelClass = listofQ.get(index);
            setAllData();
            resetColor();
        }else{
            Log.d("nextButton", "Game won");
            gameWon();
        }
        enableButton();
        progBar.setProgress(index);
        nextBtn.setClickable(false);
    }
}