package in.co.nmsworks.week3.assignment;
/* Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
   Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".*/


import java.util.ArrayList;

public class Program1 {


    public static void main(String[] args) {
        Program2 p2 = new Program2();
        p2.evenElements();
        Program3 p3 = new Program3();
        p3.primeNumber(13);
        Vehicles v1 = new Vehicles(4, "Car");
        Vehicles v2 = new Vehicles(2, "Bike");
        Vehicles v3 = new Vehicles(4, "Bus");
        Vehicles v4 = new Vehicles(2, "Cycle");
        Vehicles v5 = new Vehicles(2, "Plane");
        Vehicles v6 = new Vehicles(4, "Jeep");
        Vehicles v7 = new Vehicles(0, "Ship");
        Vehicles v8 = new Vehicles(3, "Auto");
        Vehicles v9 = new Vehicles(0, "Boat");
        Vehicles v10 = new Vehicles(2, "Helicopter");

        ArrayList<Vehicles> type = new ArrayList<>();
        type.add(v1);
        type.add(v3);
        type.add(v6);
        type.add(v8);
        type.add(v2);
        type.add(v4);
        type.add(v5);
        type.add(v10);
        type.add(v7);
        type.add(v9);
        for (Vehicles vehicles : type) {
            if (vehicles.getWheels() == 2){
                System.out.println(vehicles.getName());

            }
        }
    }
}



