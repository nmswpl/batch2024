package in.co.nmsworks.week3.practicequestions;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Number {
     List<Integer> listOfIntegers = new ArrayList<>();
     private int number;

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public void display(int number) {

         if (number == 0) {
             System.out.println(" Its is ZERO");
         } else if (number > 0) {
             System.out.println("Its a POSITIVE number");
         } else if (number < 0) {
             System.out.println("Its a NEGATIVE  number");
         }
     }

     public int[] fibanocciNumber() {
         int start = 0;
         int next = 1;
         int temp = 0;
         int i = 0;
         int[] array = new int[10];
         while (i < 10) {
             array[i] = start;
             temp = start + next;
             start = next;
             next = temp;
             i++;
         }
         return array;
     }

     public void displayFibanocci(int[] array) {
         System.out.println(" SEries:");
         for (int i = 0; i <= array.length - 1; i++) {
             System.out.println(array[i]);
         }
     }

     public void sumOfDigitsUntilZero(int number)
     {
         if (number == 0)
         {
             System.out.println(" Only until zero the numbers shall be entered! ");
             printListOfIntegers(listOfIntegers);
         }
         else
         {
             listOfIntegers.add(number);
         }
     }
     public void printListOfIntegers(List<Integer> list)
     {
         int sum = 0;
             for (Integer listOfInteger : listOfIntegers)
             {
                 sum=sum+listOfInteger;
             }
         System.out.println(" THe sum of numbers already enter is :: " + sum);
         }


     public static void main(String[] args) {
         Number ob = new Number();
         Scanner sc = new Scanner(System.in);

         //  ob.setNumber(number);
         //  ob.display(number);
         //  int[] array = ob.fibanocciNumber();
         //   ob.displayFibanocci(array);

         int quit=0;
         while (quit!=1)
         {
             int choice;
             System.out.println("Enter choice ");
             System.out.println(" 1 : To enter a number");
             System.out.println(" 2 : To Quit");
             choice = sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println(" PLease enter a number");
                     int number = sc.nextInt();
                     ob.sumOfDigitsUntilZero(number);
                     break;

                 case 2:
                     System.out.println(" Quitting");
                     quit = 1;
                     break;
             }

         }
     }
 }