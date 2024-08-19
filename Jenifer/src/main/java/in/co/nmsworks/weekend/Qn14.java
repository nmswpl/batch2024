package in.co.nmsworks.weekend;
/* Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a} */

public class Qn14 {
    public void arrayReverse(){
        char[] array = {'a', 'b', 'c'};
        for (int i = array.length-1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
