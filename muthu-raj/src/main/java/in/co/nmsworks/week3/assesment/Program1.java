package in.co.nmsworks.week3.assesment;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

/*
1) Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */
public class Program1 {
    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("Car", 4);
        vehicles.put("Bike",2);
        vehicles.put("Cycle",2);
        vehicles.put("Plane",3);
        vehicles.put("Jeep",4);
        vehicles.put("Ship", 0);
        vehicles.put("Auto",3);
        vehicles.put("Boat",0);
        vehicles.put("Helicopter",0);

        Program1 p = new Program1();
        p.printTwoWheelers(vehicles);
    }

    public void printTwoWheelers(Map<String, Integer> vehicles){
        for (Map.Entry<String,Integer> v : vehicles.entrySet()){
            if (v.getValue() == 2){
                System.out.println(v.getKey());
            }
        }
    }
}
