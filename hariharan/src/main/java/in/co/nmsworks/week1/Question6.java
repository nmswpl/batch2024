package in.co.nmsworks.week1;

//Numerical pattern 1

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
