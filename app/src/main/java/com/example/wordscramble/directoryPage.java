package com.example.wordscramble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class directoryPage extends AppCompatActivity {

    Button unscramble;
    Button wordBegin;
    Button wordEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_page);

        unscramble = (Button)findViewById(R.id.wordUnscramble);
        wordBegin = (Button)findViewById(R.id.wordBegin);
        wordEnd = (Button)findViewById(R.id.wordEnd);

        unscramble.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent directory = new Intent(directoryPage.this, gameScreen.class);
                Log.i("info", "switch to game page");
                startActivity(directory);
            }
        });

        wordBegin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent directory = new Intent(directoryPage.this, wordsBeginning.class);
                Log.i("info", "switch to word begin page");
                startActivity(directory);
            }
        });
    }
}