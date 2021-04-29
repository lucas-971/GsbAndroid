package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Date;

public class AjoutCR extends AppCompatActivity {
TextView textView9;
Spinner spinnerPR, spinnerMo, spinnerCO;
DatePicker date1;
Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_c_r);
        textView9 = (TextView) findViewById(R.id.textView9);
        spinnerCO = (Spinner) findViewById(R.id.spinnerCO);
        spinnerMo = (Spinner) findViewById(R.id.spinnerMo);
        spinnerPR = (Spinner) findViewById(R.id.spinnerPR);
        date1 = (DatePicker) findViewById(R.id.date1);
        db = new Database(this);

    }
    //plus num visiteur
  /*public void  enregistrer (View v){
        String num = editTextTextPersonName.getText().toString();
        String bilan = textView9.getText().toString();
        String date = editTextTextPassword.getText().toString();
        Date dateVisite = date1.getInstance().getTime();
    }*/

    public void retour2 (View retourOne){
        Intent retour = new Intent(this, Menu.class);
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
    public void enregistrement (View enr){
        Intent  enre = new Intent(this,finalPage.class);
        startActivity(enre);
    }
}