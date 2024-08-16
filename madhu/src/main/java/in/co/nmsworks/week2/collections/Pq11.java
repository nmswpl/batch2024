package in.co.nmsworks.week2.collections;


import java.util.ArrayList;

public class Pq11 {
    ArrayList<String> colors = new ArrayList<>();
    ArrayList<String> colors1 = new ArrayList<>();



    public void addingArrays() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        System.out.println(colors);
        colors1.add("orange");
        colors1.add("white");
        colors1.add("gold");
        colors.addAll(colors1);
        System.out.println(colors);

    }
}
