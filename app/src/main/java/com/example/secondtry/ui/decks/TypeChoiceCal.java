package com.example.secondtry.ui.decks;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;

public class TypeChoiceCal extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_add);
        Button addOwnButton = (Button) findViewById(R.id.button_add_own3);
        Button savebutton = (Button) findViewById(R.id.button_save_deck);

/**
        savebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goBack();
            }
        });**/

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.question_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(this);

        addOwnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               
            }
        });

    }



}
