package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG= "MainActivity";
    public static final String TEAM_A_SCORE="team_a_score";

    private int teamAScore;
    private int teamBScore;
    private TextView textViewTeamA;
    private TextView textViewTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTeamA= findViewById(R.id.team_a_score);
        textViewTeamB= findViewById(R.id.team_b_score);

        if(savedInstanceState != null){
            int scoreA =savedInstanceState.getInt(TEAM_A_SCORE);
            textViewTeamA.setText(""+scoreA);
        }

        Log.d(TAG, "oncreate");

    }

    //reset
    public void resetScore(View view)
    {
        teamAScore=0;
        teamBScore=0;
        displayScoreForTeamA(teamAScore);
        displayScoreForTeamB(teamBScore);
    }

    //team B
    public void add3ForTeamB(View view)
    {
        teamBScore=teamBScore +3;
        displayScoreForTeamB(teamBScore);
    }

    public void add2ForTeamB(View view) {
        teamBScore= teamBScore +2;
        displayScoreForTeamB(teamBScore);
    }

    public void add1ForTeamB(View view) {
        teamBScore= teamBScore+1;
        displayScoreForTeamB(teamBScore);
    }

    //team A
    public void add3ForTeamA(View view)
    {
        teamAScore=teamAScore +3;
        displayScoreForTeamA(teamAScore);
    }

    public void add2ForTeamA(View view) {
        teamAScore= teamAScore+2;
        displayScoreForTeamA(teamAScore);
    }

    public void add1ForTeamA(View view) {
        teamAScore= teamAScore+1;
        displayScoreForTeamA(teamAScore);
    }

    //display
    public void displayScoreForTeamA(int score)
    {
        textViewTeamA.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score)
    {
        textViewTeamB.setText(String.valueOf(score));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");

    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
        outState.putInt("TEAM_A_SCORE",teamAScore);
    }
}