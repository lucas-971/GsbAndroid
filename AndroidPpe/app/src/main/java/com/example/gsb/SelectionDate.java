package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectionDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_date);
    }
    public void retour1 (View retourOne){
        Intent retour = new Intent(this, Menu.class);
        startActivity(retour);
    }
    public void deco2 (View deconnexion){
        Intent deco = new Intent(this, MainActivity.class);
        startActivity(deco);
    }
    public void validerDate (View valider){
        Intent vali = new Intent(this, listeCR.class);
        startActivity(vali);
    }
}