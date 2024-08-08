package in.co.nmsworks.week1;

import java.util.Scanner;
/**
 * Numeric Pattern 2:
 * 1 1 1 1 1 1 1
 * 2 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4
 * 5 5 5
 * 6 6
 * 7
 **/

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int k=1;
        for (int i =n; i >= 0; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print(k +" ");
            }
            k=k+1;
            System.out.println();
        }
    }
}
