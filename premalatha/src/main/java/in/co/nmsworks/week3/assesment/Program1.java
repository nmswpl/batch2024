package in.co.nmsworks.week3.assesment;
/*
Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public void vehicles(){
        List<String> fourWheelers = new ArrayList<>();
        fourWheelers.add("Car");
        fourWheelers.add("Bus");
        fourWheelers.add("Jeep");
        fourWheelers.add("Auto");

        List<String> waterVehicles = new ArrayList<>();
        waterVehicles.add("Boat");
        waterVehicles.add("Ship");

        List<String> airVehicles = new ArrayList<>();
        airVehicles.add("Plane");
        airVehicles.add("Helicopter");

        List<String> twoWheelers = new ArrayList<>();
        twoWheelers.add("Bike");
        twoWheelers.add("Cycle");


        for(String vehicles:twoWheelers)
            System.out.println(vehicles + " is a Two Wheeler");
    }
}
