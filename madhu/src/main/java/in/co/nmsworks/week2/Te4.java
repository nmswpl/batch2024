package in.co.nmsworks.week2;
/* *Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1*/

import java.util.Scanner;

public class Te4 {
    public static void main(String[] args) {
        int[] arr = {7, 15, 41};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int num = scanner.nextInt();
        int position = findElementPosition(arr, num);
        System.out.println("Output: " + position);
    }
    public static int findElementPosition(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
