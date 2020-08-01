package com.example.secondtry.ui.decks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.MainActivity;
import com.example.secondtry.R;

public class Decks extends AppCompatActivity {

    Button backbutton;
    Button addDeck;
    ScrollView scrollDeck;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_decks);

        backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });

        addDeck = (Button) findViewById(R.id.addDeckButton);
        addDeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddDeck();
            }
        });


    }
    public void openAddDeck(){
        Intent intent2 = new Intent(this, AddDeck.class);
        startActivity(intent2);
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
