package com.example.secondtry.ui.decks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.NestedScrollingParent;
import androidx.recyclerview.widget.RecyclerView;

import com.example.secondtry.R;
import com.example.secondtry.ui.ownQuestions.AddOwnQuestionCaliente;
import com.example.sqliteoperations.myDbAdapterCaliente;

public class TypeChoice extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static String contentForNew;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_add);
        Button addOwnButton = (Button) findViewById(R.id.button_add_own3);
        Button savebutton = (Button) findViewById(R.id.button_save_deck);


        savebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goBack();
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.question_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        addOwnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addOwnQuestion();
            }
        });

    }





    public void goBack(){
        Intent goBack = new Intent(this, EditDeck.class);
        startActivity(goBack);
    }

    public void addOwnQuestion(){
        //if recycler on this or this add a different type of question
        Intent addNewQuestionCaliente = new Intent(this, AddOwnQuestionCaliente.class);
        startActivity(addNewQuestionCaliente);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        if (pos == 0) {
            Toast.makeText(getApplicationContext(), "Choose a category", Toast.LENGTH_SHORT).show();
        } else if (pos == 1) {
            //Toast.makeText(getApplicationContext(), "Choice: caliente", Toast.LENGTH_SHORT).show();
            //addOwnQuestionCal();
            Intent changeViewCal = new Intent(this, TypeChoiceCal.class);
            startActivity(changeViewCal);
        } else if (pos == 2) {
            Toast.makeText(getApplicationContext(), "Choice: normal", Toast.LENGTH_SHORT).show();
        } else if (pos == 3) {
            Toast.makeText(getApplicationContext(), "Choice: explanation", Toast.LENGTH_SHORT).show();
        } else if (pos == 4) {
            Toast.makeText(getApplicationContext(), "Choice: vote", Toast.LENGTH_SHORT).show();
        } else if (pos == 5) {
            Toast.makeText(getApplicationContext(), "Choice: competition", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }



}
