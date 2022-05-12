package DAO;

import model.Activite;
import model.Materiel;
import model.Muscle;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ActiviteDAOImpl implements ActiviteDAO{
    private JdbcTemplate jdbcTemp;

    public ActiviteDAOImpl(JdbcTemplate jdbcTemp) {
        this.jdbcTemp = jdbcTemp;
    }

    @Override
    public List<Activite> empList() {
        List<Activite> list = jdbcTemp.query("Select * from Activite",new RowMapper<Activite>()
        {
            @Override
            public Activite mapRow(ResultSet rs, int rowNum) throws SQLException {
                Activite emp = new Activite();

                emp.setId(Integer.valueOf(rs.getString("id")));
                emp.setNom(rs.getString("Nom"));
                emp.setMaterielrequis(Materiel.valueOf(rs.getString("Materiel")));
                emp.setGroupe_muscluaire_principal(Muscle.valueOf(rs.getString("muscle_primaire")));
                emp.setGroupe_musculaire_secondaire(Muscle.valueOf(rs.getString("muscle_secondaire")));
                emp.setDuree(Integer.valueOf(rs.getString("duree")));


                return emp;
            }

        });

        return list;
    }
}
