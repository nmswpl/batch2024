package in.co.nmsworks.week5.day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MultiThreadExample {
    public static void main( String[] args ){
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.submit(new Task1(10));
        executorService.submit(new Task2(10));
        executorService.submit(new Task3(10));
        executorService.shutdown();
    }
}
