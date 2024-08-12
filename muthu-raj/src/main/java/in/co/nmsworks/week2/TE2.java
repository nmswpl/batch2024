package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE2 {

    public void printGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mark:: ");
        float mark = sc.nextFloat();

        if (mark > 90 && mark <= 100){
            System.out.println("S");
        }
        if (mark > 80 && mark <= 90) {
            System.out.println("A");
        }
        else if (mark > 70 && mark <= 80) {
            System.out.println("B");
        }
        else if (mark > 60 && mark <= 70) {
            System.out.println("C");
        }
        else if (mark > 50 && mark <= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}
