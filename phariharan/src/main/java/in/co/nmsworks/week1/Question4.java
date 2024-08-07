package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Factorial Program in Java
 */

public class Question4 {
    public static void main(String[] args) {
        int i,answer = 1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number1 : ");
        i = sc.nextInt();
        while (i>0){
            answer = answer*i;
            i--;
        }
        System.out.println("Answer is : "+answer);
    }
}
