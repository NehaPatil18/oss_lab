package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Paint_oil extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_oil);

        TextView t1=(TextView)findViewById(R.id.textView16);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2=(TextView)findViewById(R.id.textView17);
        t1.setMovementMethod(LinkMovementMethod.getInstance());


}
}
