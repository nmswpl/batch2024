package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training12 {
    public Training12() {
        Scanner sc  = new Scanner(System.in);
        int count =0;
        System.out.println("Enter the number of elements in Array:");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        for (int i =0; i <arraySize;i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            if(array[i] % 2 == 1){
               count++;
            }
        }
        System.out.println(count);
        System.out.println("\n");
    }
}
