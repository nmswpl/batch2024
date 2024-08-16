package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
public class Pq5 {
    public void updateValue(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        System.out.println();
        System.out.println("List before updation"+numbers);
        numbers.set(2,3);
        System.out.println("List after updation"+numbers);


    }
}
