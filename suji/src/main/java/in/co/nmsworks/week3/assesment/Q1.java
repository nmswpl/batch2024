package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("CAR", 4);
        map.put("Bike", 2);
        map.put("Bus", 4);
        map.put("CYcle", 2);
        map.put("Plane", 4);
        map.put("Jeep", 4);
        map.put("Ship", 1);
        map.put("Auto", 3);
        map.put("Boat", 0);
        map.put("Helicoper", 4);

       System.out.println("Vehicles having only 2 wheels");
        for (String i : map.keySet()) {
        if(map.get(i)==2)
        {
            System.out.println(map.get(i)+" "+i);
        }
        }
    }
}


