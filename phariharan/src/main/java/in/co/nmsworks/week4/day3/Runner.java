package in.co.nmsworks.week4.day3;

public class Runner {
    public static void main(String[] args) {
        StackINTF stackArray = new StackArray();
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);
        System.out.println("Size of a stack : "+stackArray.size());
        stackArray.pop();
        System.out.println("\n");
        stackArray.print();

        System.out.println("\n\n");

        StackINTF stackList = new StackList();
        stackList.push(10);
        stackList.push(20);
        stackList.push(30);
        stackList.push(40);
        System.out.println("Size of a stack : "+stackList.size());
        stackList.pop();
        System.out.println("\n");
        stackList.print();

    }
}
