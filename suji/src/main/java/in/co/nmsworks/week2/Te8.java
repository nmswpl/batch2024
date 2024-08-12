package in.co.nmsworks.week2;

//Given a 3 digit number, write a program to print the hundred position value in words.
//E.g 1: Input : 542 Output : Five.
//E.g 2: Input : 777 Output : Seven

import  java.util.*;
public class Te8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = sc.nextInt();

        int q = 0;
        q = n / 100;
        //System.out.println(q);

        String[] a = {"One", "Two", "THree", "Four", "Five", "Six", "Seven", "Eight", "NIne"};
        for (int i = 1; i < 10; i++) {
            if (q == i) {
                System.out.println(q + " THe 100th positrion digit is  "+a[i-1]);
            }

        }
    }
}


