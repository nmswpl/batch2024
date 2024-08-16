package in.co.nmsworks.week2;
/*
Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
 */

import java.util.Scanner;

public class Te16 {
    public static  int factorial(int number){

        if(number == 1){
            return  1;
        }

        return  (number * factorial(number-1));

    }
    public void recursion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        System.out.println(factorial(number) + "\n");
    }
}
