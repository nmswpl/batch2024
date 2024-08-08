package in.co.nmsworks.week1;
import java.util.Scanner;
/*
*Factorial Program in Java
*/

public class Question4 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int factorial=1;
        System.out.println("Enter a number:");
        int a=scanner.nextInt();
        for(int i=1;i<=a;i++)
        {
            factorial= i * factorial;
        }
        System.out.println("The Factorial of "+a+"="+factorial);
    }
}
