package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class QueList {


    List<Integer> stackList = new ArrayList<>();

    public void enQueue(int number) {
        stackList.add(number);
        System.out.println(number + " Pushed into queue");
    }

    public int deQueue() {
        System.out.println(stackList.get(0) + " removed !!!");
        return stackList.remove(0);
    }

    public int size() {
        return stackList.size();
    }

    public void print() {
//        for (Integer i : stackList) {
//            System.out.println(i);
//        }
        System.out.println(stackList);
    }
}

