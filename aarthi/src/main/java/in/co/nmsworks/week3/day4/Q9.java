package in.co.nmsworks.week3.day4;
/*
Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
        Initial Step: Let a and b be the two numbers where a > b.
        Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
        Step 2: Replace a with b and b with r.
        Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.

 */

public class Q9 {
    public void findGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
            System.out.println("The GCD of two Numbers:: "+a);
        }

    }

}
