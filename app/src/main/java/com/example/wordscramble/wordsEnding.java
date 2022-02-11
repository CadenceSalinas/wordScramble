package com.example.wordscramble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class wordsEnding extends AppCompatActivity {

    Button userInput;
    Button back;
    String ending;
    TextView setEnding;
    TextView endingResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_ending);

        //get ending
        ending = getIntent().getStringExtra("ending");
        setEnding = (TextView)findViewById(R.id.endingInstructions);
        setEnding.setText("Make words that end with \"" + ending +"\"");

        userInput = (Button)findViewById(R.id.endingSubmit);
        back = (Button)findViewById(R.id.backButton3);

        userInput.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                EditText input = (EditText)findViewById(R.id.endingInput);
                String value = input.getText().toString();
                Log.i("info", "" + value);

                Log.i("info", "" + validInput(value));
                if(validInput(value))
                {
                    Toast.makeText(wordsEnding.this, "Correct!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(wordsEnding.this, "Incorrect, try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent directory = new Intent(wordsEnding.this, directoryPage.class);
                Log.i("info", "switch to directory page");
                startActivity(directory);
            }
        });
    }

    public boolean validInput(String text)
    {
        ending = getIntent().getStringExtra("ending");
        return text.matches("[A-Za-z]*" + ending + "$");
    }
}