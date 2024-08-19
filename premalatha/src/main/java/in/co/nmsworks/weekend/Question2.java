package in.co.nmsworks.weekend;
/*
Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F
 */

import java.util.Scanner;

public class Question2 {
    public void markGrade(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Mark : ");
        int mark = scan.nextInt();
        if(mark<= 100 && mark>=91)
        {
            System.out.println("S");
        }
        else if (mark<=90 && mark>=81)
        {
            System.out.println("A");
        }
        else if (mark<=80 && mark>=71)
        {
            System.out.println("B");
        }
        else if (mark<=70 && mark>=61)
        {
            System.out.println("C");
        }
        else if (mark<=60 && mark>=51)
        {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
