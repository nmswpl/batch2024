package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training3 {
    public Training3(){

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array1:");
        int array1Size = sc.nextInt();
        
        int[] array1 =  new int[array1Size];
        for (int i =0 ;i <array1Size;i++){
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in Array2:");
        int array2Size = sc.nextInt();

        int[] array2 =  new int[array2Size];
        for (int i =0 ;i <array2Size;i++){
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array2Size; i++) {
            System.out.println(array1[i] * array2[i]+ "\n");
        }
    }
}
