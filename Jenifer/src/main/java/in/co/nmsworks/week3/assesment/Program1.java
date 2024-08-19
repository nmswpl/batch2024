package in.co.nmsworks.week3.assesment;
/* Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler". */


import java.util.HashMap;
import java.util.Map;

public class Program1 {
    Map<String, Integer> vehicleName = new HashMap<>();
    public void twoWheeler(){
        vehicleName.put("Car", 4);
        vehicleName.put("Bike", 2);
        vehicleName.put("Cycle", 4);
        vehicleName.put("Plane", 0);
        vehicleName.put("Jeep", 4);
        vehicleName.put("Ship", 0);
        vehicleName.put("Auto", 3);
        vehicleName.put("Boat", 0);
        vehicleName.put("Helicopter", 0);

        for(Map.Entry entry : vehicleName.entrySet()){
            if (entry.getValue().equals(2)){
                System.out.println(entry.getKey() + " is a two wheeler");
            }
        }
    }
}
