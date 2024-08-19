package in.co.nmsworks.weekend;
/*
Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}

 */

public class Q9 {
    String[] arr = {"a", "b", "c"};
    String[] reversedarr=new String[arr.length];

    public void reversearr() {
        for (int i = 0; i < arr.length;i++){
            reversedarr[i]=arr[arr.length-i-1];
        }
        for (String rev : reversedarr) {
            System.out.print(rev+" ");
        }

    }
}
