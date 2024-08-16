package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {
    public Question5(Integer[] numbers,int index, int value) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(numbers));

        list.set(index, value);

        System.out.println(list + "\n");
    }
}
