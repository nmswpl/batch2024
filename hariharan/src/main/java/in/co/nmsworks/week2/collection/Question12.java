package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question12 {
    public Question12(Integer[] numbers, int index, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));

     list.set(index,value);
        System.out.println(list);

    }
}
