package in.co.nmsworks.week3.day4;
//Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
//Initial Step: Let a and b be the two numbers where a > b.
//        Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
//Step 2: Replace a with b and b with r.
//Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.

public class Program7 {
    public static void main(String[] args) {
        new Program7().gcd(30,45);
    }
    public void gcd(int val1,int val2){
        while (val2>0){
            int rem = val1%val2;
            val1=val2;
            val2=rem;
        }
        System.out.println("Gcd of the two number is::"+val1);

    }
}
