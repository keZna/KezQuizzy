package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    public ProgressBar ProChamps;
    public Intent intent;
    RelativeLayout LayoutResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

            ProChamps = (ProgressBar) findViewById(R.id.proChamps);
            ProChamps.setVisibility(View.INVISIBLE);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    intent = new Intent(Results.this, player.class);
                    startActivity(intent);
                    finish();
                }
            }, 3000);


    }
}
