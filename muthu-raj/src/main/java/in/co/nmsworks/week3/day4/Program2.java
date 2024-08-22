package in.co.nmsworks.week3.day4;

/*
Problem-2: Write a program to check if a given year is a leap year.
        A year is considered a leap year if it meets the following conditions:
Condition 1:
Divisible by 4: A year must be divisible by 4 to be a leap year.
Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year unless...
        Divisible by 400: The year is divisible by 400.
 */
public class Program2 {
    public static void main(String[] args) {
        int year = 2027;
        System.out.println("The year " + year + " is a leap year :: " + isLeapYear(year));

    }

    private static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
