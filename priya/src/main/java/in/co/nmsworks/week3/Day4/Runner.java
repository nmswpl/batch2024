
package in.co.nmsworks.week3.Day4;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Q1 q1 = new Q1();
        q1.multiples();
        Q2 q2 = new Q2();
        q2.isLeapYear(2020);
        Q3 q3 = new Q3();
        q3.sumOfDigits(555);
        Q4 q4 = new Q4();
        q4.max(1,2,3);
        q4.min(1,2,3);
        Q5 q5 = new Q5();
        q5.getSecondLargest(new int[]{3,2,1,5,-1,7});
        Q7 q7 = new Q7();
        System.out.println();
        q7.getGcd(15,10);
        Q8 q8 = new Q8();
        q8.getMean(new int[]{1,2,3,4,5});
        Q9 q9 = new Q9();
        q9.getMean2(1,2,3,4);
        Q6 q6 = new Q6();
        q6.wordCount();
        Q10 q10 = new Q10();
        q10.getMode(1,1,2,2,3,3,3,4,4,4,4,4);


    }
}

