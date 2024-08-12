package in.co.nmsworks.week2;

/**
 * Write a program to print the square of every element present in the array.
 * E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25
 */

public class Te7 {
    int[] arr1;

    public void square(){
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]*arr1[i]+" ");

        }

    }
}
