package in.co.nmsworks.week2;

/*Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120*/

public class Te16 {
    public void factorial(int n){
        int fact=1;
        for(int i=0;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+"is : "+fact);
    }
}
