package in.co.nmsworks.week2;

/*Given an array of integers and int x, Write a Program to print no of occurance of x in
the array
For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
times in array*/

public class Te18 {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 2, 3};
            int x = 2;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    count++;
                }
            }
            System.out.println("Number of occurrences of " + x + ": " + count);
    }
}