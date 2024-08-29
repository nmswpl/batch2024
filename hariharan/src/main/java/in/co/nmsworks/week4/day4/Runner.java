package in.co.nmsworks.week4.day4;

public class Runner {
    public static void main(String[] args) {
        StackList stackList = new StackList();

        System.out.println("For ArrayList");
        stackList.push(5);
        stackList.push(10);
        stackList.push(20);

        stackList.printStack();
        System.out.println(stackList.pop());
        System.out.println(stackList.getSize());


        System.out.println("For Array:");
        StackArr stackArr = new StackArr();
        stackArr.push(10);
        stackArr.push(20);
        stackArr.push(30);

        stackArr.printStack();
        System.out.println("\n"+stackArr.pop());
        System.out.println("\n"+stackArr.pop());
        System.out.println(stackArr.getSize());

    }
}
