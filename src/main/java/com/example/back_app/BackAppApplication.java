package com.example.back_app;

import Controller.ActiviteController;
import DAO.ActiviteDAOImpl;
import model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.ActiviteRepository;
import service.ActivityService;

import java.util.ArrayList;

@SpringBootApplication
public class BackAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(BackAppApplication.class, args);
        //System.out.println("yo");
        ArrayList<Muscle> muscles= new ArrayList<Muscle>();// à remplacer par données utilisateur
        muscles.add(Muscle.Triceps);
        muscles.add(Muscle.Biceps);
        Difficulté difficulté=Difficulté.Facile;
        ArrayList<Materiel> materiels = new ArrayList<>(); // aussi
        materiels.add(Materiel.Barre_traction);
        materiels.add(Materiel.Halteres);
        Données données = new Données();
        données.setActivites(données.ajout());
        Programme prgm= new Programme(données);
        prgm.setDonnées(prgm.tri_musculaire(muscles));



        prgm.setDonnées(prgm.tri_equipement(materiels,difficulté));
        for(Activite x: données.getActivites())
        {
            System.out.println(x.nom);
        }
        prgm.setDonnées(prgm.calcul(20000));
        //ActiviteDAOImpl un = new ActiviteDAOImpl()
        ActiviteRepository activiteRepository;
              for(Activite x: données.getActivites())
        {
            System.out.println(x.nom);
        }
    }

}
