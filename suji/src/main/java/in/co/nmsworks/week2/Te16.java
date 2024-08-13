package in.co.nmsworks.week2;
//Write a program using Recursion to find and print the factorial of a number.
//For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120


import java.util.*;

class Te16 {
    int n;
    public Te16(int n2) {
        n=n2;
        int fact=1;
        for (int i = 1; i <=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("fact "+fact);

    }
}
