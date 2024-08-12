package in.co.nmsworks.week2;
//Given an array of integer, Write a Program to find the largest element in the given
//array.
//For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20
public class Te17 {
    public void larElemOfArr(int arr[]){
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("the largest element in th array is "+max);
    }
}
