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
        final EditText playerTwo = (EditText) findViewById(R.id.player_two);
        final EditText playerThree = (EditText) findViewById(R.id.player_three);
        final EditText playerFour = (EditText) findViewById(R.id.player_four);
        final EditText playerFive = (EditText) findViewById(R.id.player_five);
        final EditText playerSix = (EditText) findViewById(R.id.player_six);

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

                /**
                if (TextUtils.isEmpty(playerOne.getText().toString())){
                    Toast.makeText(PlayerSelection.this, "empty", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(PlayerSelection.this, "proceed", Toast.LENGTH_SHORT).show();
                };**/
                int playercounter = 0;
                if (TextUtils.isEmpty(playerOne.getText().toString())){
                    playercounter += 1;
                } else{

                }
                if (TextUtils.isEmpty(playerTwo.getText().toString())){
                    playercounter += 1;
                } else{

                }
                if (TextUtils.isEmpty(playerThree.getText().toString())){
                    playercounter += 1;
                } else{

                }

                if (playercounter < 2){
                    Intent startGameNow = new Intent(PlayerSelection.this, Play.class);
                    startActivity(startGameNow);
                } else if (playercounter >= 2){
                    Toast.makeText(PlayerSelection.this, "Not enough Players!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
