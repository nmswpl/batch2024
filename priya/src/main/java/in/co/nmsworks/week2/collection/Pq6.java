package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.List;

public class Pq6 {
    public void removeElement(){
        List<Integer>  li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println("List before deletion"+li);
        li.remove(2);
        System.out.println("List after deletion"+li);
    }
}
