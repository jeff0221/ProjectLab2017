package Controllers.AbstractControllers;

import Models.User;

import java.util.List;

/**
 * Created by Zonde on 27-03-2017.
 */
public interface UserRepository
{
    String getUsername(int id);
    int getID(String username);
    boolean passwordValid(String password, int ID);
    boolean passwordValid(String password, String username);
    boolean usernameValid(String username, int ID);
    boolean usernameValid(String username);
    List<User> getUsers();
}