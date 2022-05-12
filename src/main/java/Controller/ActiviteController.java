package Controller;

import model.Activite;
import org.springframework.beans.factory.annotation.Autowired;
import service.ActivityService;

import java.util.List;

public class ActiviteController {
    @Autowired
    private ActivityService activityService;
    public ActiviteController(ActivityService activityService)
    {
        this.activityService=activityService;
    }
    public List<Activite> getAllActivities()
    {
        return activityService.getAllActivities();
    }
}
