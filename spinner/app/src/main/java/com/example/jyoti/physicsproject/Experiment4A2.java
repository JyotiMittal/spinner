package com.example.jyoti.physicsproject;

import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
import android.view.Menu;

/**
 * Created by jyoti on 27/3/16.
 */
public class Experiment4A2 extends Experiment4A{
    Button button1,button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.experiment4a2);
        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.previousBtn);
        button2 = (Button) findViewById(R.id.nextBtn);
        // Capture button clicks
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(Experiment4A2.this,Experiment4A.class);
                startActivity(myIntent);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(Experiment4A2.this,Experiment4A3.class);
                startActivity(myIntent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
