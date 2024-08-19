package in.co.nmsworks.weekend;
/*
Write a program to print the square of every element present in the array.
E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25
8
 */

public class Q16 {
    public void squarenum()
    {
        int arr[]={2,4,3,5};
        for(int i = 0;i <arr.length;i++)
        {
            System.out.print(arr[i]*arr[i]+" ");
        }
    }
}
