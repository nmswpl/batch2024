package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class StackList implements Stack{


    List<Object> list = new ArrayList<>();

    public void push(Object object){
        list.add(object);
    }

    @Override
    public Object pop() {
        Object popedValue = list.remove(list.size()-1);
        return popedValue;
    }

    @Override
    public int getSize() {
     return list.size();
    }

    @Override
    public void printStack() {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
    }
}
