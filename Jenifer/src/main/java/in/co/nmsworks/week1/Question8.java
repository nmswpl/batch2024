package in.co.nmsworks.week1;

import java.util.Scanner;

/* Star Pattern 1 :
*
**
***
****
*****
******
******* */
public class Question8 {
    public static void main(String[] arg) {
        int i, j;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
