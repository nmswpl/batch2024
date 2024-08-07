package in.co.nmsworks.week1;

/* Find Largest Among Three numbers using if..else statement*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        a=in.nextInt();
        System.out.println("Enter the number2 : ");
        b=in.nextInt();
        System.out.println("Enter the number3 : ");
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println("The Largest number is : "+a);
        }
        else if (b>c) {
            System.out.println("The Largest number is : "+b);
        }
        else{
            System.out.println("The Largest number is : "+c);
        }
    }
}
