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
    Boolean bOne, bTwo, bThree, bFour, bFive, bSix = true;
    Boolean bOT, bTwTr, bTrFo, bFoFi, bFiSi, bAll = true;

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



        startGame = (Button) findViewById(R.id.play_button_players);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View startGame) {

                //don't touch it, it is working
                int playercounter = 0;
                if (TextUtils.isEmpty(playerOne.getText().toString())){
                    bOne = true;
                } else{
                    playercounter += 1;
                    bOne = false;
                }
                if (TextUtils.isEmpty(playerTwo.getText().toString())){
                    bTwo = true;
                } else{
                    playercounter += 1;
                    bTwo = false;
                }
                if (TextUtils.isEmpty(playerThree.getText().toString())){
                    bThree = true;
                } else{
                    playercounter += 1;
                    bThree = false;
                }
                if (TextUtils.isEmpty(playerFour.getText().toString())){
                    bFour = true;
                } else{
                    playercounter += 1;
                    bFour = false;
                }
                if (TextUtils.isEmpty(playerFive.getText().toString())){
                    bFive = true;
                } else{
                    playercounter += 1;
                    bFive = false;
                }
                if (TextUtils.isEmpty(playerSix.getText().toString())){
                    bSix = true;
                } else{
                    playercounter += 1;
                    bSix = false;
                }





                if (playercounter < 2){

                    Toast.makeText(PlayerSelection.this, "Not enough Players!", Toast.LENGTH_SHORT).show();
                // checks if there are consecutive players
                } else try {
                    if (playercounter >=2){
                        if (bOne || bTwo){
                            throw new UnsupportedOperationException();
                        } else if (playercounter >= 3){
                            if (bThree){
                                throw new UnsupportedOperationException();
                            } else if (playercounter >= 4){
                                if (bFour){
                                    throw new UnsupportedOperationException();
                                } else if (playercounter >= 5){
                                    if (bFive){
                                        throw new UnsupportedOperationException();
                                    } else if (playercounter == 6){
                                        if (bSix){
                                            throw new UnsupportedOperationException();
                                        } else startingGameNow();
                                    } else startingGameNow();
                                } else startingGameNow();
                            } else startingGameNow();
                        } else startingGameNow();
                    } else startingGameNow();
                } catch (UnsupportedOperationException e){
                    errMsg();
                }


            }
        });

    }

    // starts the game
    public void startingGameNow(){
        Intent startGameNow = new Intent(PlayerSelection.this, Play.class);
        startActivity(startGameNow);
    }
    // provides an error Message if players are not consecutively put in
    public void errMsg(){
        Toast.makeText(PlayerSelection.this, "Please choose consecutive Players!", Toast.LENGTH_SHORT).show();

    }

}
