package in.co.nmsworks.week1;

import java.util.Scanner;

// Program to multiply two Floating Numbers

public class Question2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number 1:");
        float x = sc.nextFloat();

        System.out.println("Enter Number 2:");
        float y = sc.nextFloat();

        System.out.println("Answer:" + x *y);
    }
}
