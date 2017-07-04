package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView player = (TextView) findViewById(R.id.Player);
        TextView team = (TextView) findViewById(R.id.Team);
        Button exit = (Button) findViewById(R.id.Exit);

        exit.setOnClickListener(this);
        player.setOnClickListener(this);
        team.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Exit:{
                finish();
                break;
            }
            case R.id.Player:{
                intent = new Intent(MainActivity.this,player.class);
                startActivity(intent);
                break;
            }
            case R.id.Team:{
                intent = new Intent(MainActivity.this,team.class);
                startActivity(intent);
                break;
            }
        }
    }
}
