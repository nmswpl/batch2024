package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * multiplication table of 7
 * **/

public class Question3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Which table do you want ? ");
        int table_num = 7;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(table_num + " X " +i + " = "+ table_num * i);
        }
    }
}
