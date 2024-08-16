package in.co.nmsworks.week2;

import java.util.Scanner;

/*
Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1
 */
public class Te4 {
    public void search(){

        int[] array1 = {23,18,90,1,7,63,34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int element = sc.nextInt();
        boolean flag = false;

        for(int i =0 ;i <array1.length;i++){
            if(array1[i] == element){
                System.out.println(" Search Element" + i+"\n");
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println(-1+"\n");
        }

    }
}
