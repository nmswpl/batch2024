package in.co.nmsworks.week2;
/*
Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ;
Input2 : 18, 18, 35 Output : 35
 */

import java.sql.SQLOutput;

public class Question8 {
    public void biggest(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println("The biggest number is "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("The biggest number is "+b);
        }
        else
        {
            System.out.println("The biggest number is "+c);

        }
    }

}
