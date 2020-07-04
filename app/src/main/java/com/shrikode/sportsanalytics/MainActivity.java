package com.shrikode.sportsanalytics;

import android.content.Intent;
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

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    com.shrikode.sqldemo.DatabaseHelper mDatabaseHelper;
    private Button btnAdd, btnViewData;
    private EditText editText;


    public void viewStats(View view){

        setContentView(R.layout.view_stats);
        ListView statsList = findViewById(R.id.statsList);

        final String[] values = new String[] { "First Serve Percentage", "Second Serve Percentage", "Double Faults",
                "Errors", "Winners" }; // You have the necessary data to bind the list.

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values); // You have set     the previous array to an adapter that can be now setted to a list.

        statsList.setAdapter(adapter);
    }

    public void editStats(View view){
        setContentView(R.layout.edit_stats);
    }

    public void goToCourt(View view)
    {

        setContentView(R.layout.tennis_court);
        /**

        EditText firstServesMade = findViewById(R.id.editTextFirstServeMade);
        int firstServes = Integer.parseInt(firstServesMade.getText().toString());
        EditText secondServesMade = findViewById(R.id.editTextSecondServeMade);
        int secondServes = Integer.parseInt(firstServesMade.getText().toString());
        EditText doubleFaults =  findViewById(R.id.editTextDoubleFaults);
        int doublefaults = Integer.parseInt(firstServesMade.getText().toString());

        boolean insertData = mDatabaseHelper.addData(firstServes);

        if (insertData) {
            toastMessage("Data Successfully Inserted!");
        } else {
            toastMessage("Something went wrong");
        }
         */

    }

    public void submitCourtInfo (View view)
    {
        setContentView(R.layout.view_stats);

        /**
        EditText editTextShortLeft = findViewById(R.id.editTextShortLeft);
        int shortLeft = Integer.parseInt(editTextShortLeft.getText().toString());
        EditText editTextShortRight = findViewById(R.id.editTextShortRight);
        int shortRight = Integer.parseInt(editTextShortRight.getText().toString());
        EditText editTextDeepLeft =  findViewById(R.id.editTextDeepLeft);
        int doublefaults = Integer.parseInt(editTextDeepLeft.getText().toString());
        EditText editTextDeepRight =  findViewById(R.id.editTextDeepRight);
        int deepRight = Integer.parseInt(editTextDeepLeft.getText().toString());

        boolean insertData = mDatabaseHelper.addData(shortLeft);

        if (insertData) {
            toastMessage("Data Successfully Inserted!");
        } else {
            toastMessage("Something went wrong");
        }
         */
    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }


    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double y,x;
        x = -5.0;

        GraphView statsGraph = (GraphView) findViewById(R.id.statsGraph);
        series = new LineGraphSeries<DataPoint>();
        for(int i =0; i<100; i++) {
            x = x + 0.1;
            y = Math.sin(x);
            series.appendData(new DataPoint(x, y), true, 99);
            System.out.println(series.getHighestValueX());
        }
        //System.out.println(series.getHighestValueX());
        if(!series.equals(null))
        {
            System.out.println("Fail");
            //statsGraph.addSeries(series);

        }


    }
}
