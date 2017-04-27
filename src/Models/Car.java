package Models;

import Models.AbstractModels.Locater;

import java.sql.Date;

/**
 * Created by Jeffrey on 24-03-2017.
 */
public class Car extends Vehicle
{
    public enum carType
    {
        Economy, Family, Sedan, Luxury, Sport, OffRoad, Commercial
    }

    public Car(Locater location, float quantity, Date date, float integrityRating, int seatAmount, int passengerAmount,
               String model, float estimatedKmph, vehicleType type){
        super(location, quantity, date, integrityRating, seatAmount, passengerAmount, model, estimatedKmph, type);
    }
}
