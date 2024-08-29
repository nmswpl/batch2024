package in.co.nmsworks.week4;

import java.util.ArrayList;
import java.util.List;

public class FibonacciUsingRecursion
{
   private int start;
   private int next;
   private int n;
   int i=0;
   List<Integer> list= new ArrayList<>();

   public int findFactorial(int start, int next, int n)
   {
       int sum = start + next;

       if (n==i)
       {
           System.out.println("The above is the result ");
       }
       else
       {
           list.add(start);
           System.out.println(start);
           start = next;
           next = sum;
           i++;
           return findFactorial(start, next, n);
       }
           return  1;
   }

    public static void main(String[] args)
    {
        FibonacciUsingRecursion ob=new FibonacciUsingRecursion();
        int a= ob.findFactorial(0,1,10);
        System.out.println(a);
    }
   }

