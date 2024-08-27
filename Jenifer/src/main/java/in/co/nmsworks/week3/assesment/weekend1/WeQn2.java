package in.co.nmsworks.week3.assesment.weekend1;
//Write a program to print the first 10 numbers in the Fibonacci sequence.

public class WeQn2 {
    public void fibonacciSeries(){
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 1; i <= 8; i++) {
            sum = firstNumber + secondNumber;
            System.out.print(sum + " ");
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        System.out.println();
    }
}
