package com.example.secondtry.ui.ownQuestions;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;
import com.example.secondtry.ui.decks.TypeChoice;

public class AddOwnQuestion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_add);

        String cardType = TypeChoice.contentForNew;

        final String sCaliente = "Caliente";
        final String sNormal = "Normal";
        final String sExplanation = "Explanation";
        final String sVote = "Vote";
        final String sCompetition = "Competition";

        switch (cardType){
            case sCaliente:
                setContentView(R.layout.deck_create_add_caliente);

            case sNormal:
                Toast.makeText(getApplicationContext(), "Not yet Implemented", Toast.LENGTH_SHORT).show();
            case sExplanation:
                Toast.makeText(getApplicationContext(), "Not yet Implemented", Toast.LENGTH_SHORT).show();
            case sVote:
                Toast.makeText(getApplicationContext(), "Not yet Implemented", Toast.LENGTH_SHORT).show();
            case sCompetition:
                Toast.makeText(getApplicationContext(), "Not yet Implemented", Toast.LENGTH_SHORT).show();
        }
    }
}
