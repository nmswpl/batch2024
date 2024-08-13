package in.co.nmsworks.week2;

//Write a program to print the position of given element in an array. If not present, print -1
//E.g : Input : arr = {7, 15, 41}
//Search Element : 41 Output : 2;
//Search Element : 5 Output : -1

import java.util.*;
class Te4 {
    int n;
    public Te4(int n)
    {
        this.n=n;
        int p=0;
        int a[] = {7, 15, 41};
        for (int i = 0; i < 3; i++)
        {
            if (a[i] == n)
            {
                p=1;
                System.out.println("The position of given element  " + n + "  in an array  " + i);
                break;
            }}
        if(p!=1)
        {
            System.out.println(" -1");
        }
    }
}


