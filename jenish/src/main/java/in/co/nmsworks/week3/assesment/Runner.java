package in.co.nmsworks.week3.assesment;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.checkVehicles();
        Question2 q2 = new Question2();
        int[] arr = {24,23,4,7,9,21,14};
        q2.printEvenElements(arr);

        Question3 q3 =  new Question3();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        q3.computePrimes(num);

        TutionCenter t1 = new TutionCenter();
        t1.tutionCenterMap();
    }
}
