package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView2 = findViewById(R.id.outputTextview);
        Intent intent = getIntent();
        String str = "Hello " + intent.getStringExtra("message");
        textView2.setText(str);
    }
}
