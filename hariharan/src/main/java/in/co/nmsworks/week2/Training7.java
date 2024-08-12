package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training7 {
    public Training7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int size = sc.nextInt();

        int[] array1 = new int[size];

        for (int i =0 ;i <size;i++){
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array1[i] * array1[i] + "\n");
        }
    }
}
