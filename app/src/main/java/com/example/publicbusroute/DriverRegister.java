package com.example.publicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DriverRegister extends AppCompatActivity {

    private EditText eDriverName, eDriverEmail, eDriverID, eBusNum, eDriverPwd;
    private Button ebtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_register);

        eDriverName = findViewById(R.id.etDriverName);
        eDriverEmail = findViewById(R.id.etDriverEmail);
        eDriverID = findViewById(R.id.etDriverID);
        eBusNum = findViewById(R.id.etBusNum);
        eDriverPwd = findViewById(R.id.etDriverPwd);
        ebtnRegister = findViewById(R.id.btnRegister);

        //Register Button
        ebtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = eDriverName.getText().toString();
                String s2 = eDriverEmail.getText().toString();
                String s3 = eDriverID.getText().toString();
                String s4 = eBusNum.getText().toString();
                String s5 = eDriverPwd.getText().toString();
            }
        });
    }
}