package in.co.nmsworks.week3.assesment.weekend1;
/* Write a method that takes a `List<Integer>` and returns a new list with the even numbers
removed and the remaining numbers sorted in ascending order.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public void remEvenNumList(){
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> oddNumberList = new ArrayList<>();
        for (Integer number : numberList) {
            if (number % 2 != 0){
                oddNumberList.add(number);
            }
        }
        System.out.println(oddNumberList);
    }
}
