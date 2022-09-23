package com.example.lesson2_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("shamala", "onCreate");
        findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,
                    SecondActivity.class);
            String text = ((EditText) findViewById(R.id.edit_text))
                    .getText().toString();
            intent.putExtra("key1", text);
            startActivity(intent);

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamala", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamala", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamala", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamala", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamala", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamala", "onRestart");
    }

}