package in.co.nmsworks.week2;
//Given an array of integers, Write a Program to count and print even elements.
//For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
//Reason : 2 4 & 6 are even


public class Te15 {
    public void numOfEven(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }

        }
        System.out.println("the number of even in the array is "+count);
    }
}
