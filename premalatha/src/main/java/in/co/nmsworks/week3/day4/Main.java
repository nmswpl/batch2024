package in.co.nmsworks.week3.day4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Problem1 p1 = new Problem1();
        p1.factors();

        Problem2 p2 = new Problem2();
        p2.leapYear(2002);

        Problem3 p3 = new Problem3();
        p3.sumOfIntegers(155);

        Problem4 p4 = new Problem4();
        p4.minAndMaxValues();

        Problem5 p5 = new Problem5();
        p5.secondLargestElement();

        Problem6 p6 = new Problem6();
        p6.countNoOfWords();

        Program7 p7 = new Program7();
        p7.findGCD(6,9);

        Program8 p8 = new Program8();
        p8.findMean();

        Program9 p9 = new Program9();
        p9.findMedian();

        Program10 p10 = new Program10();
        p10.frequentElementsInArray(new int[]{1,6,7,1,9});
    }
}
