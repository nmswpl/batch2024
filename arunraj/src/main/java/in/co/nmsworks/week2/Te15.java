package in.co.nmsworks.week2;

/*Given an array of integers, Write a Program to count and print even elements.
For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
Reason : 2 4 & 6 are even*/

public class Te15 {
    public void printCountEven(){
        int[] arr={2,4,6,8,10,3,5,7,1,8};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("The number of even numbers : "+count);
    }
}
