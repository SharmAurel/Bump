package Controller;

import model.Resultat_algo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import model.Activite;
import service.Resultat_algo_Service;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class Resultat_algo_Controller {
    @Autowired
    private Resultat_algo_Service resultat_algo_service;
    public Resultat_algo_Controller(Resultat_algo_Service resultat_algo_service)
    {
        this.resultat_algo_service=resultat_algo_service;
    }
    @PostMapping("/")
    public void addArticle(@RequestBody Resultat_algo a) {
        resultat_algo_service.saveResults(a);
    }

}
