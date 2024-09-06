package in.co.nmsworks.week5;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding entries
        map.put("Alice", 30);
        map.put("Bob", 25);

        // Concurrently updating entries
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("Charlie", i);
            }
        };
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                map.remove("Charlie");
            }
        };

        // Create threads to perform concurrent updates
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task1);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the map
        System.out.println(map);
    }
}