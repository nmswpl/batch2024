package in.co.nmsworks.week2;
/*Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120 */
public class Te16
{
    public static void main(String[] args) {
        int i = 1;
        int factorial = 1;
        int num = 5;
        for (i = 1; i <= num; i++)
        {
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}
