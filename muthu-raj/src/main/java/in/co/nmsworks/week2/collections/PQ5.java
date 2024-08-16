package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
5. Write a Java program to update an array element by the given element.
 */
public class PQ5 {

    public void updateArray(){
        System.out.println("Q5.");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);


        System.out.println(nums);
        System.out.println("How many elements do you want add?");
        int limit  = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.println("Enter a number to add::");
            nums.add(sc.nextInt());
            System.out.println("element added!");
        }

        System.out.println(nums);
    }

}
