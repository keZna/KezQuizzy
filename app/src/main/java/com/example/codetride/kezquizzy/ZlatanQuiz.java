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

public class ZlatanQuiz extends AppCompatActivity {

    QuizClass objZlatan = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 3000;
    public int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zlatan_quiz);

        GroupOne= (RadioGroup) findViewById(R.id.GroupOne);
        GroupTwo= (RadioGroup) findViewById(R.id.GroupTwo);
        GroupThree= (RadioGroup) findViewById(R.id.GroupThree);
        GroupFour= (RadioGroup) findViewById(R.id.GroupFour);
        GroupFive= (RadioGroup) findViewById(R.id.GroupFive);
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

                //setters
                objZlatan.setRadOne(1);
                objZlatan.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.Ibrahinovic){
                    ronaldo1= objZlatan.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Latan){
                    ronaldo1=objZlatan.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Ibrahimovic){
                    ronaldo1=objZlatan.getRadOne();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Beckhamovic){
                    ronaldo1=objZlatan.getRadTwo();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.Ireland){
                    ronaldo2= objZlatan.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Sweden){
                    ronaldo2=objZlatan.getRadOne();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Wales){
                    ronaldo2=objZlatan.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Chile){
                    ronaldo2=objZlatan.getRadTwo();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.rad50){
                    ronaldo3= objZlatan.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.rad45){
                    ronaldo3=objZlatan.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.rad70){
                    ronaldo3=objZlatan.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.rad62){
                    ronaldo3=objZlatan.getRadOne();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.Raiola){
                    ronaldo4= objZlatan.getRadOne();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Carlos){
                    ronaldo4=objZlatan.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Calvin){
                    ronaldo4=objZlatan.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Willien){
                    ronaldo4=objZlatan.getRadTwo();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.rad2011){
                    ronaldo5= objZlatan.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad2012){
                    ronaldo5=objZlatan.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad2013){
                    ronaldo5=objZlatan.getRadOne();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad2014){
                    ronaldo5=objZlatan.getRadTwo();
                }

                total= ronaldo1+ronaldo2+ronaldo3+ronaldo4+ronaldo5;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 5",Toast.LENGTH_SHORT).show();


                if (total==5){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ZlatanQuiz.this,Results.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<5){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ZlatanQuiz.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }



            }
        });


    }
}
