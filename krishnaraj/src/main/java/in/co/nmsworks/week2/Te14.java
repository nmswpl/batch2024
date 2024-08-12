package in.co.nmsworks.week2;

/***
 * Given an array of String, Write a Program to reverse the array and print.
 * For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}
 */
public class Te14 {
 public void reverseArray(){
     String arr[]={"a","b","c"};
     System.out.println("Reversing an array : ");
     for (int i = arr.length-1; i >=0 ; i--) {
         System.out.print(arr[i] +" ");
     }
 }
}
