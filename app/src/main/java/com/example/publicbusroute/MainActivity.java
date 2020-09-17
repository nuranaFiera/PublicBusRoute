package com.example.publicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("bus","onCreate");

        //passenger
        Button ePassenger = findViewById(R.id.btnPassenger);
        ePassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapPassenger.class);
                startActivity(intent);
            }
        });

        Button eDriver = findViewById(R.id.btnDriver);
        //Click function
        eDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DriverLogin.class);
                startActivity(intent);
            }
        });
    //Image Background
        ImageView rapid = findViewById(R.id.picRapid);
        ImageView mrt = findViewById(R.id.picMRT);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("bus", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("bus","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("bus","onStop");
    }


}