package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training20 {
    public Training20() {
        int m =0,flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();

        m = number /2;

        if(number == 1 || number == 0){
            System.out.println("Not a prime Number");
        }else{
            for (int i = 2; i < m; i++) {
                if(number % i ==0){
                    System.out.println(number+" is not a Prime Number");
                    flag = 1;
                }
            }
        }

        if(flag == 0){
            System.out.println(number + " is prime Number");
        }


    }
}
