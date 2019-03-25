package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Paint_pencil extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_pencil);

        TextView t1=(TextView)findViewById(R.id.textView23);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2=(TextView)findViewById(R.id.textView24);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}


