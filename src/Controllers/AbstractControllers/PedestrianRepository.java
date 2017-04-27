package Controllers.AbstractControllers;

import Models.AbstractModels.Locater;
import Models.Pedestrian;

import java.util.List;

/**
 * Created by Zonde on 28-03-2017.
 */
public interface PedestrianRepository
{
    Pedestrian.genderType getGender(int id);
    Locater getLocation(int id);
    Pedestrian getPedestrian(int id);
    List<Pedestrian> getPedestrians();
}
