package com.example.secondtry.ui.Play;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;

public class PlayerSelection extends AppCompatActivity {

    String playerOneX, playerTwoX, playerThreeX, playerFourX, playerFiveX, playerSixX;
    EditText playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix;
    Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_players_6);


        final EditText playerOne = (EditText) findViewById(R.id.player_one);
        EditText playerTwo = (EditText) findViewById(R.id.player_two);
        EditText playerThree = (EditText) findViewById(R.id.player_three);
        EditText playerFour = (EditText) findViewById(R.id.player_four);
        EditText playerFive = (EditText) findViewById(R.id.player_five);
        EditText playerSix = (EditText) findViewById(R.id.player_six);

        playerOneX = playerOne.getText().toString();
        playerTwoX = playerTwo.getText().toString();
        playerThreeX = playerThree.getText().toString();
        playerFourX = playerFour.getText().toString();
        playerFiveX = playerFive.getText().toString();
        playerSixX = playerSix.getText().toString();

        startGame = (Button) findViewById(R.id.play_button_players);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View startGame) {
                //countingPlayers();
                if (TextUtils.isEmpty(playerOne.getText().toString())){
                    Toast.makeText(PlayerSelection.this, "empty", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(PlayerSelection.this, "proceed", Toast.LENGTH_SHORT).show();
                };
            }
        });

    }
/**
    public void countingPlayers(){
        int counter = 0;
        int counter2;
        int counter3 = 2;
        if (TextUtils.isEmpty(playerOne.getText().toString())){
            counter += 1;
        }

        if (counter == 1){
            Toast.makeText(PlayerSelection.this, "Empty", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(PlayerSelection.this, "else cond", Toast.LENGTH_SHORT).show();
        }
/**
            if (playerOneX.matches("")) {
                counter3+=1;
            } else {
                counter2 = counter + 1;
                counter = counter2;
            }
            if (playerTwoX.matches("")) {
               counter3 +=1;
            } else {
                counter2 = counter + 1;
                counter = counter2;
            }
            if (playerThreeX.matches("")) {

            } else {
                counter2 = counter + 1;
                counter = counter2;
            }
            if (playerFourX.matches("")) {

            } else {
                counter2 = counter + 1;
                counter = counter2;
            }
            if (playerFiveX.matches("")) {

            } else {
                counter2 = counter + 1;
                counter = counter2;
            }


        if (counter3 >=2){
            startGame();
        } else {
            Toast.makeText(getApplicationContext(), "More Players are needed!", Toast.LENGTH_SHORT).show();
        }
    }**/
/**
    public void startGame(){
        Intent startGame = new Intent(this, Play.class);
        startActivity(startGame);
    }
**/
}
