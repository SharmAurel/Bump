package service;

import model.Resultat_algo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Resultat_algo_Repository;

@Service
public class Resultat_algo_Service {
    private Resultat_algo_Repository repository;
    @Autowired
    public Resultat_algo_Service(Resultat_algo_Repository repository) {
        this.repository = repository;
    }
    public void saveResults(Resultat_algo resultat_algo)
    {
        repository.save(resultat_algo);
    }

}
