package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
7. Write a Java program to search for an element in an array list.
 */
public class PQ7 {
    public void searchElement() {
        System.out.println("Q7.");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("enter the element to be searched::");
        int ele = sc.nextInt();
        int pos = nums.indexOf(ele);

        if (pos == -1) {
            System.out.println("The element is not in the list");
            return;
        }
        System.out.println("The element is present at pos:: " + pos);


    }
}
