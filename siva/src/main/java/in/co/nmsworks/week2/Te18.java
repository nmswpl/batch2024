package in.co.nmsworks.week2;
import java.util.Scanner;

public class Te18 {
    public void numOfOccurence(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for number of occurence:");
        int n=sc.nextInt();
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==n){
                count++;
            }

        }
        System.out.println("the number of occurence of given number in the array is "+ count);
    }
}
