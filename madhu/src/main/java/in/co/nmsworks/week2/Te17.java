package in.co.nmsworks.week2;
/*Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20 */
public class Te17 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            System.out.println(largest);


        }


    }
}