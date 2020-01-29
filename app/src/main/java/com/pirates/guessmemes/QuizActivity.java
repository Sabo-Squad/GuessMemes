package com.pirates.guessmemes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class QuizActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mImageView = (ImageView) findViewById(R.id.imageDemo);
        mImageView.setImageResource(R.drawable.buicklogo);
    }
}
