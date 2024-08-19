package in.co.nmsworks.weekend;
/*
program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
 */

public class Q7 {
    int factorial=1;
    public void setFactorial(int num){
        for (int i = num; i >1 ; i--) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
