package com.example.francisco.w3d2weekday2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView et1;
    MyDynamicReceiver myDynamicReceiver ;
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (TextView) findViewById(R.id.et1);


        myDynamicReceiver = new MyDynamicReceiver(et1);
    }

    @Override
    protected void onStart() {
        super.onStart();

        intentFilter = new IntentFilter("doSomethingElse");
        intentFilter.addAction("doSomething");
        intentFilter.addAction("TypeMessage");

        registerReceiver(myDynamicReceiver,intentFilter);
    }
}
