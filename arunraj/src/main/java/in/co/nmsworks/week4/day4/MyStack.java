package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class MyStack implements StackIntf {

    @Override
    public void push(int n) {
        List<Integer> listOfInt = new ArrayList<>();
        listOfInt.add(n);
        print(listOfInt);
    }

    @Override
    public void pop(List<Integer> listOfInt) {
        listOfInt.remove(listOfInt.size()-1);
        print(listOfInt);
    }

    @Override
    public void size(List<Integer> listOfInt) {
        System.out.println("Size : "+listOfInt.size());
    }

    @Override
    public void print(List<Integer> listOfInt) {
        for(Integer i : listOfInt){
            System.out.println(i);
        }
    }
}
