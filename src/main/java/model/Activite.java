package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activite {
    @Id
    public int id;
    public String nom;
    public Materiel materielrequis;
    public Difficulté difficulté;
    public Muscle groupe_muscluaire_principal;
    public Muscle groupe_musculaire_secondaire;
    public int duree;
    public Activite()
    {

    }

    public Activite(int id, String nom, Materiel materielrequis, Difficulté difficulté, Muscle groupe_muscluaire_principal, int duree) {
        this.id = id;
        this.nom = nom;
        this.materielrequis = materielrequis;
        this.difficulté = difficulté;
        this.groupe_muscluaire_principal = groupe_muscluaire_principal;
        this.groupe_musculaire_secondaire=null;

        this.duree = duree;
    }

    public Activite(int id, String nom, Materiel materielrequis, Difficulté difficulté, Muscle groupe_muscluaire_principal, Muscle groupe_musculaire_secondaire, int duree) {
        this.id = id;
        this.nom = nom;
        this.materielrequis = materielrequis;
        this.difficulté = difficulté;
        this.groupe_muscluaire_principal = groupe_muscluaire_principal;
        this.groupe_musculaire_secondaire = groupe_musculaire_secondaire;
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Materiel getMaterielrequis() {
        return materielrequis;
    }

    public void setMaterielrequis(Materiel materielrequis) {
        this.materielrequis = materielrequis;
    }

    public Difficulté getDifficulté() {
        return difficulté;
    }

    public void setDifficulté(Difficulté difficulté) {
        this.difficulté = difficulté;
    }

    public Muscle getGroupe_muscluaire_principal() {
        return groupe_muscluaire_principal;
    }

    public void setGroupe_muscluaire_principal(Muscle groupe_muscluaire_principal) {
        this.groupe_muscluaire_principal = groupe_muscluaire_principal;
    }

    public Muscle getGroupe_musculaire_secondaire() {
        return groupe_musculaire_secondaire;
    }

    public void setGroupe_musculaire_secondaire(Muscle groupe_musculaire_secondaire) {
        this.groupe_musculaire_secondaire = groupe_musculaire_secondaire;
    }
    public String toString()
    {
        return id +" " + nom + " "+ materielrequis.toString() + " " + difficulté.toString() + " " + groupe_muscluaire_principal.toString() + " " + groupe_musculaire_secondaire.toString();
    }
}
