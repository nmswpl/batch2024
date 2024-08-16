package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question14 {
    public void testList(){
        List<Integer[]> averageQuestionsList = new ArrayList<>();
        Integer[] arr1 = {7,8,9};
        Integer[] arr2 = {16,18,20};
        Integer[] arr3 = {25,26,28};
        Integer[] arr4 = {30,31,32};
        Integer[] arr5 = {31,31,32};
        averageQuestionsList.add(arr1);
        averageQuestionsList.add(arr2);
        averageQuestionsList.add(arr3);
        averageQuestionsList.add(arr4);
        averageQuestionsList.add(arr5);
        for (Integer[] integers : averageQuestionsList) {
            System.out.println(Arrays.toString(integers));
        }
        for (int i = 0; i < averageQuestionsList.size(); i++) {
            System.out.println(Arrays.toString(averageQuestionsList.get(i)));
        }
    }
    public static void main(String[] args) {
        Question14 q14 = new Question14();
        q14.testList();
    }
}
