package service;

import model.donnee_util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Resultat_algo_Repository;
import repository.donne_util_Repository;

import java.util.Optional;

@Service
public class donnee_util_Service {
    private donne_util_Repository repository;
    @Autowired
    public donnee_util_Service(donne_util_Repository repository) {
        this.repository = repository;
    }
    public Optional<donnee_util> findById(Long id)
    {
        return repository.findById(Long.valueOf(1));
    }

}
