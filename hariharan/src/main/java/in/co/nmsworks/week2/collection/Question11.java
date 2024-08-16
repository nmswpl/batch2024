package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question11 {
    public Question11(Integer[] numbers, Integer[] numbers2) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(numbers2));

        list.addAll(list2);
        System.out.println(list);
    }
}
