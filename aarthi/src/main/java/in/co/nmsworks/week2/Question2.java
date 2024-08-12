package in.co.nmsworks.week2;
/*
Write a program to print the Grade for given Mark.
Mark Slab :
91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F
 */

public class Question2 {
    public void grademarks(int a)
    {
       if ( a<= 100 && a > 90)
       {
           System.out.println("S");
       }
       else if(a <= 90 && a > 80)
       {
           System.out.println("A");
       }
       else if (a <= 80 && a > 70)
       {
           System.out.println("B");
       }
       else if (a<=70 && a>60)
       {
           System.out.println("C");
       }
       else if (a<=60 && a>50)
       {
           System.out.println("D");
       }
       else
       {
           System.out.println("F");

       }
    }

}
