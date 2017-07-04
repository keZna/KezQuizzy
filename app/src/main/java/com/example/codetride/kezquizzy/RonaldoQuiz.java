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

public class RonaldoQuiz extends AppCompatActivity {

    QuizClass objRonaldo = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive, GroupSix, GroupSeven, GroupEight, GroupNine, GroupTen;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 2000;
    public int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ronaldo_quiz);

        GroupOne= (RadioGroup) findViewById(R.id.GroupOne);
        GroupTwo= (RadioGroup) findViewById(R.id.GroupTwo);
        GroupThree= (RadioGroup) findViewById(R.id.GroupThree);
        GroupFour= (RadioGroup) findViewById(R.id.GroupFour);
        GroupFive= (RadioGroup) findViewById(R.id.GroupFive);
        GroupSix = (RadioGroup) findViewById(R.id.GroupSix);
        GroupSeven = (RadioGroup) findViewById(R.id.GroupSeven);
        GroupEight = (RadioGroup) findViewById(R.id.GroupEight);
        GroupNine = (RadioGroup) findViewById(R.id.GroupNine);
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
                int ronaldo8=0;
                int ronaldo9=0;
                int ronaldo10=0;

                //setters
                objRonaldo.setRadOne(1);
                objRonaldo.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.rad31){
                    ronaldo1= objRonaldo.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad28){
                    ronaldo1=objRonaldo.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad25){
                    ronaldo1=objRonaldo.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad32){
                    ronaldo1=objRonaldo.getRadOne();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.rad4){
                    ronaldo2= objRonaldo.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad7){
                    ronaldo2=objRonaldo.getRadOne();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad1){
                    ronaldo2=objRonaldo.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad2){
                    ronaldo2=objRonaldo.getRadTwo();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.Barcelona){
                    ronaldo3= objRonaldo.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Athletico){
                    ronaldo3=objRonaldo.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Real){
                    ronaldo3=objRonaldo.getRadOne();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Manchester){
                    ronaldo3=objRonaldo.getRadTwo();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.Christiano){
                    ronaldo4= objRonaldo.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Carlos){
                    ronaldo4=objRonaldo.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Call){
                    ronaldo4=objRonaldo.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Cristiano){
                    ronaldo4=objRonaldo.getRadOne();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.rad4cup){
                    ronaldo5= objRonaldo.getRadOne();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad5){
                    ronaldo5=objRonaldo.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad3){
                    ronaldo5=objRonaldo.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad6){
                    ronaldo5=objRonaldo.getRadTwo();
                }

                //group6
                if (GroupSix.getCheckedRadioButtonId()==R.id.CristianoRonaldo){
                    ronaldo6= objRonaldo.getRadTwo();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.DosSantos){
                    ronaldo6 = objRonaldo.getRadTwo();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.Aveiro){
                    ronaldo6=objRonaldo.getRadOne();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.NoDos){
                    ronaldo6=objRonaldo.getRadTwo();
                }

                //group7
                if (GroupSeven.getCheckedRadioButtonId()==R.id.rad29){
                    ronaldo7= objRonaldo.getRadOne();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.rad22){
                    ronaldo7 = objRonaldo.getRadTwo();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.rad26){
                    ronaldo7=objRonaldo.getRadTwo();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.rad30){
                    ronaldo7=objRonaldo.getRadTwo();
                }

                //group8
                if (GroupEight.getCheckedRadioButtonId()==R.id.rad1980){
                    ronaldo8= objRonaldo.getRadTwo();
                }else if (GroupEight.getCheckedRadioButtonId()==R.id.rad1975){
                    ronaldo8 = objRonaldo.getRadTwo();
                }else if (GroupEight.getCheckedRadioButtonId()==R.id.rad1963){
                    ronaldo8=objRonaldo.getRadTwo();
                }else if (GroupEight.getCheckedRadioButtonId()==R.id.rad1985){
                    ronaldo8=objRonaldo.getRadOne();
                }

                //group9
                if (GroupNine.getCheckedRadioButtonId()==R.id.PSG){
                    ronaldo9= objRonaldo.getRadTwo();
                }else if (GroupNine.getCheckedRadioButtonId()==R.id.BarcelonaExpensive){
                    ronaldo9 = objRonaldo.getRadTwo();
                }else if (GroupNine.getCheckedRadioButtonId()==R.id.MadridExp){
                    ronaldo9=objRonaldo.getRadOne();
                }else if (GroupNine.getCheckedRadioButtonId()==R.id.Munich){
                    ronaldo9=objRonaldo.getRadTwo();
                }

                //group10
                if (GroupTen.getCheckedRadioButtonId()==R.id.rad30Goals){
                    ronaldo10= objRonaldo.getRadOne();
                }else if (GroupTen.getCheckedRadioButtonId()==R.id.rad27Goals){
                    ronaldo10 = objRonaldo.getRadTwo();
                }else if (GroupTen.getCheckedRadioButtonId()==R.id.rad25Goals){
                    ronaldo10=objRonaldo.getRadTwo();
                }else if (GroupTen.getCheckedRadioButtonId()==R.id.rad34Goals){
                    ronaldo10=objRonaldo.getRadTwo();
                }



                total= ronaldo1+ronaldo2+ronaldo3+ronaldo4+ronaldo5+ronaldo6+ronaldo7+ronaldo8+ronaldo9+ronaldo10;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 10",Toast.LENGTH_SHORT).show();


                if (total==10){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(RonaldoQuiz.this,Results.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<10){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                           Intent intent = new Intent(RonaldoQuiz.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }



            }
        });

    }
}
