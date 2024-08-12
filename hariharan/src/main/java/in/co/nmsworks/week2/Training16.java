package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training16 {

    public static  int factorial(int number){

        if(number == 1){
            return  1;
        }

       return  (number * factorial(number-1));

    }
    public Training16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        System.out.println(factorial(number) + "\n");
    }
}
