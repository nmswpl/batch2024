package in.co.nmsworks.week4.day4;

public class StackArray implements Stack {
    private Integer[] stackArray;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        this.stackArray = new Integer[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        stackArray[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        int item = stackArray[top];
        stackArray[top--] = null;
        return item;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       StackArray stack = new StackArray(10);

        stack.push(4);
        stack.push(5);
        stack.push(3);
        stack.push(6);

        System.out.println("Stack after pushes:");
        stack.printStack();

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop:");
        stack.printStack();

        System.out.println("Peek element: " + stack.peek());

        System.out.println("Stack Capacity: "+ stack.size());
    }
}