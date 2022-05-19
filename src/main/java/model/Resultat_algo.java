package model;

import java.util.ArrayList;

public class Resultat_algo {
    private int duree;
    private ArrayList<Activite> activites;

    public Resultat_algo(int duree) {
        this.duree = duree;
        this.activites=new ArrayList<>();
    }
    public void addActivite(Activite a)
    {
        this.activites.add(a);
    }
    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public ArrayList<Activite> getActivites() {
        return activites;
    }

    public void setActivites(ArrayList<Activite> activites) {
        this.activites = activites;
    }
}
