package in.co.nmsworks.week4.day4;

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

        QueList qlist = new QueList();
        qlist.enQueue(10);
        qlist.enQueue(20);
        qlist.enQueue(30);
        qlist.enQueue(40);
        System.out.println(qlist.size());
        qlist.print();
        qlist.deQueue();
        qlist.print();

    }
}
