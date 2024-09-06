package in.co.nmsworks.week5.day5.junction;

import java.util.Random;

public class AddVehicles implements Runnable {

    private Road road1;

    private Road road2;

    private Road road3;

    private Road road4;

    public AddVehicles(Road road1, Road road2, Road road3, Road road4) {
        this.road1 = road1;
        this.road2 = road2;
        this.road3 = road3;
        this.road4 = road4;
    }

    @Override
    public void run() {
        try {
            while (true) {
                addVehicle(road1);
                addVehicle(road2);
                addVehicle(road3);
                addVehicle(road4);
                System.out.println("-------------------------------");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void addVehicle(Road road){
        for (int i = 0; i < new Random().nextInt(10)+1; i++) {
            road.getQueue().add(i);
        }
        System.out.println(road.getName()+" Road Queue : "+road.getQueue().size());
    }
}
