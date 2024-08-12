package in.co.nmsworks.week2;

//Given an array of integer, Write a Program to find the largest element in the given
//array.
//For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20

public class Te17 {
    public static void main(String[] args) {
        int a[]={12, 3, 20, 14};
        int bigNum=0;
        for (int i = 0; i < 3; i++) {
            if(a[i]>bigNum)
            {
                bigNum=a[i];
            }
        }
        System.out.println("The biggest of the 3 numbers is "+bigNum);
    }


    }

