package com.example.secondtry.ui.ownQuestions;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;
import com.example.secondtry.ui.decks.TypeChoice;

import org.w3c.dom.Text;

public class AddOwnQuestionCaliente extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_create_add_caliente);

        String cardType = TypeChoice.contentForNew;

        Button saveQuestion = (Button) findViewById(R.id.button_add_own);
        final TextView textOneCal = (TextView) findViewById(R.id.text_one_cal);
        final TextView sipsCal = (TextView) findViewById(R.id.sips_cal);
        textOneCal.setScroller(new Scroller(this));
        textOneCal.setMaxWidth(10);
        textOneCal.setVerticalScrollBarEnabled(true);
        textOneCal.setMovementMethod(new ScrollingMovementMethod());

        saveQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (testTextOne(textOneCal) || testFieldTwo(sipsCal)){

                } else {
                    //save the question
                }
            }
        });
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
}