package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.List;

public class Pq11 {
    public void joinArray(){
        List<String> names1 = new ArrayList<>();
        names1.add("Sowmiya");
        System.out.println("Before joining");
        System.out.println(names1);


        List<String> names = new ArrayList<>();
        names.add("Priya");
        names.add("Mani");
        names.add("Priyanka");

        names1.addAll(names);
        System.out.println("After joining");
        System.out.println(names1);


    }

}
