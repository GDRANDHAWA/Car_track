package com.example.dell.car_track;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

/**
 * Created by DELL on 2/5/2017.
 */

public class Second_layout extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button drvr2,drvr1;
        drvr1=(Button)findViewById(R.id.buttn1);
        drvr2=(Button)findViewById(R.id.btn2);

        View.OnClickListener trck1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Second_layout.this,track_1.class);

                startActivity(i);
                finish();
            }
        };
        drvr1.setOnClickListener(trck1);

        View.OnClickListener trck2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Second_layout.this,track_2.class);

                startActivity(i);
                finish();
            }
        };

        drvr2.setOnClickListener(trck2);


    }
}





