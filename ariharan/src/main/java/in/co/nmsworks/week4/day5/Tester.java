package in.co.nmsworks.week4.day5;

import java.util.concurrent.Callable;

public class Tester{
    public static void main(String[] args) {
        QueueInList<Integer> queueList=new QueueInList<>();
        queueList.enqueue(21);
        queueList.enqueue(60);
        queueList.enqueue(40);
        queueList.enqueue(10);
        queueList.print();
        System.out.println(queueList.dequeue());
        System.out.println();
        queueList.print();
        queueList.size();
    }
}