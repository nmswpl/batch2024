package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public Question4(Integer[] numbers,int value) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(numbers));

        System.out.println(list.get(value));

    }
}
