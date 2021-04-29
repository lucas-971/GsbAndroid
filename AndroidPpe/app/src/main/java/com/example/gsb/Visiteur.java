package com.example.gsb;

import java.util.ArrayList;
import java.util.List;

public class Visiteur {
    String nom;
    String prenom;
    String identifiant;
    String mdp;

    public Visiteur( String identifiant,String mdp,String nom,String prenom){
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}