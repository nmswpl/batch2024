package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Question8 {
    public Question8(){
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] numbers = {2,56,12,34,89,342,1};
        list.addAll(Arrays.asList(numbers));
        System.out.println(list);

       ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
        System.out.println(list2);


    }
}
