package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pq2{
    public void printCollections(){
        List<String> list = new ArrayList<>();
        list.add("Priya");
        list.add("Mani");
        list.add("Suji");
        System.out.println("The elements of list are");
        for (int i = 0; i <list.size() ; i++) {

            System.out.println(list.get(i));
        }
        System.out.println();

        Set<Integer> set = new HashSet<>(10);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("The elements of set are:");
        for (Integer i : set) {
            System.out.println(i);
        }


    }
}
