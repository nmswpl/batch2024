package in.co.nmsworks.week5.day5;

import in.co.nmsworks.week5.day4.ExecuterServicePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpractice {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ThreadEx1 threadEx1 = new ThreadEx1();
        ThreadEx2 threadEx2 = new ThreadEx2();
        executorService.execute(threadEx1);
        executorService.submit(threadEx2);
        executorService.shutdown();
    }
}
