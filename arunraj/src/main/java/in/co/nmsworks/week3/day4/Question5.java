package in.co.nmsworks.week3.day4;

/*Write a program to find the second
largest number in an array.
 */

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        Question5 q5 = new Question5();
        q5.findSecLarNum(new int[]{2,5,6,7,1,3,8,9});
    }

    public void findSecLarNum(int[] a){
        for (int i = 0; i < a.length-1;i++) {
            for (int j = 0; j < a.length-i-1;j++) {
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The Second Largest number is "+ a[1]);
    }
}

