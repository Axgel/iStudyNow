package com.example.studynow;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQuestion = findViewById(R.id.flashcard_question);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer);
        flashcardQuestion.setOnClickListener(v -> {
            flashcardQuestion.setVisibility(View.INVISIBLE);
            flashcardAnswer.setVisibility(View.VISIBLE);
        });
        flashcardAnswer.setOnClickListener(v -> {
            flashcardQuestion.setVisibility(View.VISIBLE);
            flashcardAnswer.setVisibility(View.INVISIBLE);
        });
    }
}