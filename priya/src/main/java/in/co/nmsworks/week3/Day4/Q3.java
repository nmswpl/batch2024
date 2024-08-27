package in.co.nmsworks.week3.Day4;
/*
Problem-3: Write a program to find the sum of digits of a given integer.*/
public class Q3 {
    public void sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int x = n%10;
            sum+=x;
            n/=10;
        }
        System.out.println(sum);

    }
}
