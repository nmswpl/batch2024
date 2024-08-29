package in.co.nmsworks.week4.day3;

public class StackArray implements StackINTF{

    int[] stack = new int[10];
    int index = -1;
    int nextindex = 0;

    @Override
    public boolean push(int number) {
        stack[nextindex] = number;
        nextindex++;
        index++;
        System.out.println(number+" pushed into stack");
        return true;
    }

    @Override
    public int pop() {
        int lastValue = stack[index];
        stack[index]=0;
        index--;
        System.out.println(lastValue + " popped !!!");
        return lastValue ;
    }

    @Override
    public int size() {
        return index+1;
    }

    @Override
    public void print() {
        for (int i =index; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
