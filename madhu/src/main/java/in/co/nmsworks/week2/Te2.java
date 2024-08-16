
package in.co.nmsworks.week2;
/*Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F */

import java.util.Scanner;

public class Te2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark =");
        int mark = scanner.nextInt();
    if(mark > 91)
    {
        System.out.println("S");

    }
    else if (mark > 81) {
        System.out.println("A");
    }
    else if (mark > 71) {
        System.out.println("B");
    }
    else if (mark > 61) {
        System.out.println("C");
    }
    else if (mark > 51) {
        System.out.println("D");
    }
    else {
       System.out.println("F");
    }


    }
}

