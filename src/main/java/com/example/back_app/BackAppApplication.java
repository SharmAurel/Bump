package com.example.back_app;

import model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class BackAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(BackAppApplication.class, args);
        //System.out.println("yo");
        ArrayList<String> musclles;// à remplacer par données utilisateur
        ArrayList<Muscle> muscles = new ArrayList<>();
        ArrayList<String> materiells;

        ArrayList<Materiel> materiels = new ArrayList<>(); // aussi
        String muscless ="Biceps;Triceps;";
        String materielss="Halteres"; //entrer les equipements avec des ;
        musclles = new ArrayList<>(Arrays.asList(muscless.split(";")));
        materiells = new ArrayList<>(Arrays.asList(materielss.split(";")));

        for(String s:musclles)
        {
            muscles.add(Muscle.valueOf(s));
        }
        for(String s:materiells)
        {
            materiels.add(Materiel.valueOf(s));
        }
        Difficulté difficulté=Difficulté.Facile;
        materiels.add(Materiel.Barre_traction);
        materiels.add(Materiel.Halteres);

        Données données = new Données();
        données.setActivites(données.ajout());
        Programme prgm= new Programme(données);
        prgm.setDonnées(prgm.tri_musculaire(muscles));
        prgm.setDonnées(prgm.tri_equipement(materiels,difficulté));
        int durée_tot=1500;
        int at=1;
        prgm.setDonnées(prgm.calcul(durée_tot));
        Resultat_algo res=new Resultat_algo(durée_tot);
        for(Activite x: données.getActivites())
        {
            durée_tot=durée_tot+(x.getDuree()*10)+90;
            res.addActivite(x);
            System.out.println("Activité " +at + ": " +x.nom);

            at++;
        }

        //ActiviteDAOImpl un = new ActiviteDAOImpl()

    }

}
