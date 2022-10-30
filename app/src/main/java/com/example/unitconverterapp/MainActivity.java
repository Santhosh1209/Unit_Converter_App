package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.*;

// All comments are important, don't delete anything without reading it first

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);
        Toast.makeText(this, "Welcome to Unit Converter App", Toast.LENGTH_SHORT).show();
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
//                String s = editTextNumber.getText().toString();
//                int kg =  Integer.parseInt(s);
//                double pounds = 2.205 * kg;
//                textView.setText(pounds + " Pounds");
//            }
//        });
    }
    public void calculate(View view){
        String s = editTextNumber.getText().toString();
        int kg =  Integer.parseInt(s);
        double pounds = 2.205 * kg;
        pounds = Math.round(pounds * Math.pow(10, 2))
                / Math.pow(10, 2);
        //System.out.format("%.2f",pounds);
        textView.setText(pounds + " Pounds");
        textView.setText(pounds + " Pounds");

    }
}