package com.example.gsb;

import java.util.ArrayList;
import java.util.List;

public class Modele {
    private static Modele modele = null;
    private List<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
    private Modele() {
        super();
        this.peupler();
    }
    public static Modele getModele() {
        if (modele == null) {
            modele = new Modele();
        }
        return modele;
    }
   /* public List<Visiteur> getLesVisiteurs() {
        return this.lesVisiteurs;
    }
    public Visiteur getLeVisiteur( String identifiant,String mdp){
        Visiteur leVisiteur = new Visiteur(identifiant,mdp);
        for (Visiteur visiteur: this.getLesVisiteurs()){
            if(identifiant == visiteur.getIdentifiant() && mdp == visiteur.getMdp() ){
              leVisiteur = Visiteur;
            } else{
                leVisiteur = null;
            }

        }
       return leVisiteur;
    }*/
    public void peupler() {
        lesVisiteurs.add(new Visiteur("lu","lulu","Cantin","Lucas"));
        lesVisiteurs.add(new Visiteur("ko","","",""));
        lesVisiteurs.add(new Visiteur("lo","","",""));
        lesVisiteurs.add(new Visiteur("yo","","",""));
    }

}
