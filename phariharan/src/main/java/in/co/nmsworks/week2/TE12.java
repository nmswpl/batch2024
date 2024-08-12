package in.co.nmsworks.week2;

/**
 *  Given an array of integers, Write a Program to print number of odd elements.
 * For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
 * are odd.
 */
public class TE12 {
    public void noOfOdd(int[] arr1){
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 != 0){
                count = count+1;
            }
        }
        System.out.println("the no of odd numbers in array1 : "+ count);
    }
}
