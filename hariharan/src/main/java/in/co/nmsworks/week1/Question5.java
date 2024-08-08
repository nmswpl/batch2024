package in.co.nmsworks.week1;

import java.util.Scanner;

// finding Largest among three numbers using if else

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number 1:");
        int x = sc.nextInt();

        System.out.println("Enter the Number 2:");
        int y = sc.nextInt();

        System.out.println("Enter the Number 3:");
        int z = sc.nextInt();

        if (x >= y && x >= z) {
            System.out.println("Largest Number:" + x);
        }
        else if (y >= z && y >= x) {
            System.out.println("Largest Number:" + y);
        }
        else{
            System.out.println("Largest Number:" + z);
        }
    }
}
