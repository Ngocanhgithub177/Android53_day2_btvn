package com.vndevpro.android52_day2_btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {
    private TextView tv7;
    private TextInputEditText tf3;
    public static final String EXTRA_DATA = "EXTRA_DATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        tf3 = findViewById(R.id.tf3);
        tv7 = findViewById(R.id.tv7);
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }

    private void nextActivity() {
        String strPhone = tf3.getText().toString().trim();
        Intent intent = new Intent(SignUp.this, Login.class);
        intent.putExtra("phone", strPhone);
        startActivity(intent);
    }

}