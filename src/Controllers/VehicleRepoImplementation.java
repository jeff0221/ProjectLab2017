package Controllers;

import Controllers.AbstractControllers.VehicleRepository;
import Models.AbstractModels.Locater;
import Models.AccessDB;
import Models.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zonde on 30-03-2017.
 */
public class VehicleRepoImplementation implements VehicleRepository
{
    AccessDB repo = AccessDB.getInstance();


    @Override
    public Locater getLocation(int id){
        return null;
    }

    @Override
    public Vehicle getVehicle(int id){
        return null;
    }

    @Override
    public List<Vehicle> getVehicles(){


        try
        {
            repo.getStatement().execute("SELECT * FROM projectlab.vehicle;");

            repo.setResultSet(repo.getStatement().executeQuery("SELECT * FROM projectlab.vehicle;"));

            List<Vehicle> vehicleList = new ArrayList<Vehicle>();

            //TODO: change all hardcoded parts to dynamic.

            while (repo.getResultSet().next())
            {
                vehicleList.add(new Vehicle(null,1.0f,repo.getResultSet().getDate("date"),100.0f,repo.getResultSet().getInt("seatAmount"),
                        repo.getResultSet().getInt("passengerAmount"),repo.getResultSet().getString("model"),
                        repo.getResultSet().getFloat("estimatedKmph"),Vehicle.vehicleType.Car));
            }
            return vehicleList;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Vehicle.vehicleType getType(int id){
        return null;
    }

    @Override
    public List<Vehicle> getTypeVehicles(Vehicle.vehicleType type){



        return null;
    }
}
