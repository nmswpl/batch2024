package in.co.nmsworks.week2;
//Given an array of integers, Write a Program to print number of odd elements.
//For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
//are odd.

public class Te12 {
    public void numOfOdd(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                count++;
            }

        }
        System.out.println("the number of odd in the array is "+count);
    }
}
