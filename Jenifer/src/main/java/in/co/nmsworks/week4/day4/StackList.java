package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class StackList implements StackInterface {
    List<Integer> numberList = new ArrayList<>();

    @Override
    public void push(int numberToAdd) {
        numberList.add(numberToAdd);
        //System.out.println("Added Successfully");
    }

    @Override
    public void pop() {
        numberList.remove(numberList.size() - 1);
        //System.out.println("Removed successfully");
    }

    @Override
    public void size() {
        System.out.println("Size of List : " + numberList.size());
    }

    @Override
    public void print() {
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.print(numberList.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        StackList stackList = new StackList();
        stackList.push(10);
        stackList.push(11);
        stackList.push(12);
        stackList.push(13);
        stackList.push(14);
        stackList.push(15);
        stackList.pop();
        stackList.size();
        stackList.print();
    }
}
