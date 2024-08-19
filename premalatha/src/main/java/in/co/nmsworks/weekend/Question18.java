package in.co.nmsworks.weekend;
/*
Given an array of integers and int x, Write a Program to print no of occurance of x in
the array
For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
times in array
 */

public class Question18 {
    public void occurance(){
        int[] arr = {1, 2, 3, 2, 2, 3};
        int count=0;
        int x=2;
        for (int i = 0; i < arr.length; i++) {
            if(x==arr[i])
                count++;
        }
        System.out.println("Occurance : "+ count);
    }
}
