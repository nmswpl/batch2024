package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
public class Pq8 {
    public void copyArray(){
     List<String> names = new ArrayList<>();
        names.add("Priya");
        names.add("Mani");
        names.add("Priyanka");
        System.out.println(names);
        List<String> names1 = new ArrayList<>(names);
        System.out.println(names1);



    }
}
