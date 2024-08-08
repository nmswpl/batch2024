package in.co.nmsworks.week1;
import java.util.*;

// Factorial of a number

public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;                                  // get a number from the user
        System.out.println("ENTER n");
        n = sc.nextInt();
                                                //factorial logic
        int num=1;
        for (int i = 1; i <=n; i++) {
            num=num*i;
        }
                                                //print the result
        System.out.println("The factorial of the number is " + num);
    }
}


