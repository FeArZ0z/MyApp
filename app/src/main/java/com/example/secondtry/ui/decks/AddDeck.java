package com.example.secondtry.ui.decks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondtry.R;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class AddDeck<root_element> extends AppCompatActivity {

    public static String inputDeckName;
    EditText editDeckName;
    Button test, backbutton;
    String filename;
    public AddDeck() throws ParserConfigurationException {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add_deck);

        final EditText editDeckName = (EditText) findViewById(R.id.editDeckName);
        //final String deckName;
        //deckName = editDeckName.getText().toString();

        Button backbutton = (Button) findViewById(R.id.backbutton2);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDecks();
            }
        });


        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) AddDeck.this.findViewById(R.id.editDeckName)).setText(editDeckName.getText().toString());
                inputDeckName = editDeckName.getText().toString();



                if (editDeckName.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Required Field", Toast.LENGTH_SHORT).show();
                } else {
                   // Toast.makeText(getApplicationContext(), "input: " + inputDeckName, Toast.LENGTH_SHORT).show();
                    openNewDeck(inputDeckName);
                }

            }
        });
    }

    // ------------------------------------------------------------
    private void openDecks() {
        Intent openDecks = new Intent(this, Decks.class);
        startActivity(openDecks);
    }

    public void openNewDeck(String name){
      //  EditDeck editDeck = new EditDeck(name);
        Intent editDeck2 = new Intent(this, EditDeck.class);
        startActivity(editDeck2);


    }


}

