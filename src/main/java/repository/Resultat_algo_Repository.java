package repository;

import model.Programme;
import model.Resultat_algo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Resultat_algo_Repository extends JpaRepository<Resultat_algo,Long> {

}
