package in.co.nmsworks.week1;

import java.util.Arrays;

public class StringHyphen {
    public static void main(String[] args) {
        String s2 = new String("NMS");
        String s="NMS";
        String s1="NMS";
        if(s1==s2){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        String str="Arun-raj";
        String[]  n=str.split("-");
       // System.out.println(Arrays.toString(n));
        for(String str1:n){
            System.out.println(str1);
        }
    }
}
