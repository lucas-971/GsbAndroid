package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Database db;
    Button button;
    EditText editTextTextPersonName;
    EditText editTextTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new Database(this);
        button = (Button) findViewById(R.id.button);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
    }

    public void versMenu (View v) {
        String login = editTextTextPersonName.getText().toString();
        String mdp = editTextTextPassword.getText().toString();

        Boolean verifLogin = db.loginEtMdp(login, mdp);

        if (verifLogin == true) {
            Toast.makeText(getApplicationContext(), "Yesssss", Toast.LENGTH_SHORT).show();

            Intent go = new Intent(getApplicationContext(), Menu.class);
            startActivity(go);
            if (verifLogin == false){
                Toast.makeText(getApplicationContext(), "Not stonks", Toast.LENGTH_SHORT).show();

            }
        }
    }

}