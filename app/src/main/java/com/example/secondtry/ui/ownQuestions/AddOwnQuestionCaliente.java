package com.example.secondtry.ui.ownQuestions;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;
import com.example.secondtry.ui.decks.EditDeck;
import com.example.secondtry.ui.decks.TypeChoice;
import com.example.sqliteoperations.myDbAdapterCaliente;

import org.w3c.dom.Text;

public class AddOwnQuestionCaliente extends AppCompatActivity {

    public static String textOne, textSips, test;
    myDbAdapterCaliente myDb = new myDbAdapterCaliente(this);
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_add_caliente);

        String cardType = TypeChoice.contentForNew;

        Button saveQuestion = (Button) findViewById(R.id.button_add_own);
        final EditText textOneCal = (EditText) findViewById(R.id.text_one_cal);
        final EditText sipsCal = (EditText) findViewById(R.id.sips_cal);
        textOneCal.setScroller(new Scroller(this));
        textOneCal.setMaxWidth(10);
        textOneCal.setVerticalScrollBarEnabled(true);
        textOneCal.setMovementMethod(new ScrollingMovementMethod());


        saveQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //converts contents of EditText into strings
                ((TextView) AddOwnQuestionCaliente.this.findViewById(R.id.text_one_cal)).setText(textOneCal.getText().toString());
                ((TextView) AddOwnQuestionCaliente.this.findViewById(R.id.sips_cal)).setText(sipsCal.getText().toString());
                textOne = textOneCal.getText().toString();
                textSips = sipsCal.getText().toString();

                //tests if empty, else writes to DB
                if (testTextOne(textOneCal) || testFieldTwo(sipsCal)){
                //Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
                } else {
                    writeToDb(textOne, textSips);
                }
            }
        });
    }


    //writing to database

    public void writeToDb(String textOneCal, String sipsCal){

        myDb.insertData(textOneCal, sipsCal);
   //     Toast.makeText(getApplicationContext(), textOneCal + " " + sipsCal, Toast.LENGTH_LONG).show();
        String test = myDb.getData();
        Toast.makeText(getApplicationContext(), test , Toast.LENGTH_LONG).show();
        saveAndBack();

    }

    //tests
    public boolean testTextOne(TextView textOneCal){
        if (textOneCal.length() == 0){
            Toast.makeText(getApplicationContext(), "Please put in a text", Toast.LENGTH_SHORT).show();
            return true;
        } else if (textOneCal.length() > 255){
            Toast.makeText(getApplicationContext(), "Text exceeds maximum length", Toast.LENGTH_SHORT).show();
            return true;
        } else return false;

    }

    public boolean testFieldTwo(TextView sipsCal){
        if (sipsCal.length() == 0){
            Toast.makeText(getApplicationContext(), "Please put in an amount of sips", Toast.LENGTH_SHORT).show();
            return true;
        } else if (sipsCal.length() > 2){
            Toast.makeText(getApplicationContext(), "Too many sips! You will die!", Toast.LENGTH_SHORT).show();
            return true;
        } else return false;
    }

    public void saveAndBack(){
        Intent goBackAndSave = new Intent(this, TypeChoice.class);
        startActivity(goBackAndSave);
    }
}