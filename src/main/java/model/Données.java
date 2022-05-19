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
        /*public void envoie(int durée)
        {
            String mysqlurl ="jdbc:mysql://localhost/bump";
            try
            {
                Connection con= DriverManager.getConnection(mysqlurl,"root","root");
                PreparedStatement stm= con.prepareStatement("insert into resultat(duree,activite_une, activite_deux, activite_trois, activite_quatre, activite_cinq, activite_six, activite_sept, activite_huit, activite_neuf, activite_dix, activite_onze, activite_douze) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                int i=0;
                stm.setInt(1,durée);
                for(i=1;i<activites.size()+1;i++) {
                    if(i<13) {
                        stm.setInt(i+1 , getActivites().get(i-1).getId());
                    }
                }
                while(i<13)
                {
                    stm.setNull(i+1, java.sql.Types.INTEGER);
                    i++;
                }
                stm.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }
}
