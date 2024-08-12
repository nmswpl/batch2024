package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training18 {
    public Training18() {
        int count =0;
        Scanner sc = new Scanner(System.in);
        int[] array = {2,4,2,5,6,4,8,3,9,9,0,1,4,3};
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number ){
                count++;
            }
        }

        System.out.println(count);
    }
}
