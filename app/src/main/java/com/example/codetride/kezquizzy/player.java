package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class player extends AppCompatActivity implements View.OnClickListener {


    public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Button btnExit = (Button) findViewById(R.id.Exit);
        ImageView ronaldo = (ImageView) findViewById(R.id.ronaldo);
        ImageView messi = (ImageView) findViewById(R.id.messi);
        ImageView rooney = (ImageView) findViewById(R.id.rooney);
        ImageView zlatan = (ImageView) findViewById(R.id.zlatan);

        btnExit.setOnClickListener(this);
        ronaldo.setOnClickListener(this);
        messi.setOnClickListener(this);
        rooney.setOnClickListener(this);
        zlatan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.Exit:{
                finish();
                break;
            }
            case R.id.ronaldo:{
                intent = new Intent(this,Ronaldo.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.messi:{
                intent = new Intent(player.this,Messi.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.rooney:{
                intent = new Intent(this,Rooney.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.zlatan:{
                intent = new Intent(this,Zlatan.class);
                startActivity(intent);
                finish();
                break;
            }
        }
    }
}
