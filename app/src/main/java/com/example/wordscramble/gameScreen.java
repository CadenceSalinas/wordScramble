package com.example.wordscramble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.RegexValidator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gameScreen extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);


        Button test = (Button)findViewById(R.id.scramble);
        back = (Button)findViewById(R.id.backButton4);

        test.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                EditText input = (EditText)findViewById(R.id.userWord);
                String value = input.getText().toString();
                Log.i("info", "" + value);

                TextView result = (TextView)findViewById(R.id.result);

                Log.i("info", "" + validInput(value));
                result.setText(validInput(value)+"");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent directory = new Intent(gameScreen.this, directoryPage.class);
                Log.i("info", "switch to directory page");
                startActivity(directory);
            }
        });
    }

    public boolean validInput(String text)
    {
        return text.matches("[A-Za-z]*");
    }
}