package in.co.nmsworks.week2;

//. Write a program to print the Grade for given Mark.
//Mark Slab : 91-100 = S; 81-90 = A;
//71-80 = B; 61-70 = C ;
//51-60 = D; Every thing else : F

import java.sql.SQLOutput;
import java.util.*;
public class Te2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark;
        System.out.println("Enter mark");
        mark=sc.nextInt();

       if((mark>90)&&(mark<=100))
        {
            System.out.println("The grade for your mark  :: S");
        }
       else if((mark>80)&&(mark<=90))
        {
            System.out.println("The grade for your mark  :: A");
        }
       else if((mark>70)&&(mark<=80))
       {
           System.out.println("The grade for your mark  :: B");
       }
       else if((mark>50)&&(mark<=60))
       {
           System.out.println("The grade for your mark  :: D");
       }
       else if((mark>60)&&(mark<=70))
       {
           System.out.println("The grade for your mark  :: C");
       } else if (mark<=50) {
           System.out.println(" The grade for your mark  :: FAIL ");
       }


    }
}
