package in.co.nmsworks.week2;
/*Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime */

import java.util.Scanner;

public class Te20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n == 1) {
            System.out.println("NO");
            return;
        }
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
