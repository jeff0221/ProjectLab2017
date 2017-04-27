package Controllers;

import Controllers.AbstractControllers.UserRepository;
import Models.AccessDB;
import Models.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Zonde on 27-03-2017.
 */
public class UserRepoImplementation implements UserRepository
{
    AccessDB database = AccessDB.getInstance();

    @Override
    public String getUsername(int id){

        //TODO: SQL STATEMENTS FOR ALL THE METHODS


        return null;
    }

    @Override
    public int getID(String username){
        return 0;
    }

    @Override
    public boolean passwordValid(String password, int ID){
        return false;
    }

    @Override
    public boolean passwordValid(String password, String username){
        return false;
    }

    @Override
    public boolean usernameValid(String username, int ID){
        return false;
    }

    @Override
    public boolean usernameValid(String username){
        return false;
    }

    @Override
    public List<User> getUsers(){
        return null;
    }
}
