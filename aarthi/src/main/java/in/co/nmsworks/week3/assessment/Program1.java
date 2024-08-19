package in.co.nmsworks.week3.assessment;
/*
2) Given an array of integers, Write a Program to count and print number of even elements in the array.
 */

public class Program1 {
    int count=0;
    int[ ] arr;
    public Program1(int[] arr){
        this.arr=arr;

    }
    public void evenelments() {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
                System.out.println(arr[i]);
            }
        }System.out.println("The count of even elements = "+count);


    }
}