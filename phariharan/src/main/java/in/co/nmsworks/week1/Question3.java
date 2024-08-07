package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * ) Multiples of 7 Program in Java
 */
public class Question3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the number1 : ");
        int num1 = 7;
        for (int i = 1; i < 11 ; i++) {
            int ans = num1*i;
            System.out.println(num1+" x "+i+" = "+ans);
        }
    }
}
