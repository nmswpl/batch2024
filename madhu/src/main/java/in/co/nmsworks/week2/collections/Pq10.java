package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq10 {
    ArrayList<String> colors = new ArrayList<>();

    public void shuffleColors() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        System.out.println(colors);

        for(int i = colors.size() -1; i >= 0; i--){
            System.out.println(colors.get(i));
        }

    }
}
