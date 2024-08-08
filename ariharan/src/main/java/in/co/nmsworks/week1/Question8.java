package in.co.nmsworks.week1;
import java.util.Scanner;
/**
 *Star Pattern 1 :
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 **/

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" +" ");

            }
            System.out.println();
        }
    }
}
