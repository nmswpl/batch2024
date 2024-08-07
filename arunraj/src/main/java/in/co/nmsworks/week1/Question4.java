package in.co.nmsworks.week1;

/*) Factorial Program in Java*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number for Factorial : ");
        n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
    }
}
