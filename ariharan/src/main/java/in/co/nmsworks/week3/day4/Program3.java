package in.co.nmsworks.week3.day4;
//Write a program to find the sum of digits of a given integer

public class Program3 {
    public static void main(String[] args) {
        System.out.println(new  Program3().sumOfDigits(1535));
    }
    public int sumOfDigits(int digit){
        int sum=0;
        while (digit>0){
           int rem=digit%10;
           sum+=rem;
           digit/=10;
        }
        return sum;
    }
}
