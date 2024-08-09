package in.co.nmsworks.week1;

import java.util.Scanner;

/* Factorial Program in Java */
public class Question4 {
    public static void main(String[] arg){
        int x;
        int n = 1;
        int a =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        x = scanner.nextInt();
        for(int i=x; i>=n; i--)
            a = i * a;
        System.out.println(a);
    }
}
