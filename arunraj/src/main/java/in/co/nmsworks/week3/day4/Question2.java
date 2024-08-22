package in.co.nmsworks.week3.day4;
/*Problem-2: Write a program to check if a given year is a leap year.
        A year is considered a leap year if it meets the following conditions:
        Divisible by 4: A year must be divisible by 4 to be a leap year.
        Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year unless...
        Divisible by 400: The year is divisible by 400.

 */

public class Question2 {
    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.isLeapYear(2028);
    }

    public void isLeapYear(int year){
        if (year % 400 == 0 && year % 4 == 0) {
            System.out.println("It is a Leap year");
        }
            if (year % 4 == 0) {
                System.out.println("It is a Leap year");
            }
            else {
                System.out.println("It is not a Leap year");
            }
        }


}

