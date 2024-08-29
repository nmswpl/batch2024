package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class StackList extends MyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        List<Integer> listOfInteger = new ArrayList<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.size(listOfInteger);
        myStack.pop(listOfInteger);
    }
}
