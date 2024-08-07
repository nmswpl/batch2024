package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 *Alphabet Pattern 1 :
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * F F F F F F
 * G G G G G G G
 **/
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int k =65;
        for (int i =1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)k + " ");
            }
            k = k + 1;
            System.out.println();
        }
    }
}
