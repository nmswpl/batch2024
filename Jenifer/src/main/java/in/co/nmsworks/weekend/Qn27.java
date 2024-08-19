package in.co.nmsworks.weekend;
/* 1111111
222222
33333
4444
555
66
7 */

import java.util.Scanner;

public class Qn27 {
    public void numericPattern2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
