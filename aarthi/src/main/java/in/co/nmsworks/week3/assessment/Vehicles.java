package in.co.nmsworks.week3.assessment;
/*
Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vehicles {
    String vehiclesType;
    Integer numOfWheels;

    public String getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    public Integer getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(Integer numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Vehicles(String vehiclesType, Integer numOfWheels){
        this.vehiclesType=vehiclesType;
        this.numOfWheels=numOfWheels;
    }
    private static void vehiclesCollection(int i, List<Vehicles> noOfWheels0) {
    }

}
