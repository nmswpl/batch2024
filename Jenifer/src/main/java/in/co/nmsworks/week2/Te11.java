package in.co.nmsworks.week2;
/* Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35 */

import java.util.Scanner;

public class Te11 {
    public void greatest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3 : ");
        int number3 = scanner.nextInt();
        if (number1>number2 && number1>number3){
            System.out.println(number1 + " is greatest number");
        } else if (number2>number1 && number2>number3){
            System.out.println(number2 + " is greatest number");
        } else if (number3>number1 && number3>number2){
            System.out.println(number3 + " is greatest number");
        } else {
            System.out.println("All are equal");
        }
    }
}
