package com.example.keuangan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email, password;
    TextView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.ed_email);
        password = findViewById(R.id.ed_password);
        login = findViewById(R.id.tv_login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_login:
                if (email.equals("") || password.equals("")) {
                    Toast.makeText(this, "Esse'en Patek", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(this, Home.class);
                    startActivity(intent);
                    break;
                }
        }

    }
}

