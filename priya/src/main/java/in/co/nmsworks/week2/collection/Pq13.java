package in.co.nmsworks.week2.collection;
import java.util.HashSet;
import java.util.Set;
public class Pq13 {
    public void printSet(){
        Set<String>colorset = new HashSet<>();
        colorset.add("Pink");
        colorset.add("Green");
        colorset.add("Yellow");
        for (String s : colorset){
            System.out.println(s);
        }
    }
}
