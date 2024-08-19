package in.co.nmsworks.week3.assessment;
//        1) Add the Following Vehicles to a Collection.
//
//        Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
//
//Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".


import java.util.HashMap;
import java.util.Map;

public class Program1 {
    public void vechicles(){
        Map<String ,Integer> vechiclesAndTyres=new HashMap<>();
        vechiclesAndTyres.put("car",4);
        vechiclesAndTyres.put("Bike",2);
        vechiclesAndTyres.put("Cycle",2);
        vechiclesAndTyres.put("Plane",3);
        vechiclesAndTyres.put("Jeep",4);
        vechiclesAndTyres.put("Ship",0);
        vechiclesAndTyres.put("Auto",3);
        vechiclesAndTyres.put("Boat",0);
        vechiclesAndTyres.put("Helicopter",0);
        vechiclesAndTyres.put("Bus",8);
        for (Map.Entry<String, Integer> vechicle : vechiclesAndTyres.entrySet()) {
            if(vechicle.getValue()==2){
                System.out.println(vechicle.getKey()+" is the Two Wheeler");
            }

        }
    }
}
