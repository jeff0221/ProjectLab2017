package Models; /**
 * Created by Zonde on 20-03-2017.
 */

import com.mysql.jdbc.*;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import javafx.collections.ObservableList;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.Observable;



public class AccessDB
{
    private static AccessDB instance = getInstance();

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String sqlStatement;

    //Singleton constructor
    private AccessDB()
    {
        try
        {
            // Loads MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connects to datebase
            String url = "jdbc:mysql://localhost:3306/projectlab";
            connection = DriverManager.getConnection(url, "root", "gym44gnp");

            // Prints out confirmation
            System.out.println("URL: " + url);
            System.out.println("Connection: " + connection);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void createDB() {
        try {
            statement.executeUpdate("CREATE DATABASE projectlab");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AccessDB getInstance()
    {
        if(instance == null)
        {
            instance = new AccessDB(){
            };
            return instance;
        }
        else
        {
            return instance;
        }
    }

    public void setInstance(AccessDB instance)
    {
        this.instance = instance;
    }

    public Connection getConnection(){
        return connection;
    }

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public Statement getStatement(){
        return this.statement;
    }

    public void setStatement(Statement statement){
        this.statement = statement;
    }

    public ResultSet getResultSet(){
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet){
        this.resultSet = resultSet;
    }

    public String getSqlStatement(){
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement){
        this.sqlStatement = sqlStatement;
    }
}
