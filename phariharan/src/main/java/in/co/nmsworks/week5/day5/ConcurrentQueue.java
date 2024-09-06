package in.co.nmsworks.week5.day5;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentQueue {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new AddToQueue(3, queue));
        executorService.execute(new RemoveFromQueue(queue));

        executorService.shutdown();
    }
}

class AddToQueue implements Runnable {
    int num;
    ConcurrentLinkedQueue<Integer> queue;

    public AddToQueue(int num, ConcurrentLinkedQueue<Integer> queue) {
        this.num = num;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                queue.add(num++);
                System.out.println("Element Inserted: " + (num-1));
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class RemoveFromQueue implements Runnable {
    ConcurrentLinkedQueue<Integer> queue;

    public RemoveFromQueue(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("New Queue: " + queue);
                Integer removedElement = queue.poll(); // returns null if the queue is empty
                System.out.println("Removed Element: " + removedElement);
                System.out.println("New Queue: " + queue);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
