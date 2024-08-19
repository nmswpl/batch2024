package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Add the Following Vehicles to a Collection.
 * Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
 * Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

public class Program1 {

    public void twoWheeler() {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("Car");
        vehicles.add("Bike");
        vehicles.add("Bus");
        vehicles.add("Cycle");
        vehicles.add("Plane");
        vehicles.add("Jeep");
        vehicles.add("Ship");
        vehicles.add("Auto");
        vehicles.add("Boat");
        vehicles.add("Helicopter");


        for (String s1 : vehicles) {
            if ("Bike".equalsIgnoreCase(s1) || "Cycle".equalsIgnoreCase(s1)) {
                System.out.println(s1 + " is a Two Wheeler");
            }

        }

    }
}
