package in.co.nmsworks.weekend;
/* Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20 */

public class Qn17 {
    public void largestElement(){
        int[] array = {12, 3, 20, 14};
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > element){
                element = array[i];
            }
        }
        System.out.println("Largest element in the array is " + element);
    }
}
