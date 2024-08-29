package in.co.nmsworks.week4.day4;

import java.util.Scanner;

public class StackArr implements Stack{
    Scanner sc = new Scanner(System.in);
    static final int MAX = 1000;
    int top;
    Object arr[] = new Object[MAX];

    boolean isEmpty()
    {
        return (top < 0);
    }
    StackArr()
    {
        top = -1;
    }
    @Override
    public void push(Object object) {

        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");

        }
        else {
            arr[++top] = object;
            System.out.println(object + " pushed into stack");

        }
    }

    @Override
    public Object pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            Object x = arr[top--];
            return x;
        }

    }

    @Override
    public int getSize() {
    return top+1;
    }

    @Override
    public void printStack() {


        for (int i = top; i > -1; i--) {
            System.out.print(" " + arr[i]);

        }
    }

}
