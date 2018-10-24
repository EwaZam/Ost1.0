package com.example.zamki.ost10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button bRRegister;
    EditText etRName, etRSurname, etREmail, etRDate, etUsername, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signIn();
    }


    private void signIn() {
        etUsername = (EditText) findViewById(R.id.etUsername);
        etRName = (EditText) findViewById(R.id.etRName);
        etRSurname = (EditText) findViewById(R.id.etRSurname);
        etREmail = (EditText) findViewById(R.id.etREmail);
        etRDate = (EditText) findViewById(R.id.etRDate);
        etPassword = (EditText) findViewById(R.id.etPassword);

        bRRegister = (Button) findViewById(R.id.bRRegister);

        bRRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bRRegister:

                break;
        }
    }
}
