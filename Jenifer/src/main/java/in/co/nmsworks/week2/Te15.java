package in.co.nmsworks.week2;
/* Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120 */

public class Te15 {
    public void evenEle(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
            System.out.println("");
        }
        System.out.println("Count of even elements: " + count);
    }
}
