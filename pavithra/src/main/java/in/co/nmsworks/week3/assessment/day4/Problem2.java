package in.co.nmsworks.week3.assessment.day4;

import java.util.Scanner;

/**
 * Write a program to check if a given year is a leap year.
 *         A year is considered a leap year if it meets the following conditions:
 *         Divisible by 4: A year must be divisible by 4 to be a leap year.
 *         Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year unless...
 *         Divisible by 400: The year is divisible by 400.
 */

public class Problem2 {
    public void leapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = scan.nextInt();

        if (year % 4 == 0)  {
            System.out.println(year + " is a leap year.");
        } else if ((year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + "is not a leap year");

        } else{
            System.out.println(year + " is not a leap year.");
        }
    }
}