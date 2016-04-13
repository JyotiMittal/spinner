package com.example.jyoti.physicsproject;

import java.lang.String;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.Intent;

/**
 * Created by jyoti on 23/3/16.
 */
public class FourthClassActivity extends MainActivity {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.fouthclass);

        /* Initialize Radio Group and attach click handler */
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        /* Attach CheckedChangeListener to radio group */
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    Toast.makeText(FourthClassActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClear(View v) {
        /* Clears all selected radio buttons to default */
        radioGroup.clearCheck();
    }

    public void onSubmit(View v) {
        String value;
        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        //Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
        value = rb.getText().toString();
        if (value.equals("Find out why leaves change colour?")) {
            Intent intent1 = new Intent(this, Experiment4A.class);
            startActivity(intent1);
            }
        else if(value.equals("Potato Battery")){
                Intent intent1 = new Intent(this,Experiment4B.class);
                startActivity(intent1);
            }
    }
}
