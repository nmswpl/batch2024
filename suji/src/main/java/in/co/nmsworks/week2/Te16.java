package in.co.nmsworks.week2;
//Write a program using Recursion to find and print the factorial of a number.
//For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120


import java.util.*;

public class Te16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter n");
        n=sc.nextInt();
        int fact=1;
        for (int i = 1; i <=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("fact");

    }
}
