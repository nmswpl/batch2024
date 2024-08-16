package in.co.nmsworks.week2;
/*Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven. */
import java.util.Scanner;
public class Te8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three digit number: ");
        int num=scan.nextInt();
        int position=num/100;
        System.out.println("Hundred position is: "+ position);
    }
}
