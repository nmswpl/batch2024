package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE20 {

    public void primeOrNot() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i < Math.sqrt(num); i++) {

            if (num % i == 0) {
                System.out.println("Not a Prime");
                return;
            }
        }

        System.out.println("It is a Prime");
    }
}
