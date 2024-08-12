package in.co.nmsworks.week2;

/**
 * Write a program to print all even numbers between 601 and 700 in descending order.
 */

public class TE1 {
    public void evenNumbers(int starting,int ending){
        System.out.println("Even numbers between "+starting+" upto "+ending+" in descending order :");
        if (ending%2 != 0) {
            ending = ending - 1;
        }
        if (starting % 2 == 0){
            starting = starting+1;

            }

        for (int i = ending; i >= starting ; i=i-2) {
            System.out.println(i);
        }
    }
}
