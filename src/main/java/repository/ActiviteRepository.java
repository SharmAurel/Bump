package repository;

import model.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {
List<Activite> getAllActivities();
}