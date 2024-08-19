package in.co.nmsworks.weekend;
/* Write a program to Multiply Two Floating-Point Numbers.
The Result is: 3.0 */

import java.util.Scanner;

public class Qn22 {
    public void floatMultiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        float number1 = scanner.nextFloat();
        System.out.println("Enter number 2");
        float number2 = scanner.nextFloat();
        System.out.println("Product : " + number1 * number2);
    }
}
