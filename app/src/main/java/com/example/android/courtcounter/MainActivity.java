package com.example.android.courtcounter;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA, scoreForTeamB;
    private TextView scoreViewA;
    private TextView scoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        scoreViewA= (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
}
