package in.co.nmsworks.week1;
import java.util.Scanner;

/**
 * Factorial program
 */
public class Question4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = s.nextInt();

        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of " + " " +a+ " is" + " " + fact);
    }
}
