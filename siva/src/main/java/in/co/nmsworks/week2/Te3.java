package in.co.nmsworks.week2;

/**
 * rite a program to multiply two arrays of same size element-by-element.
 * E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
 */

public class Te3 {
    int[] arr1;
    int[] arr2;

    public void mulTwoArr(){
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]*arr2[i]+" ");

        }
    }
}
