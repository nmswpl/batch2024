package in.co.nmsworks.week2;

/*Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.*/

public class Te12 {
    public void oddNumbers(){
        int[] arr={54,87,90,34,13,67};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
