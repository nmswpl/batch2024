package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pq14 {
    public void testList(){
        List<Integer[]> array=new ArrayList<>();
        Integer[] intArray1=new Integer[3];
        Integer[] intArray2=new Integer[3];
        Integer[] intArray3=new Integer[3];
        Integer[] intArray4=new Integer[3];
        Integer[] intArray5=new Integer[3];

        array.add(intArray1);
        array.add(intArray2);
        array.add(intArray3);
        array.add(intArray4);
        array.add(intArray5);
        for(Integer[] i:array){
        System.out.println(Arrays.toString(i));

        }
    }
}
