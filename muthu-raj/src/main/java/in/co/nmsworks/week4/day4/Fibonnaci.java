package in.co.nmsworks.week4.day4;

import java.util.Scanner;

import static in.co.nmsworks.week3.day5.homework.Practice1.fib;

public class Fibonnaci {

    static int n1 = 0, n2 = 1, n3;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. of terms to be printed :: ");
//        int n = sc.nextInt();
//        System.out.println(fib(n,0,1));

        Fibonnaci f = new Fibonnaci();
        f.fib2(12);
    }

    private static int fib(int n,int n1,int n2)
    {
        if(n <= 1){
            return n1;
        }

        System.out.print(n1 + " ");
        return fib(n-1,n2,n1+n2);
    }

    private void fib2(int n)
    {
        if(n > 0)
        {
            System.out.print(n1 + " ");

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            fib2(n-1);
        }

    }
}
