package model;

import java.util.ArrayList;

public class Programme {
    // en fonction des réponses on va créer un programme personnalisé
    // durée
    // groupe muscu liste
    // equipement

    private Données données;
    public Programme()
    {
    }
    public Programme(Données données) {
        this.données = données;
    }
    public void setDonnées(ArrayList<Activite> activites)
    {
        this.données.setActivites(activites);
    }
    public ArrayList<Activite> tri_musculaire(ArrayList<Muscle> m) // pour le muscle
    {
        ArrayList<Activite> x= new ArrayList<>();

        for(Activite act : données.getActivites())
        {
            for(Muscle mus:m)
            {
                    if(mus.equals(act.groupe_muscluaire_principal)||mus.equals(act.getGroupe_musculaire_secondaire()))
                    {
                        x.add(act);
                    }

            }
        }
        return x;
    }
    public ArrayList<Activite> tri_equipement(ArrayList<Materiel> equipement,Difficulté diff) // pour l'equipement utilisé
    {
        ArrayList<Activite> x= new ArrayList<>();
        for(Activite act: données.getActivites())
        {
            for(Materiel mat:equipement)
            {
                //System.out.println(act.getDifficulté());
                if(act.getMaterielrequis().equals(mat)&&act.getDifficulté().equals(diff))
                {
                    x.add(act);
                }
            }
        }
        return x;
    }
    public ArrayList <Activite> calcul(int duree) // pour la durée
    {
        ArrayList<Activite> activities = new ArrayList<>();
        int dureeact=0;
        int repos=90;
        for(Activite act : données.getActivites())
        {
            if(dureeact+act.getDuree()+repos<duree)
            {
                dureeact=dureeact+(act.getDuree()*10)+repos;
                activities.add(act);
            }
        }
        System.out.println("Durée total : " + dureeact);
        return activities;
    }

}
