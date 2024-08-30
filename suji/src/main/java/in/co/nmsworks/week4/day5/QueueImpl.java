package in.co.nmsworks.week4.day5;

import java.util.ArrayList;
import java.util.List;

public class QueueImpl implements Comparable<Integer> {
    List<Integer> queue = new ArrayList<>();

    public void push (int num ){
        queue.add(num);
    }

    public int pop(){
        return queue.remove(0);
    }
    public void print(){
        System.out.println(queue);
    }

    public static void main(String[] args) {
        QueueImpl queue1 = new QueueImpl();
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        queue1.push(5);
        System.out.println("Queue:: ");
        queue1.print();
        System.out.println("After Pop Operation:: ");
        queue1.pop();
        queue1.print();
    }


    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
