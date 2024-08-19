package in.co.nmsworks.weekend;
/* Write a program to multiply two arrays of same size element-by-element.
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7 */

import java.util.Scanner;

public class Qn3 {
    public void arrayMultiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter array1 elements : ");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter array2 elements : ");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        /* System.out.println("Array1 elements : ");
        for (int arr1 : array1) {
            System.out.print(arr1 + " ");
        }

        System.out.println();
        System.out.println("Array2 elements : ");
        for (int arr2 : array2) {
            System.out.print(arr2 + " ");
        } */

        System.out.println();
        System.out.println("Array Multiplicatin : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] * array2[i] + " ");
        }
        System.out.println();
    }
}
