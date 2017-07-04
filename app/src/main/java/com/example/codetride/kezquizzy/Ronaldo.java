package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Ronaldo extends AppCompatActivity {

    public Intent intent;

    // Splash screen timer
    private static int RONALDO= 1000;
    private ProgressBar ProRonaldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ronaldo);

//        intent = new Intent(Ronaldo.this,MainActivity.class);
//        startActivity(intent);


        ProRonaldo=(ProgressBar)findViewById(R.id.proRonaldo);
        ProRonaldo.setVisibility(View.INVISIBLE);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your application welcome activity
                Intent i = new Intent(Ronaldo.this, RonaldoQuiz.class);
                startActivity(i);

                finish();
            }
        }, RONALDO);
    }

}
