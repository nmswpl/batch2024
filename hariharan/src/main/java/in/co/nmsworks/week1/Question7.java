package in.co.nmsworks.week1;

// Numerical patter 2

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number:");
     int x = sc.nextInt();

     int y =x;

     for(int i = 1;i<=x;i++){
         for(int j = 1;j<=y;j++){
             System.out.print(i + " ");
         }

         y--;

         System.out.println("");
     }
    }
}
