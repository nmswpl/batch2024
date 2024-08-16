package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Question6 {

    public Question6() {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] numbers = {2,56,12,34,89,342,1};

        list.addAll(Arrays.asList(numbers));
        list.remove(2);

        System.out.println(list + "\n");
    }
}
