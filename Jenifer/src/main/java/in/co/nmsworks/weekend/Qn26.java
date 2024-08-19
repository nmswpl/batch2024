package in.co.nmsworks.weekend;
/* Numeric Pattern 1 :
1
12
123
1234
12345
123456
1234567 */

import java.util.Scanner;

public class Qn26 {
    public void numericPattern1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
