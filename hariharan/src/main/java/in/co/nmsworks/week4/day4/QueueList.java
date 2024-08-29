package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class QueueList implements Queue{

    private List<Object> queueList = new ArrayList<Object>();
    @Override
    public void enqueue(Object object) {
        queueList.add(object);
        System.out.println(object + " is Added to queue");
    }

    @Override
    public Object dequue() {

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
