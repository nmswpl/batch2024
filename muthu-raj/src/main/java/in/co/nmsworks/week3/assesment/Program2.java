package in.co.nmsworks.week3.assesment;

import java.util.Scanner;

/*
2) Given an array of integers, Write a Program to count and
print number of even elements in the array.

 */
public class Program2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size::");
//        int size = sc.nextInt();
//        Integer[] nums = new Integer[size];

//        for (int i = 0; i < size; i++) {
//
//            System.out.println("Enter Element " + i);
//            nums[i] = sc.nextInt();
//
//        }

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};

        int count = 0;

        for (Integer num : nums) {

            if(num % 2 == 0){
                count += 1;
                System.out.print(num + " ");
            }

        }
        System.out.println();

        System.out.println("The number of even numbers elements in the array is "+ count);

    }
}
