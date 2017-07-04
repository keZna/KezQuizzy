package com.example.codetride.kezquizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RooneyQuiz extends AppCompatActivity {

    QuizClass objRonaldo = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive;
    public RadioGroup GroupSix, GroupSeven, GroupEight, GroupNine, GroupTen;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 2000;
    public int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooney_quiz);

        GroupOne= (RadioGroup) findViewById(R.id.GroupOne);
        GroupTwo= (RadioGroup) findViewById(R.id.GroupTwo);
        GroupThree= (RadioGroup) findViewById(R.id.GroupThree);
        GroupFour= (RadioGroup) findViewById(R.id.GroupFour);
        GroupFive= (RadioGroup) findViewById(R.id.GroupFive);
        GroupSix= (RadioGroup) findViewById(R.id.GroupSix);
        GroupSeven= (RadioGroup) findViewById(R.id.GroupSeven);
        GroupEight= (RadioGroup) findViewById(R.id.GroupEight);
        GroupNine= (RadioGroup) findViewById(R.id.GroupNine);
        GroupTen= (RadioGroup) findViewById(R.id.GroupTen);
        btnSubmit= (Button) findViewById(R.id.Submit);

        final TextView Total = (TextView) findViewById(R.id.Total);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ronaldo1=0;
                int ronaldo2=0;
                int ronaldo3=0;
                int ronaldo4=0;
                int ronaldo5=0;
                int ronaldo6=0;
                int ronaldo7=0;

                //setters
                objRonaldo.setRadOne(1);
                objRonaldo.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.rad2){
                    ronaldo1= objRonaldo.getRadOne();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad3){
                    ronaldo1=objRonaldo.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad5){
                    ronaldo1=objRonaldo.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad4){
                    ronaldo1=objRonaldo.getRadTwo();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.Germany){
                    ronaldo2= objRonaldo.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.USA){
                    ronaldo2=objRonaldo.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Scotland){
                    ronaldo2=objRonaldo.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.England){
                    ronaldo2=objRonaldo.getRadOne();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.Ramsey){
                    ronaldo3= objRonaldo.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Wayne){
                    ronaldo3=objRonaldo.getRadOne();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Beckham){
                    ronaldo3=objRonaldo.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Scholes){
                    ronaldo3=objRonaldo.getRadTwo();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.City){
                    ronaldo4= objRonaldo.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.United){
                    ronaldo4=objRonaldo.getRadOne();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Arsenal){
                    ronaldo4=objRonaldo.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Chelsea){
                    ronaldo4=objRonaldo.getRadTwo();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.rad21){
                    ronaldo5= objRonaldo.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad19){
                    ronaldo5=objRonaldo.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad17){
                    ronaldo5=objRonaldo.getRadOne();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad16){
                    ronaldo5=objRonaldo.getRadTwo();
                }

                //group6
                if (GroupSix.getCheckedRadioButtonId()==R.id.rad21U){
                    ronaldo6= objRonaldo.getRadTwo();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.rad19U){
                    ronaldo6=objRonaldo.getRadTwo();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.rad17U){
                    ronaldo6=objRonaldo.getRadOne();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.rad16U){
                    ronaldo6=objRonaldo.getRadTwo();
                }
                //group7
                if (GroupSeven.getCheckedRadioButtonId()==R.id.Community){
                    ronaldo7= objRonaldo.getRadOne();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.FA){
                    ronaldo7=objRonaldo.getRadTwo();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.League){
                    ronaldo7=objRonaldo.getRadTwo();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.Premier_League){
                    ronaldo7=objRonaldo.getRadTwo();
                }


                total= ronaldo1+ronaldo2+ronaldo3+ronaldo4+ronaldo5+ronaldo6+ronaldo7;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 7",Toast.LENGTH_SHORT).show();


                if (total==7){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(RooneyQuiz.this,Results.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<7){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(RooneyQuiz.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }



            }
        });

    }
}
