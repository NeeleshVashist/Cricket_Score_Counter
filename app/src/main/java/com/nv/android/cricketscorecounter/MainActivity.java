package com.nv.android.cricketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    int outA=0;
    int outB=0;
    int overA=0;
    int overB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void six1(View v) {
        if(outA!=10)
        {
            scoreTeamA+=6;
        }
        displayForTeamA(scoreTeamA);
    }

    public void four1(View v) {
        if(outA!=10)
        {
            scoreTeamA+=4;
        }
        displayForTeamA(scoreTeamA);
    }

    public void three1(View v) {
        if(outA!=10)
        {
            scoreTeamA+=3;
        }
        displayForTeamA(scoreTeamA);
    }

    public void two1(View v) {
        if(outA!=10)
        {
            scoreTeamA+=2;
        }
        displayForTeamA(scoreTeamA);
    }

    public void one1(View v) {
        if(outA!=10)
        {
            scoreTeamA+=1;
        }
        displayForTeamA(scoreTeamA);
    }

    public void out1(View v) {
        outA+=1;
        if(outA>10)
        {
            outA=10;
        }
        outTeamA(outA);
    }

    public void over1(View v) {
        if(outA!=10)
        {
            overA+=1;
        }
        if(overA>50)
        {
            overA=50;
        }
        overTeamA(overA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team A.
     */
    public void outTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team A.
     */
    public void overTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_over);
        scoreView.setText(String.valueOf(score));
    }

    public void six2(View v) {
        if(outB!=10)
        {
            scoreTeamB+=6;
        }
        displayForTeamB(scoreTeamB);
    }

    public void four2(View v) {
        if(outB!=10)
        {
            scoreTeamB+=4;
        }
        displayForTeamB(scoreTeamB);
    }

    public void three2(View v) {
        if(outB!=10)
        {
            scoreTeamB+=3;
        }
        displayForTeamB(scoreTeamB);
    }

    public void two2(View v) {
        if(outB!=10)
        {
            scoreTeamB+=2;
        }
        displayForTeamB(scoreTeamB);
    }

    public void one2(View v) {
        if(outB!=10)
        {
            scoreTeamB+=1;
        }
        displayForTeamB(scoreTeamB);
    }

    public void out2(View v) {
        outB+=1;
        if(outB>10)
        {
            outB=10;
        }
        outTeamB(outB);
    }

    public void over2(View v) {
        if(outB!=10)
        {
            overB+=1;
        }
        if(overB>50)
        {
            overB=50;
        }
        overTeamB(overB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team B.
     */
    public void outTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given out for Team B.
     */
    public void overTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_over);
        scoreView.setText(String.valueOf(score));
    }


    public void resetScore(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        outA=0;
        outB=0;
        overA=0;
        overB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        outTeamA(outA);
        outTeamB(outB);
        overTeamA(overA);
        overTeamB(overB);
    }
}
