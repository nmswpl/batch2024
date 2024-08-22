package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week3.day2.Question8;

/****Write a program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number.
 *  For multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".
 *
 */
public class Question2 {
    public void printingValues() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz "+ i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz "+ i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz "+ i);
            }
        }
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        question2.printingValues();
    }
}
