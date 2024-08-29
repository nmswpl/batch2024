package in.co.nmsworks.week4;

import java.util.ArrayList;
import java.util.List;

public class ListStack implements Stack
{
    int n;
    List<Integer> list=new ArrayList<>();


    @Override
    public void push(int n)
    {
     list.add(0, n);
    }

    @Override
    public void pop()
    {
        list.remove(0);
    }

    @Override
    public void display()
    {
        for (Integer i : list)
        {
            System.out.println(i);
        }
    }


    public static void main(String[] args)
    {
        ListStack obj=new ListStack();
        obj.push(5);
        obj.push(7);
        obj.push(8);
        obj.pop();
        obj.display();
    }
}
