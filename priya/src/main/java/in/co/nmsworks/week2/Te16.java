package in.co.nmsworks.week2;
/*16. Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120*/
public class Te16 {
    public int fact(int n) {
        int factorial = 1; int i=1;
     while(i<=n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public void getFactorial(int n){
        System.out.print(n*fact(n-1));
    }
}
