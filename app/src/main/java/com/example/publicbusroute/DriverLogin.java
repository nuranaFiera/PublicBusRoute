package com.example.publicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DriverLogin extends AppCompatActivity {

    private Button eLogin, eToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        //Driver Login
        eLogin = findViewById(R.id.btnDriverLogin);
        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DriverLogin.this, "You have successfully login!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DriverLogin.this, MapPassenger.class);
                startActivity(intent);
            }
        });

        //To Driver Register
        eToRegister = findViewById(R.id.btnCreateAcc);
        eToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverLogin.this, DriverRegister.class);
                startActivity(intent);
            }
        });
    }
}