package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Cooking extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooking_act);

        TextView t1=(TextView)findViewById(R.id.textView9);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2=(TextView)findViewById(R.id.textView10);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3=(TextView)findViewById(R.id.textView11);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4=(TextView)findViewById(R.id.textView12);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5=(TextView)findViewById(R.id.textView13);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
