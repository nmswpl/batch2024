package in.co.nmsworks.week1;

/*3) Multiples of 7 Program in Java*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number for table : ");
        n=in.nextInt();
        for(int i=1;i<=10;i++){
            int table;
            table=n*i;
            System.out.println(n+" * "+i+" = "+table);
        }
    }
}
