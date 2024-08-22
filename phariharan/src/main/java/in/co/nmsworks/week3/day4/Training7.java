package in.co.nmsworks.week3.day4;

/**
 * Problem-7: Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
 * Initial Step: Let a and b be the two numbers where a > b.
 * Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
 * Step 2: Replace a with b and b with r.
 * Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.
 */
public class Training7 {
    public void computeGCD(int a, int b) {
        int remainder = 0;
        int gcd = 0;
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        if (a>b){
            min = b;
            max = a;
        }
        else {
            min = a ;
            max = b;
        }
            while (min != 0) {
                gcd = remainder;
                remainder = max % min;
                max = min;
                min = remainder;
            }

        System.out.println("GCD of given number "+a+" & "+b+" is : "+gcd);
    }
}
