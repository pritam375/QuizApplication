package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();

    private TextView mSCoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mQuit;
    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSCoreView=(TextView) findViewById(R.id.tvScore);
        mQuestionView=(TextView) findViewById(R.id.tvQuestion);
        mButtonChoice1=findViewById(R.id.btnchoice1);
        mButtonChoice2=findViewById(R.id.btnchoice2);
        mButtonChoice3=findViewById(R.id.btnchoice3);
        mQuit=findViewById(R.id.btnQuit);
updateQuestion();
           mButtonChoice1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   try {
                       if(mButtonChoice1.getText()==mAnswer)
                       {
                           mScore=mScore+1;
                           updateScore(mScore);
                           updateQuestion();
                           Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();
                       }
                       else{
                           Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                           updateQuestion();
                       }

                   }catch(Exception e){
                       Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();
                   }

               }
           });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if(mButtonChoice2.getText()==mAnswer)
                    {
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }

                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();
                }

            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if(mButtonChoice3.getText()==mAnswer)
                    {
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }

                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();
                }

            }
        });
        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mScore=0;
                mQuestionView.setText("Questions: ");
                mSCoreView.setText("Score: ");
                Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();

            }
        });



    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer=mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber=mQuestionNumber+1;
    }
    private void updateScore(int a){
        mSCoreView.setText("Score: "+a);
    }
}