package in.co.nmsworks.week1;
import java.util.Scanner;

/**
 * Factorial Write a program to Find Largest Among Three numbers using
 * if..else statement
 */

public class Question5 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Num for a :");
        int a= scanner.nextInt();
        System.out.println("Num for b :");
        int b= scanner.nextInt();
        System.out.println("Num for c :");
        int c= scanner.nextInt();
        if(a>=b&&a>=c)
            System.out.println(a);
        else if (b>=a&&b>=c)
            System.out.println(b);
        else
            System.out.println(c);



    }
}
