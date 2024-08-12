package in.co.nmsworks.week2;

/**
 * 2. Given an array of integers, Write a Program to print number of odd elements.
 * For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
 * are odd.
 */

public class Te12 {
    int[] arr;

    public void oddElements(){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1)

                System.out.println(arr[i]);

        }
    }
}
