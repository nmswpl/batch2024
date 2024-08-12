package in.co.nmsworks.week2;

/*Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}*/

public class Te14 {
    public void reverseStringArray(){
        char[] str={'a','b','c','d'};
        for(int i = str.length-1;i>=0; i--){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
}
