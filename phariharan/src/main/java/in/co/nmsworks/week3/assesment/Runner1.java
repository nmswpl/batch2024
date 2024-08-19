package in.co.nmsworks.week3.assesment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1) Add the Following Vehicles to a Collection.
 * 	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
 *    Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */

public class Runner1 {

    Set<Vehicle> vehicles = new HashSet<>();

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car",4);
        Vehicle bike = new Vehicle("Bike",2);
        Vehicle bus = new Vehicle("Bus",4);
        Vehicle cycle = new Vehicle("Cycle",2);
        Vehicle plane = new Vehicle("Plane",6);
        Vehicle jeep = new Vehicle("Jeep",4);
        Vehicle ship = new Vehicle("Ship",0);
        Vehicle auto = new Vehicle("Auto",3);
        Vehicle boat = new Vehicle("Boat",0);
        Vehicle helicopter = new Vehicle("helicopter",6);

        Runner1 vehicle = new Runner1();
        Vehicle[] vehiclesArray= {car,bike,boat,bus,cycle,plane,jeep,ship,auto,helicopter};
        vehicle.addVehicle(vehiclesArray);
        vehicle.displayTwoWheelers();
    }

    public void addVehicle(Vehicle[] vehicle){
        vehicles.addAll(Arrays.asList(vehicle));
    }

    public void displayTwoWheelers(){
        for(Vehicle value : vehicles){
            if (value.getWheelCount()==2){
                System.out.println(value.getVehicleName()+" is a Two Wheeler");
            }
        }
    }

}
