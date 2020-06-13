package com.shrikode.sportsanalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        public void logIn(View view){

            EditText username = findViewById(R.id.usernameTextView);
            EditText password = findViewById(R.id.passwordTextView);
            Log.i("Username", username.getText().toString());
            Log.i("Password", password.toString());

            Toast.makeText(MainActivity.this, "Hi there, " + username.getText().toString(), Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
