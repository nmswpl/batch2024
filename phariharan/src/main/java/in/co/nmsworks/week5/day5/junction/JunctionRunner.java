package in.co.nmsworks.week5.day5.junction;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JunctionRunner {
    public static void main(String[] args) {

        Road north = new Road("North");
        Road south = new Road("South");
        Road east = new Road("East");
        Road west = new Road("West");


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new AddVehicles(north,south,east,west));
        executorService.execute(new RemoveVehicle(north,south,east,west));
        executorService.shutdown();
    }
}
