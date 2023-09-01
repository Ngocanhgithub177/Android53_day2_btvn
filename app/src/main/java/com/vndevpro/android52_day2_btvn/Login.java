package com.vndevpro.android52_day2_btvn;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private TextView tv9;
    private TextView tv5;
    private TextInputEditText tf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv9 = findViewById(R.id.tv9);
        tv5 = findViewById(R.id.tv5);
        tf1 = findViewById(R.id.tf1);
        tv5.setOnClickListener(this);
        tv9.setOnClickListener(this);
        tf1.setText(getIntent().getStringExtra("phone"));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv5:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.tv9:
                Intent intent1 = new Intent(this, SignUp.class);
                startActivity(intent1);
                break;
        }
    }
}