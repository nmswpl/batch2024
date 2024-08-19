package in.co.nmsworks.week3.assessment;
import java.util.*;

/**
 * 1) Add the Following Vehicles to a Collection.
 * 	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
 *    Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

public class Program1 {


        public static void main(String[] args) {
            List<String> vehicles = new ArrayList<>();
            vehicles.add("Car");
            vehicles.add("Bike");
            vehicles.add("Bus");
            vehicles.add("Cycle");
            vehicles.add("Plane");
            vehicles.add("Plane");
            vehicles.add("Jeep");
            vehicles.add("Ship");
            vehicles.add("Auto");
            vehicles.add("Boat");
            vehicles.add("Helicopter");
            Map<String, Integer> vehicleWheels = new HashMap<>();
            vehicleWheels.put("Car", 4);
            vehicleWheels.put("Bike", 2);
            vehicleWheels.put("Bus", 6);
            vehicleWheels.put("Cycle", 2);
            vehicleWheels.put("Plane", 6);
            vehicleWheels.put("Jeep", 4);
            vehicleWheels.put("Ship", 0);
            vehicleWheels.put("Auto", 3);
            vehicleWheels.put("Boat", 0);
            vehicleWheels.put("Helicopter", 0);

            for (String vehicle : vehicles) {
                if (vehicleWheels.getOrDefault(vehicle, 0) == 2) {
                    System.out.println(vehicle + " is a Two Wheeler");
                }
            }
        }
    }


