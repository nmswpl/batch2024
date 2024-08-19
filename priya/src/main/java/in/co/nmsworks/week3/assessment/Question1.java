package in.co.nmsworks.week3.assessment;

import java.util.HashMap;
import java.util.Map;

/*Add the Following Vehicles to a Collection.
        Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".*/
public class Question1 {
    public static void main(String[] args) {
        Map<String,Integer> vehicleTowheels = new HashMap<>();
        vehicleTowheels.put("Car",4);
        vehicleTowheels.put("Bus",4);
        vehicleTowheels.put("Bike",2);
        vehicleTowheels.put("Cycle",2);
        vehicleTowheels.put("Plane",3);
        vehicleTowheels.put("Jeep",4);
        vehicleTowheels.put("Ship",1);
        vehicleTowheels.put("Auto",3);
        vehicleTowheels.put("Boat",0);
        vehicleTowheels.put("Helicopter",0);
        for(Map.Entry<String,Integer> entry: vehicleTowheels.entrySet()){
          if(entry.getValue()==2){
              System.out.println(entry.getKey()+" is a Two wheeler");
          }
        }


    }
}
