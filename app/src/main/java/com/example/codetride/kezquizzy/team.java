package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class team extends AppCompatActivity implements View.OnClickListener {

    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        Button btnExit = (Button) findViewById(R.id.Exit);
        ImageView Sundowns = (ImageView) findViewById(R.id.sundowns);
        ImageView PSL = (ImageView) findViewById(R.id.psl);
        ImageView man = (ImageView) findViewById(R.id.man);
        btnExit.setOnClickListener(this);
        Sundowns.setOnClickListener(this);
        PSL.setOnClickListener(this);
        man.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Exit: {
                finish();
                break;
            }
             case R.id.sundowns: {
                intent = new Intent(this, SundownsQuiz.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.psl: {
                intent = new Intent(this, PSL.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.man: {
                intent = new Intent(this, Manchester.class);
                startActivity(intent);
                finish();
                break;
            }
        }
    }
}