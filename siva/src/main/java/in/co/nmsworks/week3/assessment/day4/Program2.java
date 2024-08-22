package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-2: Write a program to check if a given year is a leap year.
 *         A year is considered a leap year if it meets the following conditions:
 *         Divisible by 4: A year must be divisible by 4 to be a leap year.
 *         Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year unless...
 *         Divisible by 400: The year is divisible by 400.
 */

public class Program2 {
    public static void main(String[] args) {
        Program2 program2 = new Program2();
        System.out.println(program2.leapYear(2024));

    }
    public String leapYear(int year) {
        String s = "";
        if (year % 4 == 0 && year % 100 != 0) {
            s = "leap year";
        } else if (year % 400 == 0) {
            s = "leap year";

        } else
            s = "not a leap year";
        return s;
    }
}
