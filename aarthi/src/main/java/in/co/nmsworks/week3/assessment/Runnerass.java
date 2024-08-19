package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runnerass {
    static Map<String,Integer> vehiclesCollection=new HashMap<>();

    public static void main(String[] args) {

        Program1 evencount=new Program1(new int[]{1,2,4,5});
        evencount.evenelments();

        Program2 prime=new Program2();
        prime.primeNum();

        Vehicles car = new Vehicles("car",4);
        Vehicles bike = new Vehicles("bike",2);
        Vehicles cycle = new Vehicles("cycle",2);
        Vehicles bus = new Vehicles("bus",4);
        Vehicles plane = new Vehicles("plane",3);
        Vehicles jeep=new Vehicles("jeep",4);
        Vehicles auto = new Vehicles("auto",3);
        Vehicles boat = new Vehicles("boat",0);
        Vehicles ship = new Vehicles("ship",0);
        Vehicles helicopter = new Vehicles("helicopter",2);

        List<Vehicles> noOfWheels2=new ArrayList<>();
        noOfWheels2.add(helicopter);
        noOfWheels2.add(bike);
        noOfWheels2.add(cycle);
        List<Vehicles> noOfWheels0 = new ArrayList<>();
        noOfWheels0.add(ship);
        noOfWheels0.add(boat);
        List<Vehicles> noOfWheels3 = new ArrayList<>();
        noOfWheels3.add(plane);
        noOfWheels3.add(auto);
        List<Vehicles> noOfWheels4 = new ArrayList<>();
        noOfWheels4.add(car);
        noOfWheels4.add(bus);
        noOfWheels4.add(jeep);


    }


}
