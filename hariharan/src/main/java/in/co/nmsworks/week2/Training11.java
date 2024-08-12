package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training11 {
    public Training11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int number1 = sc.nextInt();

        System.out.println("Enter the number 2:");
        int number2 = sc.nextInt();

        System.out.println("Enter the number 3:");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number1 >= number3){
            System.out.println(number1 + "\n");
        } else if (number2 >=number1 && number2 >= number3) {
            System.out.println(number2+"\n");

        }else{
            System.out.println(number3+"\n");
        }

    }
}
