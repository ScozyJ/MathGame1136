package com.codelab.jeremy.mathgame1136;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int correctAnswer;
        Button buttonObjectChoice1;
        Button buttonObjectChoice2;
        Button buttonObjectChoice3;
        TextView textObjectPartA;
        TextView textObjectPartB;
        TextView textObjectScore;
        TextView textObjectLevel;

        int currentScore = 0;
        int currentLevel = 1;
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //the next line loads our UI design to the screen
        setContentView(R.layout.activity_game);

        //get a working object based on relevant class
        textObjectPartA = (TextView) findViewById(R.id.textPartA);
        textObjectPartB = (TextView) findViewById(R.id.textPartB);
        textObjectScore = (TextView) findViewById(R.id.textScore);
        textObjectLevel = (TextView) findViewById(R.id.textLevel);

        buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
        buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
        buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);

        //set button listeners
        buttonObjectChoice1.setOnClickListener(this);
        buttonObjectChoice2.setOnClickListener(this);
        buttonObjectChoice3.setOnClickListener(this);

        setQuestion();
    }


    //update onClick()
    @Override
    public void onClick(View view){
        //declare the int to be used in all cases
        int answerGiven = 0;
        switch(view.getId()){
            Case R.id.buttonChoice1:
            //initialize new int with value in button
            answerGiven = Integer.parseInt(""+buttonObjectChoice1.getText());
            break;

            Case R.id.buttonChoice2:
            //initialize new int with value in button
            answerGiven = Integer.parseInt(""+buttonObjectChoice2.getText());
            break;

            Case R.id.buttonChoice3:
            //initialize new int with value in button
            answerGiven = Integer.parseInt(""+buttonObjectChoice3.getText());
            break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            Case R.id.buttonChoice1:
            //button 1 stuff goes here;
            break;

            Case R.id.buttonChoice2:
            //button 2 stuff goes here;
            break;

            Case R.id.buttonChoice3:
            //button 3 stuff goes here;
            break;
        }
    }

    @Override
    public void onClick(View view){
        //declare the int to be used in all cases
        int answerGiven = 0;
        switch(view.getId()){
            Case R.id.buttonChoice1:
            //initialize new int with value in button
            answerGiven = Integer.parseInt(""+buttonObjectChoice1.getText());
            //is it correct?
            if(answerGiven == correctAnswer){
                Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG.show();
            }else{
                Toast.makeText(getApplicationContext(),"Sorry, that's wrong",Toast.LENGTH_LONG.show();
            }
            break;

            Case R.id.buttonChoice2:
            //initialize new int with value in button
            answerGiven = Integer.parseInt(""+buttonObjectChoice2.getText());
            //is it correct?
            if(answerGiven == correctAnswer){
                Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG.show();
            }else{
                Toast.makeText(getApplicationContext(),"Sorry, that's wrong",Toast.LENGTH_LONG.show();
            }
            break;

            Case R.id.buttonChoice3:
            //initialize new int with value in button
            answerGiven = Integer.parseInt(""+buttonObjectChoice3.getText());
            //is it correct?
            if(answerGiven == correctAnswer){
                Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG.show();
            }else{
                Toast.makeText(getApplicationContext(),"Sorry, that's wrong", Toast.LENGTH_LONG.show();
            }
            break;
        }
    }

    void setQuestion(){
        //generate parts of the question
        int numberRange = currentLevel*3;
        Random randInt = new Random();

        int partA = randInt.nextInt(numberRange);
        partA++; //make sure we dont have a zero value

        int partB = randInt.nextInt(numberRange);
        partB++; //no zero values

        correctAnswer = partA * partB;
        textObjectPartA.setText(""+partA);
        textObjectPartB.setText(""+partB);

        //set the multiple choice buttons
        int buttonLayout = randInt.nextInt(3); //a random number between 0-2
        switch(buttonLayout){
            case 0:
                buttonObjectChoice1.setText(""+correctAnswer);
                buttonObjectChoice2.setText(""+wrongAnswer1);
                buttonObjectChoice3.setText(""+wrongAnswer2);
                break;

            case 1:
                buttonObjectChoice1.setText(""+correctAnswer);
                buttonObjectChoice2.setText(""+wrongAnswer2);
                buttonObjectChoice3.setText(""+wrongAnswer1);
                break;

            case 2:
                buttonObjectChoice1.setText(""+wrongAnswer2);
                buttonObjectChoice2.setText(""+wrongAnswer1);
                buttonObjectChoice3.setText(""+correctAnswer);
                break;
        }

    }

    void updateScoreAndLevel(int answerGiven){
        if(isCorrect(answerGiven)){
            for(int i = 1; i <=currentLevel; i++){
                currentScore = currentScore + i;
            }
            currentLevel++;
        }
        else{
            currentScore = 0;
            currentLevel = 1;
        }
        //set the score and level in the code
        textObjectScore.setText("Score: " + currentScore);
        textObjectLevel.setText("Score: " + currentLevel);
    }

    boolean isCorrect(int answerGiven){
        if(answerGiven==correctAnswer){
            Toast.makeText(getApplicationContext(), "Well done!", Toast.LENGTH_LONG).show();
            correctTrueOrFalse = true;
        }else{
            Toast.makeText(getApplicationContext(), "Sorry!", Toast.LENGTH_LONG).show();
            correctTrueOrFalse = false;
        }
        return correctTrueOrFalse;
    }




}
