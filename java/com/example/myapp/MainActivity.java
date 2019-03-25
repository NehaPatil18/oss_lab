package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import static com.example.myapp.R.id.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=(Button)findViewById(button);
        b.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);

            }
        });
    }
}
