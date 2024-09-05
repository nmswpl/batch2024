package in.co.nmsworks.week5.day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 implements Runnable{
    private int num;

    public Task1(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                num = num + 1;
                System.out.println("Task 1 : " + num);
                Thread.sleep(5000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {
            executorService.execute(new Task1(10));
            executorService.execute(new Task2(10));
            executorService.execute(new Task3(10));
            Thread.sleep(60000);
            executorService.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Task2 implements Runnable {
    private int num;

    public Task2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try{
            while (!Thread.currentThread().isInterrupted()){
                num = num - 1;
                System.out.println("Task 2 : "+num);
                Thread.sleep(6000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Task3 implements Runnable {
    private int num;

    public Task3(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try{
            while (!Thread.currentThread().isInterrupted()){
                num = num * 2;
                System.out.println("Task 3 : "+num);
                Thread.sleep(10000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}