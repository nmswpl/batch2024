package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq7 {
    ArrayList<String> colors = new ArrayList<>();

    public void searchColors() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        boolean pink = colors.contains("pink");
        System.out.println(pink);
    }
}
