package in.co.nmsworks.week2;

//Write a program to print the position of given element in an array. If not present, print -1
//E.g : Input : arr = {7, 15, 41}
//Search Element : 41 Output : 2;
//Search Element : 5 Output : -1

import java.util.*;
public class Te4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {7, 15, 41};
        int n;
        System.out.println("Enter n");
        n = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            if (a[i] == n) {
                System.out.println("The position of given element  " + n + "  in an array  " + i);
                break;
            } else if (a[i]!=n)
            {
                System.out.println(" -1");
                break;
            }

        }
    }
}

