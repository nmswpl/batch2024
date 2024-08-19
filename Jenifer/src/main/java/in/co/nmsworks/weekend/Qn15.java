package in.co.nmsworks.weekend;
/* Given an array of integers, Write a Program to count and print even elements.
For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
Reason : 2 4 & 6 are even */

public class Qn15 {
    public void printEvenEle(){
        int[] array = {2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Number of even elements are " + count);
    }
}
