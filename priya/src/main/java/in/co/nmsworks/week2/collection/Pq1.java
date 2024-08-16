package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;

public class Pq1 {
    public  void printColors() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Color are");
        for (int i = 0; i <colors.size() ; i++) {
            System.out.println(colors.get(i));
        }
    }
}
