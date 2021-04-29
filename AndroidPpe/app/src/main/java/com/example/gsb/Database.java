package com.example.gsb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Date;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    //Creation table visiteur, praticien,
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table visiteur(matricule integer primary key,login text , password text, nom text, adresse text,cp int,ville text)");
        db.execSQL("Create table praticien( numero integer primary key autoincrement , nom text, adresse text,cp int,ville text,coefNotoriete float,matricule integer, foreign key(matricule) references visiteur(matricule))");
        db.execSQL("Create table rapportVisite( num integer primary key autoincrement , bilan text, date text,visite text ,dateRapport text,matricule integer, foreign key(matricule) references visiteur(matricule))");
        db.execSQL("Create table typePraticien( code integer primary key autoincrement ,libelle text, lieu text,numero integer, foreign key(numero) references visiteur(numero))");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists visiteur");
        db.execSQL("drop table if exists rapportVisite");
    }
    //Enregistrement fiches compte rendu
    public boolean enregistrer (String num, String bilan, String date, String visite, String dateRapport) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("num",num);
        contentValues.put("bilan",bilan);
        contentValues.put("date",date);
        contentValues.put("visite",visite);
        contentValues.put("dateRapport",dateRapport);
        long ins = db.insert("rapportVisite",null, contentValues);
        if(ins==-1)
            return false;
        else
            return true;
    }

    public boolean insertion (String login, String password) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("login",login);
        contentValues.put("password",password);
        long ins = db.insert("visiteur",null, contentValues);
        if(ins==-1)
            return false;
        else
            return true;
    }
    public Boolean remplir(String nom,String prenom){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom",nom);
        contentValues.put("prenom",prenom);
        long ins = db.insert("Praticien ",null, contentValues);
    }
    //La je verifie si mon login existe
    public Boolean verifLogin (String login){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor curseur = db.rawQuery("Select * from user where login =?", new String[] {login});
        if(curseur.getCount()>0)
            return false;

        else
            return true;
    }
    public boolean loginEtMdp (String login, String mdp){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor curseur = db.rawQuery("Select * from user where login =? and password =?",new String[]{login,mdp});
        if (curseur.getCount()>0)return true;
        else return false;
    }
}
