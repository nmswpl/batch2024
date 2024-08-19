package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;

/*
Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

public class Question1 {
    public void checkVehicles(){
        Map<String,Integer> vehicles = new HashMap<>();
        vehicles.put("Car", 4);
        vehicles.put("Bike", 2);
        vehicles.put("Bus", 8);
        vehicles.put("Cycle", 2);
        vehicles.put("Plane", 2);
        vehicles.put("Jeep", 4);
        vehicles.put("Ship", 0);
        vehicles.put("Auto", 3);
        vehicles.put("Boat", 0);
        vehicles.put("Helicopter", 0);

        for (String vehicle : vehicles.keySet()) {
            if(vehicles.get(vehicle) == 2){
                System.out.println(vehicle+" is a two wheeler.");
            }
        }
    }
}