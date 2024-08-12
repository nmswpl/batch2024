package in.co.nmsworks.week2;

/*Given an array of integers and int x, Write a Program to print no of occurance of x in
the array
For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
times in array*/

public class Te18 {
    public void noOfOccurance(int n){
        int[] arr={1,2,8,3,4,2,3,1,6,8,7,8};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
        }
        System.out.println("Number : "+n+" Occurrence : "+count);
    }
}
