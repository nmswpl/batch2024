package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
/**
 *  Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class Pq1 {
    public void arrayListIn() {
        List<String> colors = new ArrayList<>(5);
        colors.add("blue");
        colors.add("white");
        colors.add("red");
        colors.add("green");
        colors.add("black");
        for (int i = 0; i <colors.size() ; i++) {
            System.out.println(colors.get(i));
        }
    }
}
