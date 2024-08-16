package in.co.nmsworks.week2;
/*
Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S; 81-90 = A;
71-80 = B; 61-70 = C ;
51-60 = D; Every thing else : F
 */

import java.util.Scanner;

public class Te2 {
    public void grade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark:");
        int mark = sc.nextInt();

        if(mark >= 91 && mark <=100){
            System.out.println('S'+"\n");
        }else if (mark >= 81 && mark <=90){
            System.out.println('A' +"\n");
        }else if(mark >= 71 && mark <=80){
            System.out.println('B'+"\n");
        }else if(mark >= 61 && mark <=70){
            System.out.println('C'+"\n");
        } else if (mark >= 51 && mark <=60) {
            System.out.println('D' +"\n");
        }else{
            System.out.println('F'+"\n");
        }
    }
}
