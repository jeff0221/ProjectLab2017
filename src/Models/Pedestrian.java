package Models;

import Models.AbstractModels.Thing;

/**
 * Created by Zonde on 24-03-2017.
 */
public class Pedestrian extends Thing
{
    public enum ageGroup
    {
        Elderly, Middle, Young, Undefined
    }

    public enum genderType
    {
        Female, Male, Undefined
    }

    private genderType gender;
    private int id;
    private Location location;

    public Pedestrian(genderType gender, int id, Location location)
    {
        this.gender = gender;
        this.id = id;
        this.location = location;
    }
    public Pedestrian(genderType gender, Location location)
    {
        this.gender = gender;
        this.location = location;
    }

    public static genderType genderByIntValue(int value)
    {
        if(value == 1)
        {
            return genderType.Female;
        }
        else if(value == 2)
        {
            return genderType.Male;
        }
        else
        {
            return genderType.Undefined;
        }
    }

    public genderType getGender(){
        return gender;
    }



    public static int genderNumFromType(genderType type)
    {
        if(type == genderType.Female)
        {
            return 1;
        }
        else if(type == genderType.Male)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    public int getId(){
        return id;
    }

    @Override
    public Location getLocation(){
        return location;
    }

    public static String getGenderString(genderType type)
    {
        if(type == genderType.Female)
        {
            return "Woman";
        }
        else if(type == genderType.Male)
        {
            return "Man";
        }
        else
        {
            return "UNDEFINED";
        }
    }

    public String getGenderType()
    {
        return getGenderString(gender);
    }
}
