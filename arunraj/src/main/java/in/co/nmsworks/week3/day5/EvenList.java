package in.co.nmsworks.week3.day5;

/*Write a method that takes a `List<Integer>`
 and returns a new list with the even numbers
 removed and the remaining numbers sorted in ascending order.
*/

import java.util.ArrayList;
import java.util.List;

public class EvenList {
    public static void main(String[] args) {
        EvenList e = new EvenList();
        e.returnEvenList();
    }
    public void returnEvenList(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer even : numbers){
            if(even % 2 == 0){
                evenNumbers.add(even);
            }
        }
        for(Integer even : evenNumbers){
            System.out.println(even);
        }
    }
}
