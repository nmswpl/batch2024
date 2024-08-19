package in.co.nmsworks.weekend;
/* Write a program to print the square of every element present in the array.
E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25 */

public class Qn7 {
    public void squareOfElement(){
        int[] array = {2, 4, 3, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i] + " ");
        }
        System.out.println();
    }
}
