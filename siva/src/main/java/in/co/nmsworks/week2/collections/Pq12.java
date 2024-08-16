package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pq12 {

    public void createSet(){
        Set<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        for (String colors1:colors){
            System.out.println(colors1);
        }
    }

}
