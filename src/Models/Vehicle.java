package Models;

import Models.AbstractModels.Locater;
import Models.AbstractModels.Tag;
import Models.AbstractModels.Thing;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by Jeffrey on 24-03-2017.
 */
public class Vehicle extends Thing
{
    public enum vehicleType
    {
        Car, Truck, Bus, MotorCycle, Train, Metro, Bike
    }
    private int seatAmount;
    private int passengerAmount;
    private String model;
    private float estimatedKmph;
    private vehicleType type;

    public Vehicle(Locater location, float quantity, Date date,
           float integrityRating, int seatAmount, int passengerAmount, String model,
           float estimatedKmph, vehicleType type)
    {
        super(location, quantity, null, date, integrityRating);
        this.seatAmount = seatAmount;
        this.passengerAmount = passengerAmount;
        this.model = model;
        this.estimatedKmph = estimatedKmph;
        this.type = type;
    }

    public int getSeatAmount(){
        return seatAmount;
    }

    public void setSeatAmount(int seatAmount){
        this.seatAmount = seatAmount;
    }

    public int getPassengerAmount(){
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount){
        this.passengerAmount = passengerAmount;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public float getEstimatedKmph(){
        return estimatedKmph;
    }

    public void setEstimatedKmph(float estimatedKmph){
        this.estimatedKmph = estimatedKmph;
    }

    public vehicleType getType(){
        return type;
    }

    public void setType(vehicleType type){
        this.type = type;
    }
}
