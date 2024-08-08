package in.co.nmsworks.week1;

import java.util.Scanner;
/**
 * multiplication
 **/

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for (int i = 0; i <11 ; i++) {
            System.out.println(n + "x" + i + " ="+ n*i);
        }

        }
}
