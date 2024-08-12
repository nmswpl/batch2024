package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training13 {
    public Training13() {
        int sum =0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array:");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {

            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum + "\n");
    }
}
