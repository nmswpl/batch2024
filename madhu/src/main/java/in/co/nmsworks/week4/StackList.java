package in.co.nmsworks.week4;

import java.util.ArrayList;
import java.util.List;

public class StackList implements StackInterface {
    List<Integer> stack = new ArrayList<>();
    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push(1);
        sl.push(4);
        sl.push(5);
        sl.pop();
        sl.size();
    }
    @Override
    public void push(int num) {
        stack.add(num);
        System.out.println("Stack after push : " + stack);
    }

    @Override
    public void pop() {
    stack.remove(stack.size()-1);
        System.out.println("Stack after pop" +stack);

    }

    @Override
    public void size() {
        System.out.println("the size of the stack is: " +stack.size());
    }
}
