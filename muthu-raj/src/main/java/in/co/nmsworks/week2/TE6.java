package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE6 {

    public void printTables() {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (i * x));
        }
    }
}
