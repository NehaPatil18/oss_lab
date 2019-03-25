package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Paint_water extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_water);

        TextView t1=(TextView)findViewById(R.id.textView20);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2=(TextView)findViewById(R.id.textView19);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
