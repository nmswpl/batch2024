package in.co.nmsworks.week4.day4;

import in.co.nmsworks.week4.day2.Bank;

import java.util.ArrayList;
import java.util.List;

public class StackList implements StackInterface{
    List<Integer> integerList = new ArrayList<>();
    @Override
    public Boolean push(Integer num) {
        integerList.add(num);
        return true;
    }

    @Override
    public Boolean pop() {
        int last = integerList.size()-1;
        integerList.remove(last);
        return true;
    }

    @Override
    public Integer size() {
        Integer size = integerList.size();
        return size;
    }

    @Override
    public void printStack() {
        for (int i = integerList.size()-1; i >= 0 ; i--) {
            System.out.println(integerList.get(i));
        }
    }
}
