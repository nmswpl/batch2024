package in.co.nmsworks.week5.day5;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TrafficSignal {
    Random rand = new Random();

    private int getRandomNumber() {
        return rand.nextInt(10) + 1;
    }

    public void addVehicle(List<Integer> vehicleList, String name) {
            while (true){
                int num = getRandomNumber();
                int length = vehicleList.size();
                for (int i = 1; i <= num; i++) {
                    vehicleList.add(i + length);
                }
                System.out.println(name +" : " +vehicleList);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    public void removeVehicle(){
        while (true){

        }
    }

    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        CopyOnWriteArrayList<Integer> northList = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> southList = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> eastList = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> westList = new CopyOnWriteArrayList<>();

        Runnable northTask = () -> trafficSignal.addVehicle(northList, "North");
        Runnable southTask = () -> trafficSignal.addVehicle(southList, "South");
        Runnable eastTask = () -> trafficSignal.addVehicle(eastList, "East");
        Runnable westTask = () -> trafficSignal.addVehicle(westList, "West");

        executorService.execute(northTask);
        executorService.execute(southTask);
        executorService.execute(eastTask);
        executorService.execute(westTask);

        executorService.shutdown();
    }
}
