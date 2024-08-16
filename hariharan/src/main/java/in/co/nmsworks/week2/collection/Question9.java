package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question9 {
    public Question9() {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] numbers = {2,56,12,34,89,342,1};
        list.addAll(Arrays.asList(numbers));

        Collections.reverse(list);
        System.out.println(list);
    }
}
