package in.co.nmsworks.week2;

/*Given an array of integers, Write a Program to find the sum of the elements of the
array.
For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6*/

public class Te13 {
    public void sumOfArray(){
        int[] arr={3,5,1,8,9};
        int n=0;
        for (int i=0;i<arr.length;i++){
            n=arr[i]+n;
        }
        System.out.println("The sum of the Array : "+n);
    }
}
