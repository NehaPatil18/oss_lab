package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        ImageButton b1=(ImageButton)findViewById(R.id.imageButton1);
        b1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Main2Activity.this, Painting.class);
                startActivity(i);
            }
        });


        ImageButton b2=(ImageButton)findViewById(R.id.imageButton3);
        b2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Main2Activity.this, Cooking.class);
                startActivity(i);
            }
        });


    }
}
