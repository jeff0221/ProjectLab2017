package Controllers.AbstractControllers;

import Models.Location;

import java.util.List;

/**
 * Created by Jeffrey on 28-03-2017.
 */
public interface LocationRepository
{
    String getName(int id);
    List<Location> getLocations();
}
