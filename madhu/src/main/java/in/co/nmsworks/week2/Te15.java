package in.co.nmsworks.week2;
/* Given an array of integers, Write a Program to count and print even elements.
For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
Reason : 2 4 & 6 are even*/
public class Te15 {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 5, 6, 3, 2};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}
