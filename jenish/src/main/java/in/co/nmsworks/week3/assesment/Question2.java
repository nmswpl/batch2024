package in.co.nmsworks.week3.assesment;

/*
Given an array of integers, Write a Program to count and print number of even elements in the array.
 */
public class Question2 {
    public void printEvenElements(int[] arr){
        int count = 0;
        for (int num : arr) {
            if(num % 2 == 0){
                System.out.println(num);
                count++;
            }
        }
        System.out.println("Count of even Elements is "+count);
    }
}
