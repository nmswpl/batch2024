package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Program1 car = new Program1("Car", 4);
        Program1 bike = new Program1("Bike", 2);
        Program1 bus = new Program1("Bus", 4);
        Program1 cycle = new Program1("Cycle", 2);
        Program1 plane = new Program1("Plane", 6);
        Program1 jeep = new Program1("Jeep", 4);
        Program1 ship = new Program1("Ship", 0);
        Program1 auto = new Program1("Auto", 3);
        Program1 boat = new Program1("Boat", 0);
        Program1 helicopter = new Program1("Helicopter", 0);

        List<Program1> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(bus);
        vehicles.add(cycle);
        vehicles.add(plane);
        vehicles.add(jeep);
        vehicles.add(ship);
        vehicles.add(auto);
        vehicles.add(boat);
        vehicles.add(helicopter);

        for (Program1 vehicle : vehicles) {
            if (vehicle.getNumOfWeels() == 2) {
                System.out.println(vehicle.getVehicle_name() + " is a two weller ");
            }
        }
        Program2 program2 = new Program2();
        program2.countEvenNumbers();

        Program3 program3 = new Program3();
        program3.checkPrimeUsingSet();

        Program4 tuitionCenter1 = new Program4("Chennai", "CH01", "Physics", 30);
        Program4 tuitionCenter2 = new Program4("Salem", "Sa01", "Physics", 25);
        Program4 tuitionCenter3 = new Program4("Madurai", "Md01", "Physics", 20);
        Program4 tuitionCenter4 = new Program4("chennai", "CH01", "chemistry", 40);
        Program4 tuitionCenter5 = new Program4("Salem", "Sa01", "Chemistry", 45);
        Program4 tuitionCenter6 = new Program4("Madurai", "Md01", "Chemistry", 30);
        Program4 tuitionCenter7 = new Program4("chennai", "CH01", "Biology", 50);
        Program4 tuitionCenter8 = new Program4("Salem", "Sa01", "Biology", 30);
        Program4 tuitionCenter9 = new Program4("Madurai", "Md01", "Biology", 40);
        Program4 tuitionCenter10 = new Program4("chennai", "CH01", "Maths", 40);
        Program4 tuitionCenter11 = new Program4("Salem", "Sa01", "Maths", 40);
        Program4 tuitionCenter12 = new Program4("Madurai", "Md01", "Maths", 30);

        Map<String, List> branchNametobranchList = new HashMap<>();
        List<Program4> chennaiBranch = new ArrayList<>();
        chennaiBranch.add(tuitionCenter1);
        chennaiBranch.add(tuitionCenter4);
        chennaiBranch.add(tuitionCenter7);
        chennaiBranch.add(tuitionCenter10);

        List<Program4> salemBranch = new ArrayList<>();
        salemBranch.add(tuitionCenter2);
        salemBranch.add(tuitionCenter5);
        salemBranch.add(tuitionCenter8);
        salemBranch.add(tuitionCenter11);

        List<Program4> maduraiBranch = new ArrayList<>();
        maduraiBranch.add(tuitionCenter3);
        maduraiBranch.add(tuitionCenter6);
        maduraiBranch.add(tuitionCenter9);
        maduraiBranch.add(tuitionCenter12);

        branchNametobranchList.put("chennai",chennaiBranch);
        branchNametobranchList.put("salem",salemBranch);
        branchNametobranchList.put("madurai",maduraiBranch);
    }
}
