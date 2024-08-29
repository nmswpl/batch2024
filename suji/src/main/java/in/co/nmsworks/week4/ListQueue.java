package in.co.nmsworks.week4;

import java.util.ArrayList;
import java.util.List;

public class ListQueue implements Queue
{
    List<Integer> listQ=new ArrayList<>();

    @Override
    public void addElement(int n)
    {
     listQ.add(listQ.size(), n);
    }

    @Override
    public void deleteElement()
    {
listQ.remove(0);
    }

    @Override
    public void display()
    {
        for (Integer i : listQ)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ListQueue ob=new ListQueue();
        ob.addElement(8);
        ob.addElement(98);
        ob.addElement(23);
        ob.deleteElement();
        ob.display();
    }
}
