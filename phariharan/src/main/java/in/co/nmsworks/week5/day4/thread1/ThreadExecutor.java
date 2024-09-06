package in.co.nmsworks.week5.day4.thread1;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        int number = 10;
        executorService.execute(new Task1(number));
        executorService.execute(new Task2(number));
        executorService.execute(new Task3(number));
        executorService.shutdown();
    }
}

class Task3 implements Runnable {
    private int number;

    public Task3(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            while (true){
                number = number * 2;
                System.out.println("Thread 3 : \t\t\t" + number+"\t"+LocalDateTime.now());
                Thread.sleep(10000);
//                System.out.println(LocalDateTime.now());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Task1 implements Runnable {
    private int number;

    public Task1(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            while (true) {
                number = number + 1;
                System.out.println("Thread 1 : \t" + number+"\t"+LocalDateTime.now());
//                System.out.println(LocalDateTime.now());
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Task2 implements Runnable {
    private int number;

    public Task2(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            while (true) {
                number = number - 1;
                System.out.println("Thread 2 : \t\t" + (number)+"\t"+LocalDateTime.now());
//                System.out.println(LocalDateTime.now());
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

