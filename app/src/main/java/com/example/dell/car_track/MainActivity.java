package com.example.dell.car_track;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnclick1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick1=(Button) findViewById(R.id.loginbtn);
        View.OnClickListener loginbuttn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Second_layout.class);

                startActivity(i);

            }
        };
        btnclick1.setOnClickListener(loginbuttn);
    }
}
