package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/*
3. Write a Java program to insert an element into the array list at the first position.
 */
public class PQ3 {

    public  void insertAtFirst(){
        System.out.println("Q3.");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println("Before inserting::"+nums);
//inserting at index 0

        nums.add(0,5);

        System.out.println("After inserting at index 0::"+ nums);




     }

    public void insertUsingSet() {
        System.out.println("Q14.");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println("before inserting::" + nums);

        nums.set(0, 14);

        System.out.println("After inserting at pos first index::" + nums);

    }

}
