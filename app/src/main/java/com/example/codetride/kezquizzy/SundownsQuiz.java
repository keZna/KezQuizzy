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

public class SundownsQuiz extends AppCompatActivity {

    QuizClass objSundowns = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 2000;
    public int total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sundowns_quiz);

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

                int sundowns1=0;
                int sundowns2=0;
                int sundowns3=0;
                int sundowns4=0;
                int sundowns5=0;

                //setters
                objSundowns.setRadOne(1);
                objSundowns.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.Angelo){
                    sundowns1= objSundowns.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Zola){
                    sundowns1=objSundowns.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Natasha){
                    sundowns1=objSundowns.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Patrice){
                    sundowns1=objSundowns.getRadOne();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.Brazilians){
                    sundowns2= objSundowns.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Masandawana){
                    sundowns2=objSundowns.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Mamelodi){
                    sundowns2=objSundowns.getRadOne();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Sundowns){
                    sundowns2=objSundowns.getRadTwo();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.Pitso){
                    sundowns3= objSundowns.getRadOne();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Steve){
                    sundowns3=objSundowns.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Stuart){
                    sundowns3=objSundowns.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Eric){
                    sundowns3=objSundowns.getRadTwo();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.CAF){
                    sundowns4= objSundowns.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.FIFA){
                    sundowns4=objSundowns.getRadOne();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.National){
                    sundowns4=objSundowns.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Nedbank){
                    sundowns4=objSundowns.getRadTwo();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.rad2015){
                    sundowns5= objSundowns.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad2017){
                    sundowns5=objSundowns.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad2016){
                    sundowns5=objSundowns.getRadOne();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad2013){
                    sundowns5=objSundowns.getRadTwo();
                }

                total= sundowns1+sundowns2+sundowns3+sundowns4+sundowns5;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 5",Toast.LENGTH_SHORT).show();


                if (total==5){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(SundownsQuiz.this,team.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<5){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(SundownsQuiz.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }



            }
        });

    }
}
