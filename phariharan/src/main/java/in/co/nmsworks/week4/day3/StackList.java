package in.co.nmsworks.week4.day3;

import java.util.ArrayList;
import java.util.List;

public class StackList implements StackINTF{

    List<Integer> stackList = new ArrayList<>();


    @Override
    public boolean push(int number) {
        stackList.add(number);
        System.out.println(number+ " Pushed into stack");
        return true;
    }

    @Override
    public int pop() {
        System.out.println(stackList.get(stackList.size()-1)+" popped !!!");
        return stackList.remove(stackList.size()-1);
    }

    @Override
    public int size() {
        return stackList.size();
    }

    @Override
    public void print() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
}
