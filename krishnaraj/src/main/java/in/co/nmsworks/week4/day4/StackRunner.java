package in.co.nmsworks.week4.day4;

public class StackRunner {
    public static void main(String[] args) {
        StackList stackList = new StackList();
        System.out.println(stackList.push(1));
        stackList.push(2);
        stackList.push(3);
        System.out.println("Printing Stack ::");
        stackList.printStack();

        stackList.pop();
        System.out.println("After stack ::");
        stackList.printStack();

        System.out.println("size of an stack : ");
        System.out.println(stackList.size());

        StackArray stackArray = new StackArray();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);

        System.out.println("The array stack  :");
        stackArray.printStack();

        stackArray.pop();
        System.out.println("The array stack ");
        stackArray.printStack();
        System.out.println("The array size ");
        System.out.println(stackArray.size());
    }
}
