package com.example.secondtry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.ui.Play.Play;
import com.example.secondtry.ui.Play.PlayerSelection;
import com.example.secondtry.ui.decks.Decks;
import com.example.secondtry.ui.decks.TypeChoice;
import com.example.sqliteoperations.myDbAdapterCaliente;

public class MainActivity extends AppCompatActivity {

    Button play_game;
    Button decks;
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDbAdapterCaliente myDb = new myDbAdapterCaliente(this);
        myDb.createDataBase();

        // button to start game
        play_game = (Button) findViewById(R.id.playbutton);
        play_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View play) {
                openPlay();
            }
        });

        // button to view decks
        decks = (Button) findViewById(R.id.decks);
        decks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View decks) {
                openDecks();
            }
        });



    }





    public void openPlay(){
        Intent openPlay = new Intent(this, PlayerSelection.class);
        startActivity(openPlay);
    }
    public void openDecks(){
        Intent intent2 = new Intent(this, Decks.class ) ;
        startActivity(intent2);
    }

    public void goBack(){
        Intent back = new Intent(this, TypeChoice.class);
        startActivity(back);
    }
}