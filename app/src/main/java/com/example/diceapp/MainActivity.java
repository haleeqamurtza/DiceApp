package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button diceroll;
    ImageView leftD;
    ImageView rightD;
    int leftnumber,rightnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceroll = (Button) findViewById(R.id.button);
        leftD = (ImageView) findViewById(R.id.leftdice);
        rightD = (ImageView) findViewById(R.id.rightdice);

        //set button
        diceroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomnumber = new Random();
                //generate random number for left dice
                leftnumber = randomnumber.nextInt(6);
                //define array
                int[] diceArray=new int[]{R.drawable.dice1,R.drawable.dice2,
                R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
                leftD.setImageResource(diceArray[leftnumber]);
//generate random number for right dice
                rightnumber = randomnumber.nextInt(6);
                rightD.setImageResource(diceArray[rightnumber]);
            }
        });
    }
}