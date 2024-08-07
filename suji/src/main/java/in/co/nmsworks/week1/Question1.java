package in.co.nmsworks.week1;
import java.util.*;

//To compute Quotient and Reminder

public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int dividend;   //  get divident
        System.out.println("Enter dividend");
        dividend=sc.nextInt();
        int divisor;   //   get divisor
        System.out.println("Enter divisor");
        divisor=sc.nextInt();
        int quo=0;
        int reminder=0;
        quo=dividend/divisor;
        reminder=dividend%divisor;
        System.out.println("Quotient"+quo);
        System.out.println("Reminder"+reminder);

    }
}
