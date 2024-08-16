package in.co.nmsworks.week2.collection;
/*
12. Write a Java program to create Set, add some colors (strings) and print out the collection.
 */
import java.util.Set;
import java.util.HashSet;
public class Pq12 {
    Set<String> color=new HashSet<>();
    public void setColor()
    {
        color.add("red");
        color.add("blue");
        color.add("white");

        System.out.println(color);

    }
}


