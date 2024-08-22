package in.co.nmsworks.week3.day4;
/*
 Write a program that prints numbers from 1 to 100.
 For multiples of 3, print "Fizz" instead of the number.
 For multiples of 5, print "Buzz".
 For multiples of both 3 and 5, print "FizzBuzz".
 */

public class Q2 {

    public void multiples(){
        for (int i = 1; i < 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("The number " + i + "FizzBuzz");
            }
            if(i % 3 == 0){
                System.out.println("The number "+i+ "Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("The number "+i+ "Buzz");
            }
        }
    }

}




