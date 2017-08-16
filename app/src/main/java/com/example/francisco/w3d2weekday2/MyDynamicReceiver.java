package com.example.francisco.w3d2weekday2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by FRANCISCO on 15/08/2017.
 */

public class MyDynamicReceiver extends BroadcastReceiver{

    private static final String TAG = "MyDinamicReceiver";

    TextView et1;

    public MyDynamicReceiver(TextView et1) {
        this.et1 = et1;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "I am a dynamic receiver", Toast.LENGTH_SHORT).show();
        switch (intent.getAction()){
            case "doSomething":
                Log.d(TAG, "onReceive: myAction");
                Toast.makeText(context, "I received doSomething from the the broadcast", Toast.LENGTH_SHORT).show();
                break;
            case "TypeMessage":
                Toast.makeText(context, "I received the value "+ intent.getStringExtra("value1") +"from the the broadcast", Toast.LENGTH_SHORT).show();
                et1.setText(intent.getStringExtra("value1"));
                break;
        }



    }
}
