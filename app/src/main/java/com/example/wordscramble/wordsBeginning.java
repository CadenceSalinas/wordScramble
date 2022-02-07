package com.example.wordscramble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class wordsBeginning extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_beginning);

        back = (Button)findViewById(R.id.backButton2);

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent directory = new Intent(wordsBeginning.this, directoryPage.class);
                Log.i("info", "switch to directory page");
                startActivity(directory);
            }
        });
    }
}