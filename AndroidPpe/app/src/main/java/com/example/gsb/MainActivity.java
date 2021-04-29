package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    Database db;
    Button button, inscription;
    EditText editTextTextPersonName;
    EditText editTextTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new Database(this);
        button = (Button) findViewById(R.id.button);
        inscription = (Button) findViewById(R.id.inscription);
        editTextTextPersonName =  findViewById(R.id.editTextTextPersonName);
        editTextTextPassword =  findViewById(R.id.editTextTextPassword);

    }
    public void inscription (View vue){
                String name = editTextTextPersonName.getText().toString();
                String mdp = editTextTextPassword.getText().toString();
                if(name.equals("") || mdp.equals("")){
                    Toast.makeText(getApplicationContext(),"vide",Toast.LENGTH_SHORT).show();


                }
                else{

                        Boolean verifEmail = db.verifLogin(name);
                        if(verifEmail==true){
                            Boolean insertion = db.insertion(name,mdp);
                                if(insertion==true){
                                    Toast.makeText(getApplicationContext(),"enregistrement valide",Toast.LENGTH_SHORT).show();
                                }
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "existe deja", Toast.LENGTH_SHORT).show();
                        }
                    }

    }




    public void versConnection (View vu) {
        Intent intentEnvoyer = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intentEnvoyer);
    }


}