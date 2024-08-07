package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * find the largest number between three numbers
 **/

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1:");
        int a = sc.nextInt();
        System.out.println("enter the number2:");
        int b = sc.nextInt();
        System.out.println("enter the number3:");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is the highest number");
        }
        else if(b>c){
            System.out.println(b + " is the highest number");
        }
        else {
            System.out.println(c + " is the highest number");
        }
    }
}
