package in.co.nmsworks.week1;

/*4. Given a number as String, write a program that removes the leading 0
Input :	0005640
output:	56480*/

import java.util.Scanner;

public class Training4 {
    String str=new String("0005640");
    public void removeLeadingZeroes(){
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c =='0' ){
                str.replace("0","");
            }
        }
        System.out.println(str);
    }
}
