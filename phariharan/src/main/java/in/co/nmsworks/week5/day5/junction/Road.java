package in.co.nmsworks.week5.day5.junction;


import java.util.concurrent.ConcurrentLinkedQueue;

public class Road {
    String name;
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();


    public Road(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConcurrentLinkedQueue<Integer> getQueue() {
        return queue;
    }

    public void setQueue(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }
}
