package com.example.jyoti.physicsproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends ActionBarActivity implements OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("--Choose your option--");
        categories.add("Third Class");
        categories.add("Fourth Class");
        categories.add("Fifth Class");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        final Intent intent;
        switch(position){
            case 0:
                //intent = new Intent(MainActivity.this, MainActivity.class);
                //intent = new Intent(view.getContext(),ThirdClassActivity.class);
                //startActivity(intent);
                break;
            case 1:
                intent = new Intent(MainActivity.this, ThirdClassActivity.class);
                //intent = new Intent(view.getContext(),ThirdClassActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, FourthClassActivity.class);
                //intent = new Intent(view.getContext(),ThirdClassActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, FifthClassActivity.class);
                //intent = new Intent(view.getContext(),ThirdClassActivity.class);
                startActivity(intent);
                break;
        }


        /*//String selection = ((TextView)view).getText().toString();
        String item = parent.getItemAtPosition(position).toString();
        if (item.equals("Third Class")) {
            Intent intent = new Intent(view.getContext(),ThirdClassActivity.class);
            startActivity(intent);
        }
        else if(item.equals("Fourth Class")){
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            //Intent intent = new Intent(view.getContext(), Numbers.class);
            //startActivity(intent);
        }
        else{
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            //Intent intent = new Intent(view.getContext(), Face.class);
            //startActivity(intent);
        }*/
/*
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();*/
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
