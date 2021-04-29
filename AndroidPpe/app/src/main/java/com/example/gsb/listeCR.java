package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class listeCR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_c_r);
    }
    public void retour2 (View retourOne){
        Intent retour = new Intent(this, SelectionDate.class);
        startActivity(retour);
    }
    public void deco3 (View deconnexion){
        Intent deco = new Intent(this, MainActivity.class);
        startActivity(deco);
    }
    public void menu (View menuOne){
        Intent me = new Intent(this, Menu.class);
        startActivity(me);
    }
}