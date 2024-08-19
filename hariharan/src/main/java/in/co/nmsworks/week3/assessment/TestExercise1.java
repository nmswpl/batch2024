package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Add the Following Vehicles to a Collection.
//	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
//   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".

public class TestExercise1 {
    public TestExercise1(){




        List<String> zeroWheelar = new ArrayList<>();
        zeroWheelar.add("ship");
        zeroWheelar.add("boat");
        zeroWheelar.add("Helicopter");

         List<String> twoWheelar = new ArrayList<>();
         twoWheelar.add("Cycle");
         twoWheelar.add("Bike");


        List<String> fourWheelar = new ArrayList<>();
        fourWheelar.add("Car");
        fourWheelar.add("Bus");
        fourWheelar.add("Jeep");

        List<String> sixWheelar = new ArrayList<>();
        sixWheelar.add("plane");

        List<String> threeWheelar = new ArrayList<>();
        threeWheelar.add("Auto");

        Map<Integer, List<String>> vechiles = new HashMap<>();
        vechiles.put(0,zeroWheelar);
        vechiles.put(2,twoWheelar);
        vechiles.put(3,threeWheelar);
        vechiles.put(4,fourWheelar);
        vechiles.put(6,sixWheelar);



                List<String> listOfVechiles = vechiles.get(2);
                for(String vechile : listOfVechiles){
                    System.out.println(vechile+" is a two wheelar");


        }



    }
}
