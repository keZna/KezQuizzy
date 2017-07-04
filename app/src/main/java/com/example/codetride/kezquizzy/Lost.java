package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Lost extends AppCompatActivity {

    public ProgressBar proLost;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);

        proLost = (ProgressBar) findViewById(R.id.proLost);
        proLost.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              intent = new Intent(Lost.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
