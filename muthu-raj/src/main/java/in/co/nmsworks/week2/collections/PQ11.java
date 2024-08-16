package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/*
11. Write a Java program to join two array lists.
 */
public class PQ11 {
    public void joinArrayLists(){
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 =  new ArrayList<>();

        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);


        nums2.add(5);
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);

        System.out.println("ArrayList1 b4 joining:: "+nums1);

        nums1.addAll(nums2);

        System.out.println("ArrayList1 after joining:: "+nums1);

    }
}
