package in.co.nmsworks.week2;
/*
 *Write a program to print all even numbers between 601 and 700 in descending order.
 */

public class Question1
{

    public void evennumbers(int a,int b)
        {
           for(int i = b;i >= a;i--)
           {
               if(i%2 == 0)
               {
                   System.out.println(i);
               }
           }
        }
}
