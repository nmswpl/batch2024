package in.co.nmsworks.week1;

// program to compute factorial

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int sum = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int x = sc.nextInt();

        for(int i = x; i > 0; i--) {
            sum *= i;
        }

        System.out.println(sum);

    }
}
