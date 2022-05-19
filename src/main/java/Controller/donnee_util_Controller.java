package Controller;

import model.Activite;
import model.donnee_util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.donnee_util_Service;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class donnee_util_Controller {
    @Autowired
    private donnee_util_Service donnee_util_service;
    public donnee_util_Controller(donnee_util_Service donnee_util_service)
    {
        this.donnee_util_service=donnee_util_service;
    }
    @GetMapping("/nouveau-programme/")
    public Optional<donnee_util> findById() {
        return donnee_util_service.findById(Long.valueOf(1));
    }
}
