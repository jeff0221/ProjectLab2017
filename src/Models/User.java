package Models;

/**
 * Created by Zonde on 27-03-2017.
 */
public class User
{
    private String password;
    private String username;
    private int ID;

    public User(String password, String username, int ID){
        this.password = password;
        this.username = username;
        this.ID = ID;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getID(){
        return ID;
    }
}
