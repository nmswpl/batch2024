package in.co.nmsworks.week1;

import java.util.Scanner;

/*** Factorial Program in Java ***/

public class Question4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for calculate fatorial :");
        int fact=sc.nextInt();
        int mul=1;
        for(int i=1;i<=fact;i++){
            mul=mul*i;
        }
        System.out.println("Factorial value : "+mul);
        }
    }
