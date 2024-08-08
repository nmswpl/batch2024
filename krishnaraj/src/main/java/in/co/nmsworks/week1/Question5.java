package in.co.nmsworks.week1;

/*** Write a program to Find Largest Among Three numbers using
 if else statement ***/
import java.util.Scanner;
public class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater number :" + a);
            } else {
                System.out.println("C is greater number :" + c);
            }
        } else if (b > c) {
            System.out.println("B is greater number :" + b);
        } else {
            System.out.println("C is greater number :" + c);
        }
    }
}



