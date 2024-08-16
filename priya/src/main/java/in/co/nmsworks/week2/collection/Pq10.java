package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.List;

public class Pq10 {
    public void compareArrayList(){
        List<String> names1 = new ArrayList<>();
        names1.add("Sowmiya");


        List<String> names = new ArrayList<>();
        names.add("Priya");
        names.add("Mani");
        names.add("Priyanka");

            if (names1.containsAll(names)){
                System.out.println("Two arrays are equal");
            }
            else{
                System.out.println("Not equal");
            }
        }
    }