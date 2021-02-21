package com.example.assignments2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView v= (TextView) findViewById(R.id.textView);
        Intent i = getIntent();

        v.setText("Hello, " + i.getStringExtra("pName"));
    }
}