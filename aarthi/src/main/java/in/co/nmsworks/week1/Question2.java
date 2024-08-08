package in.co.nmsworks.week1;
import java.util.Scanner;
/*
* Write a program to Multiply Two Floating-Point Numbers
*/

 public class Question2 {
  public static void main(String[] args) {
   System.out.println("Enter the number1");
   Scanner scanner = new Scanner(System.in);
   Double a = scanner.nextDouble();
   System.out.println("Enter the number2");
   Double b = scanner.nextDouble();
   double mul = a * b;
   System.out.println("The Result is: " + mul);

  }
 }
