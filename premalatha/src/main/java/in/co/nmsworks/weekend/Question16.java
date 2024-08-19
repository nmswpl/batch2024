package in.co.nmsworks.weekend;
/*
Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
 */

import java.util.Scanner;

public class Question16 {
    public void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = scan.nextInt();
        int i, x =1;

        for (i = a; i >= 1; i--) {

            x = i * x;
        }
        System.out.println(x);



    }
}
