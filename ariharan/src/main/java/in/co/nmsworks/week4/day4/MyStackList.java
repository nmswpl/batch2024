package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class MyStackList implements StackITF{
    private final List<Integer> list;

    public MyStackList(){
            list=new ArrayList<>();
    }

    @Override
    public boolean push( int value ){
        list.add(value);
        return true;
    }

    @Override
    public boolean pop(){
        list.remove(list.size()-1);
        return true;
    }

    @Override
    public Integer sizeOfStack( ){
        return (list.size());
    }

    @Override
    public void printStack( ){
        for (int i =list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+"\t");
        }
    }
}
