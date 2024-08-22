package in.co.nmsworks.week3.assesment.day4;
/* Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
Initial Step: Let a and b be the two numbers where a > b.
Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
Step 2: Replace a with b and b with r.
Repeat: Repeat the process until b becomes 0.
        The non-zero value of a at this point will be the GCD of the original two numbers.
 */

public class GCD {
    public void greatestCommonDivisor(int number1, int number2){
        if (number1 > number2) {
            int remainder;
            while (number2 != 0) {
                remainder = number1 % number2;
                number1 = number2;
                number2 = remainder;
            }
        }
        System.out.println("GCD : " +number1);
    }
}
