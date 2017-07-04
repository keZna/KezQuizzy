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

public class MessiQuiz extends AppCompatActivity {

    QuizClass objMessi = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive, GroupSix, GroupSeven, GroupEight, GroupNine, GroupTen;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 2000;
    public int total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messi_quiz);

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

                int messi1=0;
                int messi2=0;
                int messi3=0;
                int messi4=0;
                int messi5=0;
                int messi6=0;
                int messi7=0;
                int messi8=0;
                int messi9=0;
                int messi10=0;

                //setters
                objMessi.setRadOne(1);
                objMessi.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.rad31){
                    messi1= objMessi.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad28){
                    messi1=objMessi.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad25){
                    messi1=objMessi.getRadOne();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.rad32){
                    messi1=objMessi.getRadTwo();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.rad4){
                    messi2= objMessi.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad7){
                    messi2=objMessi.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad1){
                    messi2=objMessi.getRadOne();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad2){
                    messi2=objMessi.getRadTwo();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.Barcelona){
                    messi3= objMessi.getRadOne();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Athletico){
                    messi3=objMessi.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Real){
                    messi3=objMessi.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Manchester){
                    messi3=objMessi.getRadTwo();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.Christiano){
                    messi4= objMessi.getRadOne();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Carlos){
                    messi4=objMessi.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Call){
                    messi4=objMessi.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Cristiano){
                    messi4=objMessi.getRadTwo();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.rad21){
                    messi5= objMessi.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad16){
                    messi5=objMessi.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad20){
                    messi5=objMessi.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.rad17){
                    messi5=objMessi.getRadOne();
                }

                //group6
                if (GroupSix.getCheckedRadioButtonId()==R.id.European){
                    messi6 = objMessi.getRadTwo();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.Liga){
                    messi6=objMessi.getRadTwo();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.Fifa){
                    messi6=objMessi.getRadOne();
                }else if (GroupSix.getCheckedRadioButtonId()==R.id.World){
                    messi6=objMessi.getRadTwo();
                }

                //group7
                if (GroupSeven.getCheckedRadioButtonId()==R.id.rad2012){
                    messi7 = objMessi.getRadTwo();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.rad2015){
                    messi7=objMessi.getRadOne();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.rad2009){
                    messi7=objMessi.getRadTwo();
                }else if (GroupSeven.getCheckedRadioButtonId()==R.id.rad2010){
                    messi7=objMessi.getRadTwo();
                }

                //group8
                if (GroupEight.getCheckedRadioButtonId()==R.id.CopaAmerica){
                    messi8 = objMessi.getRadTwo();
                }else if (GroupEight.getCheckedRadioButtonId()==R.id.UEFA){
                    messi8=objMessi.getRadOne();
                }else if (GroupEight.getCheckedRadioButtonId()==R.id.Copas){
                    messi8=objMessi.getRadTwo();
                }else if (GroupEight.getCheckedRadioButtonId()==R.id.EuropeanChamps){
                    messi8=objMessi.getRadTwo();
                }

                //group9
                if (GroupNine.getCheckedRadioButtonId()==R.id.Valencia){
                    messi9 = objMessi.getRadTwo();
                }else if (GroupNine.getCheckedRadioButtonId()==R.id.Betis){
                    messi9=objMessi.getRadTwo();
                }else if (GroupNine.getCheckedRadioButtonId()==R.id.Stuttgart){
                    messi9=objMessi.getRadTwo();
                }else if (GroupNine.getCheckedRadioButtonId()==R.id.Leverkusen){
                    messi9=objMessi.getRadOne();
                }

                //group10
                if (GroupTen.getCheckedRadioButtonId()==R.id.rad480){
                    messi10 = objMessi.getRadTwo();
                }else if (GroupTen.getCheckedRadioButtonId()==R.id.rad400){
                    messi10=objMessi.getRadTwo();
                }else if (GroupTen.getCheckedRadioButtonId()==R.id.rad500){
                    messi10=objMessi.getRadOne();
                }else if (GroupTen.getCheckedRadioButtonId()==R.id.rad520){
                    messi10=objMessi.getRadTwo();
                }

                total= messi1+messi2+messi3+messi4+messi5+messi6+messi7+messi8+messi9+messi10;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 10",Toast.LENGTH_SHORT).show();


                if (total==10){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MessiQuiz.this,Results.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<10){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MessiQuiz.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }



            }
        });

    }
}
