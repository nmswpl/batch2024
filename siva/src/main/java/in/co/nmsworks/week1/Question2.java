package in.co.nmsworks.week1;
import java.util.Scanner;

/**
 * Write a program to Multiply Two Floating-Point Numbers
 */

public class Question2 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1st floating no");
        float a=scanner.nextFloat();
        System.out.println("2nd floating no");
        float b=scanner.nextFloat();
        float c=1f;
        c=a*b;
        System.out.println("The Result is :"+c);

    }
}
