package in.co.nmsworks.week3.assesment.weekend1;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
    public void singleList() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            numbers.add(i);
        }

        List<Integer> numbers1 = new ArrayList<>();
        for (int i = 6; i <= 10; i++) {
            numbers1.add(i);
        }

        List<List<Integer>> numberList = new ArrayList<>();
        numberList.add(numbers);
        numberList.add(numbers1);

        List<Integer> resultList = new ArrayList<>();
        for (List<Integer> num : numberList) {
            for (Integer nums : num) {
                resultList.add(nums);
            }
        }
        System.out.println(resultList);
    }
}
