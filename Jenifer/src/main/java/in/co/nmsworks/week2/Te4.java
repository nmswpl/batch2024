package in.co.nmsworks.week2;
/* Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1 */

import java.util.Scanner;

public class Te4 {
    public void printPos(){
        int[] arr = {1,2,3,4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index to search : ");
        int index = scanner.nextInt();
        System.out.println("The searched number is " + arr[index]);
    }
}
