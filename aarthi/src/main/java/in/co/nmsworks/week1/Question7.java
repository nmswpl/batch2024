package in.co.nmsworks.week1;
import java.util.Scanner;
/*
 *Numeric Pattern 2
 */

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++)
        {
            for (int j = i; j <= a; j++)
            {
                System.out.print(i);

            }
            System.out.println();
        }
    }
}


