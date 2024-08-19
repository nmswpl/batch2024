package in.co.nmsworks.week3.assesment;


/*1) Add the Following Vehicles to a Collection.
        Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".*/


import java.util.*;

public class Program1 {
    public void addArrayList(){
        Map<Integer, List<String>> vehicles = new HashMap<>();

        List<String> vehiclesWith2Wheels = new ArrayList<>();
        vehiclesWith2Wheels.add("Bike");
        vehiclesWith2Wheels.add("Cycle");

        List<String> vehiclesWith4Wheels = new ArrayList<>();
        vehiclesWith4Wheels.add("Bus");
        vehiclesWith4Wheels.add("Car");
        vehiclesWith4Wheels.add("Jeep");

        List<String> vehiclesWith3Wheels = new ArrayList<>();
        vehiclesWith3Wheels.add("Plane");
        vehiclesWith3Wheels.add("Auto");

        List<String> vehiclesWith0Wheels = new ArrayList<>();
        vehiclesWith0Wheels.add("Boat");
        vehiclesWith0Wheels.add("Helicopter");
        vehiclesWith0Wheels.add("Ship");

        vehicles.put(0,vehiclesWith0Wheels);
        vehicles.put(2,vehiclesWith2Wheels);
        vehicles.put(3,vehiclesWith3Wheels);
        vehicles.put(4,vehiclesWith4Wheels);

        System.out.println(vehicles.get(2));
        }
    }
