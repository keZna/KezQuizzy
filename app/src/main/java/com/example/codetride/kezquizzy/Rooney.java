package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Rooney extends AppCompatActivity {

    public ProgressBar proRooney;
    public Intent intent;
    private static int ROONEY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooney);

        proRooney = (ProgressBar) findViewById(R.id.proRooney);
        proRooney.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent= new Intent(Rooney.this,RooneyQuiz.class);
                startActivity(intent);

                finish();
            }
        },ROONEY);

    }
}
