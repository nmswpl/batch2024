package in.co.nmsworks.week3.assessment.day4;

import java.io.IOException;

public class RunnerClass {
    public static void main(String[] args) throws IOException {
        Problem1 number = new Problem1();
        number.numbers();

        Problem2 leap = new Problem2();
        leap.leapYear();

        Problem3 p3 = new Problem3();
        p3.sumOfDigits(1010);

        Problem4 minmax = new Problem4();
        minmax.findMinMax(new int[]{1,2,3,4,5});

        Problem5 second = new Problem5();
        second.getSecondLargest(2,4,2,6,1);

        Problem6 count = new Problem6();
        count.countWords();

        Problem7 gcd = new Problem7();
        System.out.println("GCD is : " + gcd.findGCD(40,20));

        Problem8 mean = new Problem8();
        mean.meanFind(new int[]{5,8,2,10,12});

        Problem9 median = new Problem9();
        median.medianFinder(98,23,45,67,76,87);

        Problem10 freq = new Problem10();
        freq.frequency();


        //Position p = new Position();
        //p.numToWord();







    }
}
