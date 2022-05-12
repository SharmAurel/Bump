package service;

import model.Activite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ActiviteRepository;

import java.util.List;

@Service
public class ActivityService {
    private ActiviteRepository repository;

    @Autowired
    public ActivityService(ActiviteRepository repository)
    {
        this.repository=repository;
    }
    public List<Activite> getAllActivities()
    {
    return repository.findAll();
    }
}
