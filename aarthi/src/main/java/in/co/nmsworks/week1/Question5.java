package in.co.nmsworks.week1;
import java.util.Scanner;
/*
*Factorial Write a program to Find Largest Among Three numbers using if else statement
*/

public class Question5 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=scanner.nextInt();
        System.out.println("Enter number 2:");
        int b=scanner.nextInt();
        System.out.println("Enter number 3:");
        int c=scanner.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+ " is greater");
        }
        else if (b>a && b>c)
        {
            System.out.println(b+ " is greater");
        }
        else
        {
            System.out.println(c+ " is greater");
        }


    }

}
