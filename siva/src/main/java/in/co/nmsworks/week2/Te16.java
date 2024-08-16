package in.co.nmsworks.week2;

/**
 * 16. Write a program using Recursion to find and print the factorial of a number.
 * For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
 */

public class Te16 {
    int num;
    public void Factorial(){
        int mul = 1;
        for (int i = num; i > 0; i--) {
            mul = mul * i;
        }
        System.out.println(mul);
    }

}
