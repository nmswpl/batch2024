package in.co.nmsworks.week4.day4;

import java.util.ArrayList;

public class StackList implements Stack{
        private ArrayList<Integer> list;

        public StackList() {
            this.list = new ArrayList<>();
        }

        public void push(int item) {
            list.add(0, item);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
            }
            return list.removeFirst();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
            }
            return list.getLast();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int size() {
            return list.size();
        }

        public void printStack() {
            for (int item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
           StackList stack = new StackList();
            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println("Stack after pushes:");
            stack.printStack();

            System.out.println("Popped element: " + stack.pop());

            System.out.println("Stack after pop:");
            stack.printStack();

            System.out.println("Peek element: " + stack.peek());

            System.out.println("Stack Size: "+ stack.size());
        }
}