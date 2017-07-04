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

public class PSL extends AppCompatActivity {

    QuizClass objPSL = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 2000;
    public int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psl);

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

                int psl1=0;
                int psl2=0;
                int psl3=0;
                int psl4=0;
                int psl5=0;

                //setters
                objPSL.setRadOne(1);
                objPSL.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.Lite){
                    psl1= objPSL.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Soon){
                    psl1=objPSL.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Sonke){
                    psl1=objPSL.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Premier){
                    psl1=objPSL.getRadOne();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.Mato){
                    psl2= objPSL.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Khoza){
                    psl2=objPSL.getRadOne();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.Jacob){
                    psl2=objPSL.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.James){
                    psl2=objPSL.getRadTwo();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.rad20){
                    psl3= objPSL.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.rad18){
                    psl3=objPSL.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.rad16){
                    psl3=objPSL.getRadOne();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.rad10){
                    psl3=objPSL.getRadTwo();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.Kaizer){
                    psl4= objPSL.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Cape){
                    psl4=objPSL.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Mamelodi){
                    psl4=objPSL.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Bidvest){
                    psl4=objPSL.getRadOne();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.Sundowns){
                    psl5= objPSL.getRadOne();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.Supersport){
                    psl5=objPSL.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.Chiefs){
                    psl5=objPSL.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.Orlando){
                    psl5=objPSL.getRadTwo();
                }

                total= psl1+psl2+psl3+psl4+psl5;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 5",Toast.LENGTH_SHORT).show();

                if (total==5){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(PSL.this,team.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<5){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(PSL.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }

            }
        });

    }
}
