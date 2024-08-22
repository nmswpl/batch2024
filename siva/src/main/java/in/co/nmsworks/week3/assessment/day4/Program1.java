package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-1: Write a program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number. For multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".
 */

public class Program1 {
    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);

        }
        for (int i = 1; i <=100 ; i++) {
            if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");

            }

        }
        for (int j = 0; j <= 100; j++) {
            if(j % 3 ==0 && j % 5 == 0){
                System.out.println("FizzBuzz");
            }

        }

    }
}
