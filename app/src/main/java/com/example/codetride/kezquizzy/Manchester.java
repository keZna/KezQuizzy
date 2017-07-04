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

public class Manchester extends AppCompatActivity {

    QuizClass objManchester = new QuizClass();
    public RadioGroup GroupOne, GroupTwo, GroupThree, GroupFour, GroupFive;
    public Button btnSubmit;
    public ProgressBar ProResults;
    private static int RESULTS = 2000;
    public int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchester);

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

                int manchester1=0;
                int manchester2=0;
                int manchester3=0;
                int manchester4=0;
                int manchester5=0;

                //setters
                objManchester.setRadOne(1);
                objManchester.setRadTwo(0);

                //group1
                if (GroupOne.getCheckedRadioButtonId()==R.id.Gunners){
                    manchester1= objManchester.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.horns){
                    manchester1=objManchester.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Holiness){
                    manchester1=objManchester.getRadTwo();
                }else if (GroupOne.getCheckedRadioButtonId()==R.id.Red){
                    manchester1=objManchester.getRadOne();
                }

                //group2
                if (GroupTwo.getCheckedRadioButtonId()==R.id.rad1875){
                    manchester2= objManchester.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad1878){
                    manchester2=objManchester.getRadOne();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad1870){
                    manchester2=objManchester.getRadTwo();
                }else if (GroupTwo.getCheckedRadioButtonId()==R.id.rad1880){
                    manchester2=objManchester.getRadTwo();
                }

                //group3
                if (GroupThree.getCheckedRadioButtonId()==R.id.UEFA){
                    manchester3= objManchester.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.FIFA){
                    manchester3=objManchester.getRadTwo();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.Barclay){
                    manchester3=objManchester.getRadOne();
                }else if (GroupThree.getCheckedRadioButtonId()==R.id.FA){
                    manchester3=objManchester.getRadTwo();
                }

                //group4
                if (GroupFour.getCheckedRadioButtonId()==R.id.Tommy){
                    manchester4= objManchester.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Matt){
                    manchester4=objManchester.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Jimmy){
                    manchester4=objManchester.getRadTwo();
                }else if (GroupFour.getCheckedRadioButtonId()==R.id.Alex){
                    manchester4=objManchester.getRadOne();
                }

                //group5
                if (GroupFive.getCheckedRadioButtonId()==R.id.Jose){
                    manchester5= objManchester.getRadOne();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.David){
                    manchester5=objManchester.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.Louis){
                    manchester5=objManchester.getRadTwo();
                }else if (GroupFive.getCheckedRadioButtonId()==R.id.Ferguson){
                    manchester5=objManchester.getRadTwo();
                }

                total= manchester1+manchester2+manchester3+manchester4+manchester5;

                Toast.makeText(getApplication(),"You scored: "+total+" out of 5",Toast.LENGTH_SHORT).show();


                if (total==5){

                    ProResults = (ProgressBar) findViewById(R.id.proResults);
                    ProResults.setVisibility(View.INVISIBLE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"Congratulation you won!!",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Manchester.this,team.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);

                }else if (total<5){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplication(),"You Lost",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Manchester.this,Lost.class);
                            startActivity(intent);
                            finish();
                        }
                    },RESULTS);
                }



            }
        });


    }
}
