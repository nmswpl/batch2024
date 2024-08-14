package in.co.nmsworks.week2;
/*
4. Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1
*/

public class Te4 {
    public void getPosition(int[] arr, int search) {
        int position=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                position = i;
            }
        }
        System.out.println("The position of  "+search+ " is "+position);
    }
}