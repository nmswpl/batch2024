package in.co.nmsworks.week1;
import java.util.Scanner;

/** Write a program to Find Largest Among Three numbers using
 if..else statement**/

public class Question5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter n0.1");
        int n1= s.nextInt();

        System.out.println("Enter n0.2");
        int n2 = s.nextInt();

        System.out.println("Enter n0.3");
        int n3 = s.nextInt();

        if(n1>=n2 && n1>=n3)
            System.out.println(n1+" is  the greatest number");
        if(n2>=n1 && n2>=n3)
            System.out.println(n2+" is the greatest number");
        else
            System.out.println(n3+" is the greatest number");
    }

}
