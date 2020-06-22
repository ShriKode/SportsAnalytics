package com.shrikode.sportsanalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    public void tennisStats(View view){

        Button buttonEdit = findViewById(R.id.buttonEdit);
        Button buttonView = findViewById(R.id.buttonView);
        Button buttonTennis = findViewById(R.id.buttonTennis);
        Button buttonBasketball = findViewById(R.id.buttonBasketball);
        Button buttonFootball= findViewById(R.id.buttonFootball);
        buttonEdit.setVisibility(View.VISIBLE);
        buttonView.setVisibility(View.VISIBLE);
        buttonTennis.setVisibility(View.INVISIBLE);
        buttonBasketball.setVisibility(View.INVISIBLE);
        buttonFootball.setVisibility(View.INVISIBLE);

        ImageView statsGraph = findViewById(R.id.statsGraph);
        statsGraph.setVisibility(View.VISIBLE);

        ListView statsList = findViewById(R.id.statsList);
        statsList.setVisibility(View.VISIBLE);


        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);


        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numList );

        statsList.setAdapter(arrayAdapter);


    }

    public void editStats( View view){
        ImageView statsGraph = findViewById(R.id.statsGraph);
        statsGraph.setVisibility(View.INVISIBLE);

        ListView statsList = findViewById(R.id.statsList);
        statsList.setVisibility(View.INVISIBLE);

        TextView textViewDate = findViewById(R.id.textViewDate);
        textViewDate.setText("Today's Date");

        TextView textViewFirstServeMade = findViewById(R.id.textViewFirstServeMade);
        textViewFirstServeMade.setVisibility(View.VISIBLE);

        TextView textViewSecondServeMade = findViewById(R.id.textViewSecondServeMade);
        textViewSecondServeMade.setVisibility(View.VISIBLE);

        TextView textViewDoubleFaults = findViewById(R.id.textViewDoubleFaults);
        textViewDoubleFaults.setVisibility(View.VISIBLE);

        TextView textViewForehandMissed = findViewById(R.id.textViewForehandMissed);
        textViewForehandMissed.setVisibility(View.VISIBLE);

        TextView textViewBackhandMissed = findViewById(R.id.textViewBackhandMissed);
        textViewBackhandMissed.setVisibility(View.VISIBLE);

        TextView textViewWinners = findViewById(R.id.textViewWinners);
        textViewWinners.setVisibility(View.VISIBLE);

        EditText editTextFirstServeMade = findViewById(R.id.editTextFirstServeMade);
        editTextFirstServeMade.setVisibility(View.VISIBLE);

        EditText editTextSecondServeMade = findViewById(R.id.editTextSecondServeMade);
        editTextSecondServeMade.setVisibility(View.VISIBLE);

        EditText editTextDoubleFaults = findViewById(R.id.editTextDoubleFaults);
        editTextDoubleFaults.setVisibility(View.VISIBLE);

        EditText editTextForehandMissed = findViewById(R.id.editTextForehandMissed);
        editTextForehandMissed.setVisibility(View.VISIBLE);

        EditText editTextBackhandMissed = findViewById(R.id.editTextBackhandMissed);
        editTextBackhandMissed.setVisibility(View.VISIBLE);

        EditText editTextWinners = findViewById(R.id.editTextWinners);
        editTextWinners.setVisibility(View.VISIBLE);


    }

    public void viewStats(View view){

        ImageView statsGraph = findViewById(R.id.statsGraph);
        statsGraph.setVisibility(View.VISIBLE);

        ListView statsList = findViewById(R.id.statsList);
        statsList.setVisibility(View.VISIBLE);

        int firstServePercentage = 1;
        int secondServePercentage = 1;
        int doubleFaults = 1;
        int forehandsMissed =  1;
        int backhandsMissed =  1;
        int winners =  1;


        ArrayList<String> viewStatsList = new ArrayList<String>();
        viewStatsList.add("First Serve Percentage: " + Integer.toString(firstServePercentage) + "%");
        viewStatsList.add("Second Serve Percentage: " + Integer.toString(secondServePercentage) + "%");
        viewStatsList.add("Number of Double Faults in Last Match: " + Integer.toString(doubleFaults));
        viewStatsList.add("Forehand Errors: " + Integer.toString(forehandsMissed));
        viewStatsList.add("Backhand Errors: " + Integer.toString(backhandsMissed));
        viewStatsList.add("Winners: " + Integer.toString(winners));


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, viewStatsList );

        statsList.setAdapter(arrayAdapter);

        TextView textViewDate = findViewById(R.id.textViewDate);
        textViewDate.setText("Today's Date");

        TextView textViewFirstServeMade = findViewById(R.id.textViewFirstServeMade);
        textViewFirstServeMade.setVisibility(View.INVISIBLE);

        TextView textViewSecondServeMade = findViewById(R.id.textViewSecondServeMade);
        textViewSecondServeMade.setVisibility(View.INVISIBLE);

        TextView textViewDoubleFaults = findViewById(R.id.textViewDoubleFaults);
        textViewDoubleFaults.setVisibility(View.INVISIBLE);

        TextView textViewForehandMissed = findViewById(R.id.textViewForehandMissed);
        textViewForehandMissed.setVisibility(View.INVISIBLE);

        TextView textViewBackhandMissed = findViewById(R.id.textViewBackhandMissed);
        textViewBackhandMissed.setVisibility(View.INVISIBLE);

        TextView textViewWinners = findViewById(R.id.textViewWinners);
        textViewWinners.setVisibility(View.INVISIBLE);

        EditText editTextFirstServeMade = findViewById(R.id.editTextFirstServeMade);
        editTextFirstServeMade.setVisibility(View.INVISIBLE);

        EditText editTextSecondServeMade = findViewById(R.id.editTextSecondServeMade);
        editTextSecondServeMade.setVisibility(View.INVISIBLE);

        EditText editTextDoubleFaults = findViewById(R.id.editTextDoubleFaults);
        editTextDoubleFaults.setVisibility(View.INVISIBLE);

        EditText editTextForehandMissed = findViewById(R.id.editTextForehandMissed);
        editTextForehandMissed.setVisibility(View.INVISIBLE);

        EditText editTextBackhandMissed = findViewById(R.id.editTextBackhandMissed);
        editTextBackhandMissed.setVisibility(View.INVISIBLE);

        EditText editTextWinners = findViewById(R.id.editTextWinners);
        editTextWinners.setVisibility(View.INVISIBLE);

        //ListView editStatsList = findViewById(R.id.editStatsList);
        //editStatsList.setVisibility(View.INVISIBLE);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
