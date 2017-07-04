package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Messi extends AppCompatActivity {

    public ProgressBar ProMessi;
    public static int MESSI = 1000;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messi);

        ProMessi = (ProgressBar) findViewById(R.id.proMessi);
        ProMessi.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(Messi.this,MessiQuiz.class);
                startActivity(intent);

                finish();
            }
        },MESSI);
    }
}
