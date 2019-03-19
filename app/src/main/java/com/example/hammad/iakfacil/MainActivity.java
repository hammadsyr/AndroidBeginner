package com.example.hammad.iakfacil;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0, scoreTeamB = 0;

    //onCreate : called when you open the application first time
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar toolbar = getSupportActionBar();
        assert toolbar != null;
        toolbar.setTitle(getString(R.string.app_name));

        Button addA = findViewById(R.id.btn_add_a);
        Button subtractA = findViewById(R.id.btn_subtract_a);
        Button resetA = findViewById(R.id.btn_reset_a);
        Button addB = findViewById(R.id.btn_add_b);
        Button subtractB = findViewById(R.id.btn_subtract_b);
        Button resetB = findViewById(R.id.btn_reset_b);
        final TextView scoreTextA = findViewById(R.id.tv_score_a);
        final TextView scoreTextB = findViewById(R.id.tv_score_b);

        //you also can add onclick by implementing View.OnClickListener,
        addA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 1;
                scoreTextA.setText(String.format(getResources().getString(R.string.score), scoreTeamA));
            }
        });
        subtractA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scoreTeamA <= 0) {
                    Toast.makeText(getApplicationContext(),
                            String.format(getResources().getString(R.string.now_score), scoreTeamA), Toast.LENGTH_SHORT).show();
                } else {
                    scoreTeamA = scoreTeamA - 1;
                    scoreTextA.setText(String.format(getResources().getString(R.string.score), scoreTeamA));
                }
            }
        });
        resetA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTextA.setText(String.format(getResources().getString(R.string.score), scoreTeamA));
            }
        });

        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 1;
                scoreTextB.setText(String.format(getResources().getString(R.string.score), scoreTeamB));
            }
        });
        subtractB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scoreTeamB <= 0) {
                    Toast.makeText(getApplicationContext(),
                            String.format(getResources().getString(R.string.now_score), scoreTeamB), Toast.LENGTH_SHORT).show();
                } else {
                    scoreTeamB = scoreTeamB - 1;
                    scoreTextB.setText(String.format(getResources().getString(R.string.score), scoreTeamB));
                }
            }
        });
        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = 0;
                scoreTextB.setText(String.format(getResources().getString(R.string.score), scoreTeamB));
            }
        });
    }
}
