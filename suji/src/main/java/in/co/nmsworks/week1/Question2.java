package in.co.nmsworks.week1;
import java.util.*;

//to multiply to 2 floating numbers

public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a;         // get values of 3 floating numbers
        float b;         // say a,b,&c
        float c;
        System.out.println("Enter a");
        a=sc.nextFloat();
        System.out.println("Enter b");
        b=sc.nextFloat();
        c=a*b;           // multiply the floating numbers
        System.out.println("The result is "+c);

    }
}
