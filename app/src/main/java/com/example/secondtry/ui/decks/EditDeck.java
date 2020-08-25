package com.example.secondtry.ui.decks;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;

import com.example.secondtry.ui.decks.AddDeck;

import org.w3c.dom.Text;


public class EditDeck extends AppCompatActivity {

    TextView deckName;
    Button backbutton;
    String deckNameTest;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_deck);
        String deckName = AddDeck.inputDeckName;


        backbutton = (Button) findViewById(R.id.back_add_deck);
        backbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goBack();
            }
        });

        Button addButton = (Button) findViewById(R.id.addQuestion);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addCard();
            }
        });

        TextView deckNameTitle = (TextView) findViewById(R.id.deckName);
        deckNameTest = deckNameTitle.getText().toString();
        Toast.makeText(getApplicationContext(), "input: " + deckNameTest, Toast.LENGTH_SHORT).show();

        deckNameTitle.setText((CharSequence) deckName);
    }

    public void goBack(){
        Intent goBack = new Intent(this, AddDeck.class);
        startActivity(goBack);
    }

    public void addCard(){
        Intent addCard = new Intent(this, TypeChoice.class);
        startActivity(addCard);
    }



}
