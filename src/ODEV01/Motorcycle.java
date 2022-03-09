package ODEV01;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */
public class Motorcycle extends Vehicle {
    // Motosiklet-> Chopper, Commuter, Cross, Kar Motosikleti, Scooter, Sport Touring, Super Sport

    String vehicleType =  "Motorcycle";
    int wheelCount;

    public Motorcycle(
            String brand, String color, String model, String productionYear, String engineName, int enginePower,
            int engineCapacity, String fuelType, String vehicleType, int wheelCount, Passenger driver, ArrayList<Passenger> passengerList) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, passengerList);
        this.setType(vehicleType);
        this.wheelCount = wheelCount;
    }

    @Override
    String pureDefinition() {
        return null;
    }
}