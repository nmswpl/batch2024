package in.co.nmsworks.week4.day4;

import java.util.ArrayList;

public class QueueUsingList {
    private ArrayList<Integer> list;

    public QueueUsingList() {
        this.list = new ArrayList<>();
    }

    public void push(int item) {
        list.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return list.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void printStack() {
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingList queueUsingList = new QueueUsingList();
        queueUsingList.push(1);
        queueUsingList.push(2);
        queueUsingList.push(3);

        System.out.println("Stack after pushes:");
        queueUsingList.printStack();

        System.out.println("Popped element: " + queueUsingList.pop());

        System.out.println("Stack after pop:");
        queueUsingList.printStack();

        System.out.println("Peek element: " + queueUsingList.peek());

        System.out.println("Stack Size: "+ queueUsingList.size());
    }
}