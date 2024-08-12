package in.co.nmsworks.week2;

import java.util.Arrays;
import java.util.Scanner;

public class Training17 {
    public Training17(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        int size = sc.nextInt();

        int array[] = new  int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxElement){
                maxElement  = array[i];
            }
        }

        System.out.println(maxElement + "\n");

    }
}
