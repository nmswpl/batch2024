package in.co.nmsworks.week5.day5;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Road implements Runnable {
    private String name;
    private AtomicInteger vehicleCount;
    private CopyOnWriteArrayList<Integer> passedVehicles;
    private Random random;

    public Road(String name) {
        this.name = name;
        this.vehicleCount = new AtomicInteger(0);
        this.passedVehicles = new CopyOnWriteArrayList<>();
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public CopyOnWriteArrayList<Integer> getPassedVehicles() {
        return passedVehicles;
    }

    public int getVehicleCount() {
        return vehicleCount.get();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                int count = random.nextInt(10) + 1;
                addVehicles(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addVehicles(int count) {
        vehicleCount.addAndGet(count);
        System.out.println(name + " road: " + vehicleCount.get() + " vehicles");
    }

    public void manageSignal() {
        int totalVehicles = vehicleCount.get();

        if (totalVehicles > 0) {
            int noOfVehiclesToPass;

            if (totalVehicles <= 25) {
                noOfVehiclesToPass = (int) Math.ceil(totalVehicles * 0.25);
            } else if (totalVehicles <= 50) {
                noOfVehiclesToPass = (int) Math.ceil(totalVehicles * 0.25);
            } else {
                noOfVehiclesToPass = (int) Math.ceil(totalVehicles * 0.50);
            }

            System.out.println("Signal is green for " + name + " road: Allowing " + noOfVehiclesToPass + " vehicles to pass.");

            for (int i = 0; i < noOfVehiclesToPass; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                passedVehicles.add(1);
                vehicleCount.decrementAndGet();
            }

            System.out.println(name + " road: Vehicles passed. Remaining: " + vehicleCount.get());
        }
    }
}