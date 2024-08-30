package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class QueueList<T> implements Queue<T>{

    private final List<T> queueList = new ArrayList<T>();
    @Override
    public void enqueue(T element) {
        queueList.add(element);
        System.out.println(element + " is Added to queue");
    }


    @Override
    public T dequue() {

        return queueList.remove(0);
    }

    @Override
    public void printQueue() {
        for (Object element : queueList) {
            System.out.println(element);
        }
    }

    @Override
    public int getQueueSize() {
        return queueList.size();


    }
}
