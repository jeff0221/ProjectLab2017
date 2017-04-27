package Controllers.AbstractControllers;

import Models.AbstractModels.Locater;
import Models.Vehicle;

import java.util.List;

/**
 * Created by Zonde on 30-03-2017.
 */
public interface VehicleRepository{
    Locater getLocation(int id);
    Vehicle getVehicle(int id);
    List<Vehicle> getVehicles();
    Vehicle.vehicleType getType(int id);
    List<Vehicle> getTypeVehicles(Vehicle.vehicleType type);

}