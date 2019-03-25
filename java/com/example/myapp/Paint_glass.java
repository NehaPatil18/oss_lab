package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Paint_glass extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_glass);

        TextView t1=(TextView)findViewById(R.id.textView25);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2=(TextView)findViewById(R.id.textView26);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
