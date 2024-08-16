package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pq14 {

    public static void main(String[] args) {
        new Pq14().testList();


    }

    public void testList(){
        Integer[] list1={7,8,9};
        Integer[] list2={16,18,20};
        Integer[] list3={25,26,28};
        Integer[] list4={30,31,32};
        Integer[] list5={31,31,32};
        List<Integer[]> lists=new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        lists.add(list5);
        lists.add(new Integer[]{33, 34, 35,54});
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i)));
            System.out.println(lists.get(i).length);



        }

    }
}
