package com.example.wordscramble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class directoryPage extends AppCompatActivity {

    Button unscramble;
    Button wordBegin;
    Button wordEnd;
    Button back;
    String endings[] = {"ing", "le", "t"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_page);

        unscramble = (Button)findViewById(R.id.wordUnscramble);
        wordBegin = (Button)findViewById(R.id.wordBegin);
        wordEnd = (Button)findViewById(R.id.wordEnd);
        back = (Button)findViewById(R.id.backButton);

        unscramble.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent unscrambleGame = new Intent(directoryPage.this, gameScreen.class);
                Log.i("info", "switch to game page");
                startActivity(unscrambleGame);
            }
        });

        wordBegin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent beginGame = new Intent(directoryPage.this, wordsBeginning.class);
                Log.i("info", "switch to word begin page");
                startActivity(beginGame);
            }
        });

        wordEnd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent endGame = new Intent(directoryPage.this, wordsEnding.class);
                Log.i("info", "switch to word end page");
                Random random = new Random();
                int index = random.nextInt(endings.length);
                String str = endings[index];
                endGame.putExtra("ending", str);
                startActivity(endGame);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent home = new Intent(directoryPage.this, MainActivity.class);
                Log.i("info", "switch to home page");
                startActivity(home);
            }
        });
    }
}