package in.co.nmsworks.week3.day4;

/***
 * Write a program to check if a given year is a leap year.
 *
 *         A year is considered a leap year if it meets one of the following conditions:
 * Condition 1:
 * Divisible by 4: A year must be divisible by 4 to be a leap year.
 * Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year
 * Condition 2:
 * Divisible by 400: The year is divisible by 400.
 */
public class Question3 {
    public void checkLeapYear(int year) {
        if (year % 100 == 0) {
            System.out.println("Not an Leap Year : " + year);
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("This is an leap Year : " + year);
        } else {
            System.out.println("Not an leap Year : " + year);
        }
    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        question3.checkLeapYear(2024);
    }
}
