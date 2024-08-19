package in.co.nmsworks.week3.assessment;
/*
Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vehicles {
    public void twoWheeler() {
        List<String> vehiclesList = new ArrayList<>();
        vehiclesList.add("bike");
        vehiclesList.add("car");
        vehiclesList.add("bus");
        vehiclesList.add("cycle");
        vehiclesList.add("plane");
        vehiclesList.add("jeep");
        vehiclesList.add("ship");
        vehiclesList.add("auto");
        vehiclesList.add("boat");
        vehiclesList.add("helicopter");

        for(String vehicle : vehiclesList){
            if("bike".equalsIgnoreCase(vehicle) || "cycle".equalsIgnoreCase(vehicle)){
                System.out.println(vehicle+ " is a two wheelers");
            }
        }


    }









}
