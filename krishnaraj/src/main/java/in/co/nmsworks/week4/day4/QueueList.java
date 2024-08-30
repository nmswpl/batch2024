package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class QueueList implements QueueInterface{
    List<Integer> integerList = new ArrayList<>();
    @Override
    public boolean add(int num) {
        boolean value =integerList.add(num);
        return value;
    }

    @Override
    public void remove() {
        integerList.remove(0);
    }

    @Override
    public int size() {
        return integerList.size();
    }

    @Override
    public void printQueue() {
        System.out.println(integerList);
    }
}
