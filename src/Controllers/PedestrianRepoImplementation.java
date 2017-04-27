package Controllers;

import Controllers.AbstractControllers.PedestrianRepository;
import Models.AbstractModels.Locater;
import Models.AccessDB;
import Models.Pedestrian;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.List;
import java.util.Observable;

import java.util.List;

/**
 * Created by Zonde on 28-03-2017.
 */
public class PedestrianRepoImplementation implements PedestrianRepository
{
    AccessDB database = AccessDB.getInstance();

    @Override
    public Pedestrian.genderType getGender(int id)
    {
        //TODO; SQL statement that gets the gender value from server and puts it into the
        //TODO: Pedestrian.genderByIntValue() method.
        return null;
    }
    @Override
    public Pedestrian getPedestrian(int id)
    {
        return null;
    }
    @Override
    public Locater getLocation(int id)
    {
        return null;
    }
    public boolean createNewPedestrian(Pedestrian pedestrian)
    {
        boolean insertionSucceeded;

        try
        {
//            database.setStatement(database.getConnection().prepareStatement("USE projectlab"));
//            database.getStatement().executeUpdate("use project lab");
//            database.setStatement(database.getConnection().prepareStatement("INSERT INTO `projectlab`.`pedestrian` (`gender`, `location`) " +
//                    "VALUES ('?', '?');"));
//            database.getStatement().setString(1, Pedestrian.genderByIntValue(pedestrian.getId()));
//            database.getStatement().setString(2, pedestrian.getLocation().getId());

            database.getStatement().executeUpdate("INSERT INTO `projectlab`.`pedestrian` (`gender`, `location`) " +
                    "VALUES ('"+Pedestrian.genderNumFromType(pedestrian.getGender())+"', '"+pedestrian.getLocation().getId()+"');");
            System.out.println("Successfully put a " + pedestrian.getGender() +
                    " into the data base at " + pedestrian.getLocation().getName() + " Location");
            insertionSucceeded = true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            insertionSucceeded = false;
        }
//        String stmnt="INSERT INTO `projectlab`.`pedestrian` (`gender`, `location`) " +
//                "VALUES ('"+pedestrian.getGender()+"', '"+pedestrian.getLocation().getId()+"');";
        return insertionSucceeded;
    }
    public List<Pedestrian> getPedestrians()
    {
        return null;
    }
}