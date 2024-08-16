package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/*
10. Write a Java program to compare two array lists.
 */
public class PQ10 {

    public void compareArray() {
        System.out.println("Q10.");
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(5);
        nums1.add(4);
        nums1.add(3);
        nums1.add(2);
        nums1.add(1);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);

        if (nums1.equals(nums2)) {
            System.out.println("They are same!");
        }
        else {
            System.out.println("They are different");
        }

    }


}


