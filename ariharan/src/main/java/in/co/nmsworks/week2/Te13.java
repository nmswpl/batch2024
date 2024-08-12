package in.co.nmsworks.week2;
//Given an array of integers, Write a Program to find the sum of the elements of the
//array.
//For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6

public class Te13 {
    public void sumOfArr(int arr[]){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
        System.out.println("the sum of the array is "+sum);
    }
}
