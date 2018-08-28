package com.example.vix.activity2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainApplication extends AppCompatActivity {

    Button B1;
    Button B2;
    Button B3;
    TextView Mssg;
    EditText Blank;
    int n;

    String myString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_application);

        B1 = findViewById(R.id.button);
        B2 = findViewById(R.id.button2);
        B3 = findViewById(R.id.button3);
        Blank = findViewById(R.id.editText);
        Mssg=findViewById(R.id.textViewMain);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                myString = Blank.getText().toString();
                Intent intentC1=new Intent(MainApplication.this,Activity2.class);
                intentC1.putExtra("theString",myString);
                startActivity(intentC1);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC2=new Intent(MainApplication.this,Activity3.class);
                startActivity(intentC2);
            }
        });

        B3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                n++;
                Mssg.setText("Holis Bolis" + n);

            }

        });


    }

}
