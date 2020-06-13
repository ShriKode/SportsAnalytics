package com.shrikode.sportsanalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void logIn(View view){
        Log.i("Username", findViewById(R.id.usernameTextView).toString());
        Log.i("Username", findViewById(R.id.usernameTextView).toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
