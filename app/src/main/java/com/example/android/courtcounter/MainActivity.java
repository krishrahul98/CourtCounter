package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA;
    int scoreForTeamB;
    @BindView(R.id.team_a_score)
    TextView scoreViewA;
    @BindView(R.id.team_b_score)
    TextView scoreViewB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife View Binding
        ButterKnife.bind(this);
    }
    public void increaseBy3ForA(View view) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    public void increaseBy2ForA(View view) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    public void freeThrowForA(View view) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }

    public void increaseBy3ForB(View view) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }

    public void increaseBy2ForB(View view) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }

    public void freeThrowForB(View view) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    public void reset(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamB);
        displayForTeamB(scoreForTeamB);
    }

    public void displayForTeamA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }
}
