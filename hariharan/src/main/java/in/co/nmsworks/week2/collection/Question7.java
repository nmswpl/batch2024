package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question7 {
    public Question7(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] numbers = {2,56,12,34,89,342,1};

        list.addAll(Arrays.asList(numbers));

        System.out.println(list.indexOf(value));

    }
}
