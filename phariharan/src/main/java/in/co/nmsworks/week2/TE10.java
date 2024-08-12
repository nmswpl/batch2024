package in.co.nmsworks.week2;

/**
 * Write a program to print all numbers between 200 and 500 ending with 7.
 */

public class TE10 {
    public void endWith7(int start , int end){
        for (int j = 0; j < 10 ; j++) {
               if ((start+j)%10 == 0){
                    start = start+7 ;
                    j= 10;
                }
            }

        for (int i = start; i < end ; i = i+10) {
            System.out.println(i);
        }
    }
}
