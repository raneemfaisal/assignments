package com.example.assignments2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 b = (Button) findViewById(R.id.button);
 e = (EditText) findViewById(R.id.pName);

 b.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         String s = e.getText().toString();
         setData(s);
     }
 });

    }

    private void setData(String s) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("pName", s);
        startActivity(intent);
    }
}