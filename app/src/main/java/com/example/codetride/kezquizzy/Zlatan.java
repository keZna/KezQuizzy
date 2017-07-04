package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Zlatan extends AppCompatActivity {

    public Intent intent;
    public ProgressBar ProZlatan;
    private static int ZLATAN = 900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zlatan);

        ProZlatan= (ProgressBar) findViewById(R.id.proZlatan);
        ProZlatan.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent= new Intent(Zlatan.this,ZlatanQuiz.class);
                startActivity(intent);

                finish();
            }
        },ZLATAN);
    }
}
