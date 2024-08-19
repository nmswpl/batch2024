package in.co.nmsworks.weekend;
/*
Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1
 */

import java.util.Scanner;

public class Question4 {
    public void position(){
        int[] arr = {7, 15, 41};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element = ");
        int num = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) {
                System.out.println("The position of given element in an array : " + i);
                break;
            }
            else
            {
                System.out.println("-1");
                break;
                }
        }
    }
}
