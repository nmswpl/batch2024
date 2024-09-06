package in.co.nmsworks.week5.day5;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TrafficSimulater {
    private static final Random random = new Random();
    private static final Map<String, AtomicInteger> vehicles = new HashMap<>();
    private static final Queue<String> passedVehicles = new LinkedList<>();
    private static final AtomicInteger totalVehicles = new AtomicInteger(0);
    private static final List<String> directions = Arrays.asList("North", "South", "East", "West");

    public static void main(String[] args) {

        for (String direction : directions) {
            vehicles.put(direction, new AtomicInteger(0));
        }


        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

        scheduler.scheduleAtFixedRate(() -> addVehicles(), 0, 5, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(() -> processVehicles(getCurrentSignalDirection()), 0, 10, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(() -> checkSignalClearStatus(), 0, 5, TimeUnit.SECONDS);
    }

    private static void addVehicles() {
        for (String direction : directions) {
            int newVehicles = random.nextInt(10) + 1;
            vehicles.get(direction).addAndGet(newVehicles);
            totalVehicles.addAndGet(newVehicles);
        }
        System.out.println("Updated vehicle counts: " + getVehicleCounts() +" "+java.time.LocalTime.now());
    }


    private static void processVehicles(String signalDirection) {
        System.out.println("Processing vehicles for direction: " + signalDirection);
        AtomicInteger count = vehicles.get(signalDirection);
        while (count.get() > 0) {
            String vehicleId = signalDirection + "_" + random.nextInt(9000 + 1000);
            passedVehicles.offer(vehicleId);
            count.decrementAndGet();
        }
        System.out.println("Vehicles passed: " + passedVehicles  +" "+java.time.LocalTime.now());
    }


    private static void checkSignalClearStatus() {
        int passedCount = passedVehicles.size();
        int total = totalVehicles.get();

        if (total == 0) return;

        if (passedCount >= 0.25 * total) {
            System.out.println("25% of vehicles have cleared the signal.");
        }

        if (passedCount >= 0.50 * total) {
            System.out.println("50% of vehicles have cleared the signal.");
        }

        if (passedCount > 0.50 * total) {
            int toRemove = (int) (0.50 * passedCount);
            for (int i = 0; i < toRemove && !passedVehicles.isEmpty(); i++) {
                passedVehicles.poll();
            }
            System.out.println("Removed 50% of passed vehicles. Remaining: " + passedVehicles+" "+java.time.LocalTime.now());
        }
    }


    private static String getCurrentSignalDirection() {
        return directions.get(random.nextInt(directions.size()));

    }


    private static Map<String, Integer> getVehicleCounts() {
        Map<String, Integer> counts = new HashMap<>();
        for (String direction : directions) {
            counts.put(direction, vehicles.get(direction).get());
        }
        return counts;
    }
}
