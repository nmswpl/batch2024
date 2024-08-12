package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training4 {
    public Training4(){

        int[] array1 = {23,18,90,1,7,63,34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int element = sc.nextInt();
        boolean flag = false;

        for(int i =0 ;i <array1.length;i++){
            if(array1[i] == element){
                System.out.println(i+"\n");
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println(-1+"\n");
        }

    }
}
