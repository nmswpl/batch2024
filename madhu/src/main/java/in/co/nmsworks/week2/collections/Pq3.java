package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq3
{
    ArrayList<String> colors = new ArrayList<>();
    public void insertingColors(){
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        System.out.println("Before inserting" + colors);
        colors.add(0,"purple");
        System.out.println("After inserting" + colors);


    }

}
