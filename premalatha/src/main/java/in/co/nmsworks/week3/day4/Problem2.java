package in.co.nmsworks.week3.day4;
/*
Write a program to check if a given year is a leap year.
        A year is considered a leap year if it meets the following conditions:
        Divisible by 4: A year must be divisible by 4 to be a leap year.
        Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year unless...
        Divisible by 400: The year is divisible by 400.
 */

public class Problem2 {
    public void leapYear(int a){
        if(a % 4 == 0)
        {
            if(a % 100 != 0)
            {
                System.out.println("Not leap year");
            }
            else if (a % 400 == 0)
            {
                System.out.println("Leap year");
            }
        }
        else
            System.out.println("Not leap year");
    }
}
