package com.example.secondtry.ui.decks;




import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;

import org.w3c.dom.Text;


public class EditDeck extends AppCompatActivity {

    TextView deckName;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_deck);
        String deckName = AddDeck.inputDeckName;

        TextView deckNameTitle = (TextView) findViewById(R.id.deckName);
        Toast.makeText(getApplicationContext(), "input: " + deckName, Toast.LENGTH_SHORT).show();

        deckNameTitle.setText((CharSequence) deckName);
}






}
