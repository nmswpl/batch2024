package in.co.nmsworks.week3.assessment.day4;

/**
 *
 Problem-7: Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
 Initial Step: Let a and b be the two numbers where a > b.
 Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
 Step 2: Replace a with b and b with r.
 Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.
 */

public class Program7 {

    public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
        public  static void main(String[] args) {
            int num1 = 56;
            int num2 = 98;

            int result = gcd(num1, num2);
            System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);
        }
    }


