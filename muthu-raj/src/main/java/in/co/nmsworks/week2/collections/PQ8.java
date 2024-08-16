package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;

/*
8. Write a Java program to copy one array list into another.
 */
public class PQ8 {
    public void sortArrayList() {

        System.out.println("Q8.");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        ArrayList<Integer> nums2 = new ArrayList<>();

        System.out.println("before copying::"+nums2);

        for (int i = 0; i < nums.size(); i++) {

            nums2.add(nums.get(i));

        }

        System.out.println("After copying::"+nums2);
    }
}
