package in.co.nmsworks.week3.day4;
//Write a program to check if a given year is a leap year.
//A year is considered a leap year if it meets the following conditions:
//Divisible by 4: A year must be divisible by 4 to be a leap year.
//Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year unless...
//Divisible by 400: The year is divisible by 400.

public class Program2 {
    public static void main(String[] args) {
        new Program2().isLeapOrNot(2200);

    }

    public void isLeapOrNot(int year){
        if(year%4==0 && year%100 !=0){
            System.out.println("it is a leap year");
        } else if (year%400==0) {
            System.out.println("it is a leap year");
        }else{
            System.out.println("it is not a leap year");
        }
    }
}
