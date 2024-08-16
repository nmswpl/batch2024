package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
public class Pq9 {
    public void reverseArray(){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("Before reversing");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i));
        }
        System.out.println();
        System.out.println("After reversing");
        for (int i = l1.size()-1; i >=0 ; i--) {
            System.out.print(l1.get(i));
        }
    }
}
