package in.co.nmsworks.week2;
/* Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}*/
public class Te14 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        String[] reversedArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        for (String str : reversedArr) {
            System.out.print(str + " ");
        }
    }

}

