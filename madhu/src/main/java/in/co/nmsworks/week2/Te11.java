package in.co.nmsworks.week2;

import java.util.Scanner;

public class Te11
{
        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a value =");
            int a = scanner.nextInt();
            System.out.println("Enter b value =");
            int b = scanner.nextInt();
            System.out.println("Enter c value =");
            int c = scanner.nextInt();
            if(a>b&&a>c)
                System.out.println("a is larger");
            else if(b>c)
                System.out.println("b is larger");
            else
                System.out.print("c is larger");


        }
}
