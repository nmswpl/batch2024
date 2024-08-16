package in.co.nmsworks.week2;
/*
Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15}
Output : Odd elements = 2 Reason : 43 & 15
are odd.
 */

public class Question12
{
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            } System.out.println("Number of odd elements: " + count);
        }
}
