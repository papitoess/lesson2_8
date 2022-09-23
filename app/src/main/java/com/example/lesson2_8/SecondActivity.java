package com.example.lesson2_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       String text = getIntent().getStringExtra("key1");
        ((TextView) findViewById(R.id.text_view)).setText(text);
    }
}