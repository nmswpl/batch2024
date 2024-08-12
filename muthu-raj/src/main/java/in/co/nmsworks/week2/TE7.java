package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE7 {

    public void printSquare(int[] arr){
        Scanner sc =  new Scanner(System.in);

        for (int i : arr) {
            System.out.print(i*i);
            System.out.print(" ");
        }

    }
}
