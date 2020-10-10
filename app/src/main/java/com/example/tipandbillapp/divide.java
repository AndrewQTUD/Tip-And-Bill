package com.example.tipandbillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class divide extends AppCompatActivity {

    EditText editTextTextPersonName;
    EditText editTextTextPersonName2;
    TextView textView6;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        divide = (Button)findViewById(R.id.button3);
        editTextTextPersonName = (EditText)findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        textView6 = (TextView)findViewById(R.id.textView6);

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getTotal = editTextTextPersonName.getText().toString();
                String getNumPeople = editTextTextPersonName2.getText().toString();

                float i = Float.parseFloat(getTotal) / Float.parseFloat(getNumPeople);

                textView6.setText(String.valueOf(i));
            }
        });
    }
}