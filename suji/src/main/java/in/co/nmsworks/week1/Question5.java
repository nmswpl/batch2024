package in.co.nmsworks.week1;
import java.util.*;

//to find the greatest number

public class Question5
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER NUMBERS THAT AREN'T EQUAL");
        int a,b,c;
        System.out.println("Enter a");
        a=sc.nextInt();
        System.out.println("Enter b");
        b=sc.nextInt();
        System.out.println("Enter c");
        c=sc.nextInt();
        if((a>b)&&(a>c)) {
            System.out.println(" a is the greatest");
        }
        else if ((b>c)&&(b>a)) {
                System.out.println(" b is the greatest");
            }
        else if ((c>b)&&(c>a)) {
            System.out.println(" c is the greatest");
        }
        else {
            System.out.println("If you have entered the same number then "+a+" is the greatest number");
        }

        }

    }

