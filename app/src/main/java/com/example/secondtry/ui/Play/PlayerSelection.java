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

    EditText playerOneX, playerTwoX, playerThreeX, playerFourX, playerFiveX, playerSixX;
    String playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix;
    Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_players_6);


        playerOneX = (EditText) findViewById(R.id.player_one);
        playerTwoX = (EditText) findViewById(R.id.player_two);
        playerThreeX = (EditText) findViewById(R.id.player_three);
        playerFourX = (EditText) findViewById(R.id.player_four);
        playerFiveX = (EditText) findViewById(R.id.player_five);
        playerSixX = (EditText) findViewById(R.id.player_six);
        playerOne = playerOneX.toString();
        playerTwo = playerTwoX.toString();
        playerThree = playerThreeX.toString();
        playerFour = playerFourX.toString();
        playerFive = playerFiveX.toString();
        playerSix = playerSixX.toString();

        startGame = (Button) findViewById(R.id.play_button_players);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View startGame) {
                countingPlayers();
            }
        });

    }

    public void countingPlayers(){
 /**       int counter = 6;
        if (playerOne.isEmpty()){
            counter = counter - 1;
        }
        if (playerTwo.isEmpty()){
            counter = counter - 1;
        }
        if (playerThree.isEmpty()){
            counter = counter - 1;
        }
        if (playerFour.isEmpty()){
            counter = counter - 1;
        }
        if (playerFive.isEmpty()){
            counter = counter - 1;
        }
        if (playerSix.isEmpty()){
            counter = counter - 1;
        }

        if (counter < 2){
            Toast.makeText(getApplicationContext(), "More Players are needed!", Toast.LENGTH_SHORT).show();
        } else {
            Intent startGame = new Intent(this, Play.class);
            startActivity(startGame);
        }**/
        Intent startGame = new Intent(this, Play.class);
        startActivity(startGame);
    }


}
