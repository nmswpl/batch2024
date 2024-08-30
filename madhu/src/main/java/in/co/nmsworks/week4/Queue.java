package in.co.nmsworks.week4;

import java.util.ArrayList;
import java.util.List;

public class Queue implements StackInterface {
    List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(2);
        q.push(4);
        q.push(6);
        q.push(8);
        q.pop();
        q.size();
    }
    @Override
    public void push(int num) {
        list.add(num);
        System.out.println("Queue after push : " +list);
    }

    @Override
    public void pop() {
       list.remove(0);
        System.out.println(list);
    }

    @Override
    public void size() {
        System.out.println("Queue size : " +list.size());
    }
}
