package in.co.nmsworks.week3.assesment.weekend1;
/* Write a program that reads integers from the user until the user enters `0`,
then prints the sum of all entered integers.
 */

import java.util.Scanner;

public class WeQn3 {
    public void sumOfAllEnteredIntegers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        while (number != 0){
            sum += number;
            System.out.println("Enter a number");
            number = scanner.nextInt();
        }
        System.out.println("The sum of all entered number : " + sum);
    }
}
