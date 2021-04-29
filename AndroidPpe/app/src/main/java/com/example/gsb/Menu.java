package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;


public class Menu extends AppCompatActivity {
TextView nom,prenom;
    Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        db = new Database(this);
        nom = (TextView) findViewById(R.id.nom);
        prenom = (TextView) findViewById(R.id.prenom);

        }
        public void afficher (View v){
            String name = nom.getText().toString();


        }
    public void verSelection(View vue2){
        Intent go = new Intent(this,SelectionDate.class);
        startActivity(go);
    }
    public void deco(View deconnexion){
        Intent de = new Intent(this,MainActivity.class);
        startActivity(de);
    }
    public void ajoutcr (View go){
        Intent ajt = new Intent(this, AjoutCR.class);
        startActivity(ajt);
    }

}