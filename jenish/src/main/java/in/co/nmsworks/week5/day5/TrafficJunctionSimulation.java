package in.co.nmsworks.week5.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TrafficJunctionSimulation {
    public static void main(String[] args) {
        Road north = new Road("North");
        Road south = new Road("South");
        Road east = new Road("East");
        Road west = new Road("West");

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(north);
        executorService.execute(south);
        executorService.execute(east);
        executorService.execute(west);

        Road[] roads = {north, south, east, west};
        int currentRoadIndex = 0;

        while (true) {
            try {
                Road chosenRoad = roads[currentRoadIndex];
                chosenRoad.manageSignal();
                currentRoadIndex = (currentRoadIndex + 1) % roads.length;
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}