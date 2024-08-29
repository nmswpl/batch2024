package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main( String[] args ){
        StackITF stack=new MyStackList();
        stack.push(15);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.pop();
        System.out.println(stack.sizeOfStack());
        stack.printStack();
    }
}
