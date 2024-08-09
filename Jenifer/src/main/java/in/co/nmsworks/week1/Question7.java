package in.co.nmsworks.week1;
/* Numeric Pattern 2:
1111111
222222
33333
4444
555
66
7 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] arg) {
        int i, j;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
