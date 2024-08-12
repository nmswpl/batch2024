package in.co.nmsworks.week2;

import java.util.Scanner;

/**
 * Write a program to print the Grade for given Mark.
 * Mark Slab : 91-100 = S; 81-90 = A;
 * 71-80 = B; 61-70 = C ;
 * 51-60 = D; Every thing else : F
 */

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the mark=");
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark>=91){
            System.out.println("Grade S");}

        else if(mark >= 81 && mark<=90){
            System.out.println("Grade A");}
        else if (mark>=71 && mark<=80){
            System.out.println("Grade B");}
        else if (mark>=61 && mark<=70) {
            System.out.println("Grade C ");}
        else if (mark>=51 && mark<=60) {
            System.out.println("Grade D");}
        else {
            System.out.println("Grade F");

        }


    }

    }




