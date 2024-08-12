package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training15 {
    public Training15() {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int number = sc.nextInt();

        int[] array = new int[number];

        for(int i = 0; i<number;i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
                System.out.println(array[i]);
            }
        }

        System.out.println(count+"\n");
    }
}
