package com.example.wordscramble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class wordsBeginning extends AppCompatActivity {

    Button userInput;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_beginning);

        userInput = (Button)findViewById(R.id.beginSubmit);
        back = (Button)findViewById(R.id.backButton2);

        userInput.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                EditText input = (EditText)findViewById(R.id.beginInput);
                String value = input.getText().toString();
                Log.i("info", "" + value);

                Log.i("info", "" + validInput(value));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent directory = new Intent(wordsBeginning.this, directoryPage.class);
                Log.i("info", "switch to directory page");
                startActivity(directory);
            }
        });
    }

    public boolean validInput(String text)
    {
        return text.matches("^b[A-Za-z]");
    }
}