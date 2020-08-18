package com.example.secondtry.ui.decks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.NestedScrollingParent;

import com.example.secondtry.R;
import com.example.secondtry.ui.ownQuestions.AddOwnQuestion;

public class TypeChoice extends AppCompatActivity {

    public static String contentForNew;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_add);
        Button addOwnButton = (Button) findViewById(R.id.button_add_own);
        Button savebutton = (Button) findViewById(R.id.button_add_save);
        savebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goBack();
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.question_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        spinner.setAdapter(adapter);
        final String spinnerContent = spinner.getSelectedItem().toString();
        contentForNew = spinnerContent;
        //String sCaliente, sNormal, sExplanation, sVote, sCompetition;
        final String sCaliente = "Caliente";
        final String sNormal = "Normal";
        final String sExplanation = "Explanation";
        final String sVote = "Vote";
        final String sCompetition = "Competition";

                setContentView(R.layout.deck_create_add_caliente);
                addOwnButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        addOwnQuestion(contentForNew);
                    }
                });

        }

        NestedScrollingParent nestedScroll = (NestedScrollingParent) findViewById(R.id.scroll_questions);

                




    public void goBack(){
        Intent goBack = new Intent(this, EditDeck.class);
        startActivity(goBack);
    }

    public void addOwnQuestion(String type){
        Intent addNewQuestion = new Intent(this, AddOwnQuestion.class);
        startActivity(addNewQuestion);
    }

}
