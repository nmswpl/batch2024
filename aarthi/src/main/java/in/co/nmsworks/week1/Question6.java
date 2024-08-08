package in.co.nmsworks.week1;
import java.util.Scanner;
/*
*Numeric Pattern 1
*/

public class Question6 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a= scanner.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
