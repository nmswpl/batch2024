package in.co.nmsworks.weekend;
/* *
**
***
****
*****
******
******* */

import java.util.Scanner;

public class Qn28 {
    public void starPattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
