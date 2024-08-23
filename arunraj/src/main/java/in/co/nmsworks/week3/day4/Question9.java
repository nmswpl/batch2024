package in.co.nmsworks.week3.day4;

/*Write a program to find the greatest common divisor (GCD) of
two integers using the Euclidean algorithm.
        Initial Step: Let a and b be the two numbers where a > b.
        Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
        Step 2: Replace a with b and b with r.
        Repeat: Repeat the process until b becomes 0.
        The non-zero value of a at this point will be the
        GCD of the original two numbers.
 */

public class Question9 {
    public static void main(String[] args) {
        Question9 q9 = new Question9();
        System.out.println("The GCD is : "+q9.computeGCD(8,2));

    }

    public int computeGCD(int a,int b) {
        if(b == 0){
            return a;
        }
        else {
            return computeGCD(b , a % b);
        }
    }
}
