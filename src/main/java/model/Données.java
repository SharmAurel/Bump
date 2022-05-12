package model;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Données {
    private List<Activite> activites;
    public Données()
    {
        this.activites=new ArrayList<>();
    }
    public List<Activite> ajout() // à faire
    {
    ArrayList <Activite> a= new ArrayList<>();
        String mysqlUrl = "jdbc:mysql://localhost/bump";
        try {
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
            Statement stm= con.createStatement();
            ResultSet rs = stm.executeQuery("select * from activite");
            while(rs.next())
            {
                Activite emp = new Activite();

                emp.setId(Integer.valueOf(rs.getString("id")));
            emp.setNom(rs.getString("Nom"));
            emp.setMaterielrequis(Materiel.valueOf(rs.getString("Materiel")));
            emp.setGroupe_muscluaire_principal(Muscle.valueOf(rs.getString("muscle_primaire")));
            emp.setGroupe_musculaire_secondaire(Muscle.valueOf(rs.getString("muscle_secondaire")));
            emp.setDifficulté(Difficulté.valueOf(rs.getString("Difficulte")));
            emp.setDuree(Integer.valueOf(rs.getString("duree")));
            a.add(emp);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }
}
