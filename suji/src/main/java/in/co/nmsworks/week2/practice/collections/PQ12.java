package in.co.nmsworks.week2.practice.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PQ12 {
    public static void main(String[] args) {
        Set<String> colors=new HashSet<>();
        System.out.println("The values in the SEt");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Green");
        for (String i:colors)
        {
            System.out.println(i);
        }
    }
}
