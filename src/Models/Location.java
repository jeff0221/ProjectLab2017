package Models;

import Models.AbstractModels.Locater;

/**
 * Created by Zonde on 28-03-2017.
 */
public class Location implements Locater{
    private String name;
    private int id;

    public Location(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Location(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}