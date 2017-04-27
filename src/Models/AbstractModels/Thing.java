package Models.AbstractModels;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by Jeffrey on 20-03-2017.
 */
public abstract class Thing
{
    /*
    * Thing is the main building block of this application.
    *
    * It shows what all things the sensor picks up has to have in terms of data.
    *
    * It has a Location, a quantity, a list of related tags, a date with timestamp and date-
    * and lastly an integrityRating that shows how accurate the individual entries of data are.
    *
    * If you look most of the different files in the Models folder(package) you can see that they all have an "extends Thing"
    *
    * */

    private Locater location;
    private float quantity;
    private ArrayList<Tag> tags;
    private Date date;
    private float integrityRating;

    public Thing(Locater location, float quantity, ArrayList<Tag> tags, Date date, float integrityRating){
        this.location = location;
        this.quantity = quantity;
        this.tags = tags;
        this.date = date;
        this.integrityRating = integrityRating;
    }

    public Thing(){}

    public Locater getLocation(){
        return location;
    }

    public void setLocation(Locater location){
        this.location = location;
    }

    public float getQuantity(){
        return quantity;
    }

    public void setQuantity(float quantity){
        this.quantity = quantity;
    }

    public ArrayList<Tag> getTags(){
        return tags;
    }

    public void setTags(ArrayList<Tag> tags){
        this.tags = tags;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public float getIntegrityRating(){
        return integrityRating;
    }

    public void setIntegrityRating(float integrityRating){
        this.integrityRating = integrityRating;
    }
}
