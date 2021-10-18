package com.example.lesson_one_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("mylog", "Hello World");
        Log.d("mylog", "Hello World II");
        Log.d("mylog", "Hello World III");
    }
}