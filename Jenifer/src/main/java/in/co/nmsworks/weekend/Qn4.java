package in.co.nmsworks.weekend;
/* Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1 */

import java.util.Scanner;

public class Qn4 {
    public void printPosition(){
        int[] array = {7, 15, 41};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to search : ");
        int element = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                int position = i + 1;
                System.out.println(position);
            }
        }
    }
}
