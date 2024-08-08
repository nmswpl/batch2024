package in.co.nmsworks.week1;
import java.util.Scanner;

/**
 * Factorial Program in Java
 */

public class Question4 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a= scanner.nextInt();
        int c=1;
        while(a>0){
            c=a*c;
            a--;

        }
        System.out.println(c);

    }
}
