package in.co.nmsworks.week4.day4;
import java.util.ArrayList;
import java.util.List;

public class StackList implements StackIntf
{

    List<Integer> nums = new ArrayList<>();


    @Override
    public void size() {
        int size = nums.size();
        System.out.println(size);
    }



    @Override
    public void push(int num) {

        nums.add(0,num);

    }

    @Override
    public void pop() {

        nums.remove(0);

    }

    @Override
    public void print() {

        System.out.println(nums);

    }

    public static void main(String[] args)

    {
        StackList stackList = new StackList();
        stackList.push(0);
        stackList.push(1);
        stackList.push(2);
        stackList.print();
        stackList.pop();
        stackList.print();
    }
}
