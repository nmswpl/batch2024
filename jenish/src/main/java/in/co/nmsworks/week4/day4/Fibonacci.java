package in.co.nmsworks.week4.day4;

import java.util.Scanner;

public class Fibonacci {
    public int findFibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for find Fibonacci Series : ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series :: ");
        for (int i = 0; i < num ; i++) {
            System.out.print(fibonacci.findFibonacci(i)+" ");
        }
    }
}
