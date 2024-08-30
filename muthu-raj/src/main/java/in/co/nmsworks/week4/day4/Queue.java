package in.co.nmsworks.week4.day4;


import java.util.ArrayList;
import java.util.List;

interface QueueINTF
{
    void enqueue(String str);
    String dequeue();
    String peek();
    int getSize();
    void printAll();
}

class QueueUsingList implements QueueINTF
{
    List<String> queue = new ArrayList<>();

    @Override
    public void enqueue(String str)
    {
        queue.add(queue.size(), str);
    }

    @Override
    public String dequeue()
    {
        return queue.remove(0);
    }

    @Override
    public String peek()
    {
        return queue.get(0);
    }


    @Override
    public int getSize()
    {
        return queue.size();
    }

    @Override
    public void printAll()
    {
        System.out.println("The elements of queue are :: ");
        for (String s : queue) {
            s = s == null? "*" : s;
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

class QueueUsingArray implements QueueINTF
{
    int index;
    int size;
    String[] queue;
    QueueUsingArray(int size) {
        this.size = size;
        queue = new String[size];
    }

    @Override
    public void enqueue(String str)
    {
        if(index > getSize())
        {
            System.out.println("You can't enqueue more than " + size + " elements");
            return;
        }
        queue[index++] = str;
    }

    @Override
    public String dequeue()
    {
        if(index == getSize())
        {
            System.out.println("You can't dequeue more than " + size + " elements");
            return "";
        }
        int len = getSize() - 1;
        String dequeuedEle = queue[0];
        for (int i = 0; i < len; i++) {
            queue[i] = queue[i+1];
        }
        queue[len] = null;
        return dequeuedEle;
    }

    @Override
    public String peek()
    {
        return queue[0];
    }


    @Override
    public int getSize()
    {
        return queue.length;
    }

    @Override
    public void printAll()
    {
        System.out.println("The elements of queue are :: ");
        for (String s : queue) {
            s = s == null? "*" : s;
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {

        QueueINTF q = new QueueUsingArray(6);
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        q.enqueue("four");
        q.enqueue("five");
        q.enqueue("six");

        q.printAll();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.printAll();
    }
}
