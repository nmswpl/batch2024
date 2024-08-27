package in.co.nmsworks.week3.assesment.weekend1;
/* Write a method that reverses the elements of a `LinkedList<String>`
without using additional collections. The method should modify the original list in place.
 */

import java.util.LinkedList;
import java.util.List;

public class Question5 {
    public void reverseList(){
        List<String> names = new LinkedList<>();
        names.add("Jeni");
        names.add("Prema");
        names.add("Vaibhavi");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
