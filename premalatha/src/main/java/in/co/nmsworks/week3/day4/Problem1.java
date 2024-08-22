package in.co.nmsworks.week3.day4;
/*
 Write a program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number.
 For multiples of 5, print "Buzz".
 For multiples of both 3 and 5, print "FizzBuzz".
 */
public class Problem1 {
    public void factors(){
        int a = 3;
        for (int i = 1; i <= 100; i++) {
            if ( i % a == 0) {
                System.out.println(  " Fizz ");
            }
        }
        int b = 5;
        for (int i = 1; i <= 100; i++) {
            if ( i % a == 0) {
                System.out.println(  " Buzz ");
            }
        }
    }
}
