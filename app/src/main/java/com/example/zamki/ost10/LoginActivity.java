package com.example.zamki.ost10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button bLogin, bRegister, bMissPass;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn();
    }

    private void signIn(){
        etUsername = (EditText) findViewById(R. id.etUsername);
        etPassword = (EditText) findViewById(R. id.etPassword);
        bLogin = (Button) findViewById(R. id.bLogin);
        bRegister = (Button) findViewById(R. id.bRegister);
        bMissPass = (Button) findViewById(R. id.bMissPass);

        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bLogin:
                startActivity(new Intent(this, MainActivity.class));
            break;
            case R.id.bRegister:
                startActivity(new Intent(this, RegisterActivity.class));
                break;

        }
    }
}
