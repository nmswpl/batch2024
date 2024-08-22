package in.co.nmsworks.week3.day4;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Problem1 p1 = new Problem1();
        p1.fizBuzz();

        Problem2 p2 = new Problem2();
        p2.leapYearOrNot(1996); //Check Logic

        Problem3 p3 = new Problem3();
        p3.sumOfDigits(1783); //Handle as Int

        Problem4 p4 = new Problem4();
        p4.findMinAndMax(new int[] {-4,-5,-2,-6,-1});

        Problem5 p5 = new Problem5();
        p5.findSecondLargestElement(new int[] {4,5,2,6,1});

        Problem6 p6 = new Problem6();
        p6.countNoOfWords();

        Problem7 p7 = new Problem7();
        p7.findGcd(5,10);

        Problem8 p8 = new Problem8();
        p8.findMean(new int[] {4,5,2,6,1});

        Problem9 p9 = new Problem9();
        p9.findMedian(new int[] {4,5,2,6,1,3});

        Problem10 p10 = new Problem10();
        p10.findFrequencyOfElement(new int[] {4,7,7,7,1,1,8});

        Problem11 p11 = new Problem11();
        p11.findNumberNames(747);
    }
}