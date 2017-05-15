package com.example.android.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intentFromMainActivity = getIntent();
        String joke = intentFromMainActivity.getStringExtra("aJoke");

        TextView jokeTextView = (TextView) findViewById(R.id.joke_tv);
        jokeTextView.setText(joke);
    }
}
