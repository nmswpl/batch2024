package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pq14 {
    public static void main(String[] args) {
        new Pq14().testList();

    }
    public void testList(){
        Integer[] arr1=new Integer[]{7,8,9};
        Integer[] arr2=new Integer[]{16,18,20};
        Integer[] arr3=new Integer[]{25,26,28};
        Integer[] arr4=new Integer[]{30,31,32};
        Integer[] arr5=new Integer[]{31,32,33};

        List<Integer[]> arrays=new ArrayList<>();
        arrays.add(arr1);
        arrays.add(arr2);
        arrays.add(arr3);
        arrays.add(arr4);
        arrays.add(arr5);
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println(Arrays.toString(arrays.get(i)));
            System.out.println(arrays.get(i).length);
        }




    }
}
