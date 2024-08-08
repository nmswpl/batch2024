package in.co.nmsworks.week1;
/* Write a program t oMultiply Two Floating-Point Numbers
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1 =");
        float a = scanner.nextFloat();
        System.out.println("Enter a number2 =");
        float b = scanner.nextFloat();
        float c = a*b;
        System.out.println("The Result is=" +c);


    }

}
