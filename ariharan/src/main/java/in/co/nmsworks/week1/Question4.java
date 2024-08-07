package in.co.nmsworks.week1;

import java.util.Scanner;

/**
        * factorial
 **/
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int fac=1;
        for (int i = 1; i <=n; i++)
        {
            fac=fac*i;
        }
        System.out.println("factorial of " + n + " is " + fac);

    }
}
