package in.co.nmsworks.week4.day4;

public class StackArray implements StackInterface{
    int[] integerArray = new int[100];
    int counter = 0;

    @Override
    public Boolean push(Integer num) {
        integerArray[counter] = num;
        counter +=1;
        return true;
    }

    @Override
    public Boolean pop() {
        integerArray[counter]=0;
        counter--;
        return true;
    }

    @Override
    public Integer size() {
        return counter;
    }

    @Override
    public void printStack() {
        for (int i = counter-1; i >= 0;i--) {
            System.out.println(integerArray[i]);
        }
    }
}
