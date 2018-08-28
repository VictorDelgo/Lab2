package com.example.vix.activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    TextView myTextview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        myTextview=findViewById(R.id.textView2);
        Intent myOtherIntent = getIntent();
        String myString = myOtherIntent.getStringExtra("theString");
        myTextview.setText(myString);




        }
    }

