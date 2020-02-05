package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        Log.i("Info", "Button was clicked!");
        EditText toastEditText = findViewById(R.id.toastEditText);
        String toastText = toastEditText.getText().toString();
        // Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_LONG).show();
        goToActivity2(toastText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String toastText){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", toastText);
        startActivity(intent);
    }
}
