package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class finalPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);
    }
    public void retour2 (View retourOne){
        Intent retour = new Intent(this, listeCR.class);
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
    public void suppression (View supp){
        Intent sup = new Intent(this, listeCR.class);
        startActivity(sup);
    }
}