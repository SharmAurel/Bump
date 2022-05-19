package model;

import java.util.ArrayList;

public class donnee_util {
    private ArrayList<Muscle> muscles;
    private ArrayList<Materiel> materiels;
    private int duree;
    public donnee_util(ArrayList<Muscle> muscles, ArrayList<Materiel> materiels,int duree) {
        this.muscles = muscles;
        this.materiels = materiels;
        this.duree=duree;
    }

    public ArrayList<Muscle> getMuscles() {
        return muscles;
    }

    public void setMuscles(ArrayList<Muscle> muscles) {
        this.muscles = muscles;
    }

    public ArrayList<Materiel> getMateriels() {
        return materiels;
    }

    public void setMateriels(ArrayList<Materiel> materiels) {
        this.materiels = materiels;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
