package in.co.nmsworks.week2.collection;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Question1 {

     public Question1(String[] colorNames){

        List<String> colors = new ArrayList<>();



        colors.addAll(Arrays.asList(colorNames));

         for (int i = 0; i < colors.size(); i++) {
             System.out.println(colors.get(i));
         }

         System.out.println("\n");


    }


}
