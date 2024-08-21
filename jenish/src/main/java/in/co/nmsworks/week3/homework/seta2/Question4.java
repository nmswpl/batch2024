package in.co.nmsworks.week3.homework.seta2;

import java.util.HashSet;
import java.util.Set;

public class Question4 {
    Set<Integer> fibonacciSet = new HashSet<>();

    public void findFibonacci(int num){
        if(fibonacciSet.contains(num)){
            System.out.println(num+" is a Fibonacci number.");
        }
        else{
            System.out.println(num+" is not Fibonacci number.");
        }
    }
    public void compute(){
        int a = 0;
        int b = 1;

        while(b < 1000){
            fibonacciSet.add(b);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.compute();
        q4.findFibonacci(21);
    }
}