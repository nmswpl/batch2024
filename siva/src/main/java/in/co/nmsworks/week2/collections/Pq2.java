package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2. Write a Java program to iterate through all elements in an array list.
 */

public class Pq2 {

    public void iterateAllElements(){
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (int i = 0; i <nums.size() ; i++) {

            System.out.println("Iterated Elements :: "+nums.get(i));

        }
        Set<Integer> nums1=new HashSet<>();
        nums1.add(6);
        nums1.add(7);
        nums1.add(8);
        nums1.add(9);
        nums1.add(10);

        for(Integer nums2:nums1){
            System.out.println(nums2);
        }
    }
}
