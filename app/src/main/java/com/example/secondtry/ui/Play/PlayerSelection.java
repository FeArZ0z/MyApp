package com.example.secondtry.ui.Play;

import android.content.Intent;
import android.os.Bundle;
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


        EditText playerOne = (EditText) findViewById(R.id.player_one);
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
                countingPlayers();
            }
        });

    }

    public void countingPlayers(){
        int counter2 = 0;
        int counter = 5;
        if (playerOneX.matches("")){
            counter2 = counter - 1;
            counter = counter2;
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
        }
        if (playerTwoX.matches("")){
            counter2 = counter - 1;
            counter = counter2;
        }
        if (playerThreeX.matches("")){
            counter2 = counter - 1;
            counter = counter2;
        }
        if (playerFourX.matches("")){
            counter2 = counter - 1;
            counter = counter2;
        }
        if (playerFiveX.matches("")){
            counter2 = counter - 1;
            counter = counter2;
        }

        if (counter < 2){
            Toast.makeText(getApplicationContext(), "More Players are needed!", Toast.LENGTH_SHORT).show();
        } else {
            startGame();
        }
    }

    public void startGame(){
        Intent startGame = new Intent(this, Play.class);
        startActivity(startGame);
    }

}
