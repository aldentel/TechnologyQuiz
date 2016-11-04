package com.example.android.technologyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.technologyquiz.R.id.AC;
import static com.example.android.technologyquiz.R.id.AES;
import static com.example.android.technologyquiz.R.id.HDCP;
import static com.example.android.technologyquiz.R.id.HDMI;
import static com.example.android.technologyquiz.R.id.IR;
import static com.example.android.technologyquiz.R.id.RF;
import static com.example.android.technologyquiz.R.id.false2;
import static com.example.android.technologyquiz.R.id.true1;

public class MainActivity extends AppCompatActivity {

    int myScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //* This method is called when "My Score" is clicked//

    public void scoreTotal(View view) {

        //* Question 1 correct answer//
        CheckBox rf = (CheckBox) findViewById(RF);
        boolean rfYes = rf.isChecked();
        CheckBox ir = (CheckBox) findViewById(IR);
        boolean irYes = ir.isChecked();
        CheckBox ac = (CheckBox) findViewById(AC);
        boolean acYes = ac.isChecked();
        CheckBox aes = (CheckBox) findViewById(AES);
        boolean aesYes = aes.isChecked();

        if (rfYes & irYes & acYes & !aesYes) {
            myScore = myScore + 1;
        }

        //* Question 2 correct answer//
        RadioButton hdcp = (RadioButton) findViewById(HDCP);
        boolean hdcpYes = hdcp.isChecked();

        if (hdcpYes) {
            myScore = myScore + 1;
        }

        //* Question 3 correct answer//
        RadioButton trueOne = (RadioButton) findViewById(true1);
        boolean trueYes = trueOne.isChecked();

        if (trueYes) {
            myScore = myScore + 1;
        }

        //* Question 4 correct answer//
        RadioButton falseTwo = (RadioButton) findViewById(false2);
        boolean falseYes = falseTwo.isChecked();

        if (falseYes) {
            myScore = myScore + 1;
        }

        //* Question 5 correct answer
        EditText hdmi = (EditText) findViewById(HDMI);
        String hdmiStatus = hdmi.getText().toString();

        if (hdmiStatus.equals("High Definition Multimedia Interface")) {
            myScore = myScore + 1;
        }
        displayMyScore(myScore);

        myScore = 0;

    }

    //* This method determines the Toast display//
    public void displayMyScore(int myScore) {
        if (myScore == 0) {
            Toast.makeText(this, "0/5 = Awww :(", Toast.LENGTH_LONG).show();

        } else if (myScore == 1) {
            Toast.makeText(this, "1/5 = Hmmm :|", Toast.LENGTH_LONG).show();

        } else if (myScore == 2) {
            Toast.makeText(this, "2/5 = OK   :\\", Toast.LENGTH_LONG).show();

        } else if (myScore == 3) {
            Toast.makeText(this, "3/5 = Yep  :/", Toast.LENGTH_LONG).show();

        } else if (myScore == 4) {
            Toast.makeText(this, "4/5 = Nice :]", Toast.LENGTH_LONG).show();

        } else if (myScore == 5) {
            Toast.makeText(this, "5/5 = Yea! :)", Toast.LENGTH_LONG).show();

        }
    }

}






