package in.co.nmsworks.weekend;
/*
Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.
 */

public class Q11 {
    int[] arr={32,43,4,15};
    int count=0;
    public void oddelements(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }System.out.println("odd elements = "+count);
    }
}
