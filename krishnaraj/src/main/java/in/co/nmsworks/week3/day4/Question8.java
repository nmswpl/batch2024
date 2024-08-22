package in.co.nmsworks.week3.day4;

import java.util.ArrayList;
import java.util.List;

/***Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
 Initial Step: Let a and b be the two numbers where a > b.
 Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
 Step 2: Replace a with b and b with r.
 Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.
 ***/
public class Question8 {
   public void calculateGCD(int number1,int number2){
      List<Integer> factor1s= new ArrayList<>();
      List<Integer> factor2s= new ArrayList<>();
      for (int i = 1; i <= number1; i++) {
         if(number1 % i ==0){
            factor1s.add(i);
         }
      }
      for (int i = 1; i <= number2; i++) {
         if(number2 % i ==0){
            factor2s.add(i);
         }
      }
      for (int i = factor1s.size()-1; i >= 0; i--) {
         for (int j = factor2s.size()-1; j >= 0; j--) {
            if(factor1s.get(i) == factor2s.get(j)){
               int gcdOfNumber = factor1s.get(i);
               System.out.println("The gcd of numbers is : "+gcdOfNumber);
               return;
            }
         }
      }
   }
   public static void main(String[] args) {
      Question8 question8 = new Question8();
      question8.calculateGCD(10,100);
   }
}
