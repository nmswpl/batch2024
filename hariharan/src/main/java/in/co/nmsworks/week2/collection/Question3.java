package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public Question3(int value, int value2){
        List<Integer> list = new ArrayList<>();
        Integer arr[] = {1,2,3,46,7};
        list.addAll(Arrays.asList(arr));


        System.out.println("Before Insertion::" + list);
        list.add(0,value);
        System.out.println("After Insertion::" + list );

        System.out.println("Before set::" + list );
        list.set(0,value2);
        System.out.println("After set::" +list+"\n");



    }
}
