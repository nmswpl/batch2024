package in.co.nmsworks.week2;

/**
 * Given an array of integers and int x, Write a Program to print no of occurance of x in
 * the array
 * For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
 */

public class TE18 {
    public void noOfOccurance(int[] arr,int element){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]== element){
                count = count + 1;
            }
        }
        System.out.println(" no of occurance : "+count);
    }
}
