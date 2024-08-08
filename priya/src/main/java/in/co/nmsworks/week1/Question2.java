package in.co.nmsworks.week1;
import java.util.Scanner;
/**Write
 a
 program
 to
 Multiply
 Two
 Floating-Point
 Numbers The Result is: 3.0**/
public class Question2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float a = s.nextFloat();

        System.out.println("Enter the second number:");
        float b = s.nextFloat();

        System.out.println("The Result is: "+a*b);
    }
}
