package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.myapp.R.id.button;

public class Painting extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painting_act);

        Button b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Painting.this,Paint_oil.class);
                startActivity(i);

            }
        });

        Button b2=(Button)findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Painting.this, Paint_water.class);
                startActivity(i);

            }
        });

        Button b3=(Button)findViewById(R.id.button4);
        b3.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Painting.this, Paint_calli.class);
                startActivity(i);

            }
        });

        Button b4=(Button)findViewById(R.id.button5);
        b4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Painting.this,Paint_pencil.class);
                startActivity(i);

            }
        });

        Button b5=(Button)findViewById(R.id.button6);
        b5.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(Painting.this, Paint_glass.class);
                startActivity(i);

            }
        });
    }
}
