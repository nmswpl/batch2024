package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

interface StackINTF {
    void push(int n);
    int pop();
    int stackSize();
    void printStack();
}

class ListStack implements StackINTF
{
    List<Integer> stack = new ArrayList<>();

    public void push(int n)
    {
        stack.add(n);
    }

    public int pop()
    {
        return stack.remove(stackSize() - 1);
    }

    public int stackSize()
    {
        return stack.size();
    }

    public void printStack()
    {
        System.out.println("The elements of stack(List) are ");
        for (int i = 0; i < stackSize(); i++) {
            System.out.println(stack.get((stack.size()-1) - i) + " ");
        }
        System.out.println();
    }
}

class ArrayStack implements StackINTF
{
    int index = 0;
    int size;
    int[] stack;
    ArrayStack(int size)
    {
        this.size = size;
        stack = new int[size];
    }

    public void push(int n)
    {
        if(index > (size - 1))
        {
            System.out.println("Cannot push more than " + size + "elements");
            return;
        }
        stack[index] = n;
        index++;
    }

    public int pop()
    {

        if(index < 1)
        {
            System.out.println("The list is empty!");
            return -1;
        }

        int[] temp = stack;
        stack = new int[size];
        for (int i = 0; i < index - 1; i++) {
            stack[i] = temp[i];
        }
        index--;
        return temp[stackSize()-1];

    }

    public int stackSize()
    {
        return stack.length;
    }

    public void printStack()
    {
        System.out.println("The elements of stack(Array) are ");
        for (int i = stackSize() - 1; i >= 0 ; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class Stack
{
    public static void main(String[] args) {
        StackINTF listStack =  new ArrayStack(5);
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);

        listStack.printStack();

        listStack.pop();
        listStack.pop();
        listStack.pop();
        listStack.printStack();

        listStack.push(6);
        listStack.push(7);
        listStack.pop();

        listStack.printStack();
    }
}



