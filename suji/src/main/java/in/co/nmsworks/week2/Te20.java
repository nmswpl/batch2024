package in.co.nmsworks.week2;

//Given an integer x, Write a Program to check whether x is Prime or not ?
//E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime


import java.util.Scanner;

class Te20    {
    int n;
    public Te20(int n3){
        this.n=n3;

        int c=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0)
            {
                c=c+1;
            }}
        if (c==2)

        {
            System.out.println("PRIME");
        }
        else System.out.println("NOT A PRIME NUMBER");

    }

}

