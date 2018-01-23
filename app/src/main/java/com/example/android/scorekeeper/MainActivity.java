package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreTeamASave;
    int scoreTeamBSave;

    private String scoreTeam_A = "ScoreTeamA";
    private String scoreTeam_B = "ScoreTeamB";
    private String scoreTeamA_Save = "ScoreTeamASave";
    private String scoreTeamB_Save = "ScoreTeamBSave";
    private String teamAName = "TeamAName";
    private String teamBName = "TeamBName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onSaveInstanceState
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(scoreTeam_A, scoreTeamA);
        outState.putInt(scoreTeam_B, scoreTeamB);
        outState.putInt(scoreTeamA_Save, scoreTeamASave);
        outState.putInt(scoreTeamB_Save, scoreTeamBSave);

        outState.putString("TeamAName", teamAName);
        outState.putString("TeamBName", teamBName);
    }

    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        scoreTeamA = savedInstanceState.getInt(scoreTeam_A);
        scoreTeamB = savedInstanceState.getInt (scoreTeam_B);
        scoreTeamASave = savedInstanceState.getInt(scoreTeamA_Save);
        scoreTeamBSave = savedInstanceState.getInt (scoreTeamB_Save);

        teamAName = savedInstanceState.getString("TeamAName");
        teamBName = savedInstanceState.getString("TeamBName");


        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the 3 Points is clicked for Team A.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the 2 Points is clicked for Team A.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the Free Throw is clicked for Team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the 3 Points is clicked for Team B.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the 2 Points is clicked for Team B.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the Free Throw is clicked for Team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
