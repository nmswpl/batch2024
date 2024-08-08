package in.co.nmsworks.week1;

import java.util.Scanner;

/*
4) Factorial Program in Java
 */
public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:: ");
        int num = sc.nextInt();
        int res = 1;
        for (int i = num; i >= 1; i--) {
            res *= i;
        }

        System.out.println(res);


    }
}
