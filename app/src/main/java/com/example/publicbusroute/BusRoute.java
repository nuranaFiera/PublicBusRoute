package com.example.publicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusRoute extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_route);

        Button eRapidRoute = findViewById(R.id.btnRapidRoute);
        eRapidRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusRoute.this, rapidKL_route.class);
                startActivity(intent);
            }
        });

        Button eMRTRoute = findViewById(R.id.btnMRTRoute);
        eMRTRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusRoute.this, mrt_route.class);
                startActivity(intent);
            }
        });

    }
}