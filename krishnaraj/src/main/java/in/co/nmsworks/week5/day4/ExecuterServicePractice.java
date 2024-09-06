package in.co.nmsworks.week5.day4;

import java.time.LocalDateTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServicePractice {
    public void executeTheThreads(int number) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task1 = () -> {
            int val = number;
            for (int i = 0; i < 5; i++) {
                System.err.println("Thread : 1 " + (val + 1)+" TIME : "+ LocalDateTime.now());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task2 = () -> {
            int val = number;
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread : 2 " + (val - 1)+" TIME : "+ LocalDateTime.now());
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task3 = () -> {
            int val = number;
            for (int i = 0; i < 5; i++) {
                System.out.println("\t\tThread : 3 " + (val * 2)+" TIME : " +LocalDateTime.now());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
    }

    public static void main(String[] args) {
        ExecuterServicePractice executerServicePractice = new ExecuterServicePractice();
        executerServicePractice.executeTheThreads(10);
    }
}
