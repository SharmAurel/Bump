package repository;

import model.Programme;
import model.donnee_util;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface donne_util_Repository extends JpaRepository<donnee_util,Long> {

}
