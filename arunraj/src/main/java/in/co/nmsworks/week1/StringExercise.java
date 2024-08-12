package in.co.nmsworks.week1;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args) {
        String str=new String("Football");
        System.out.println(str.length()); //Prints length of the String in variable
        System.out.println(str.charAt(1)); //Prints character in the String at index we given
        System.out.println(str.contains("F"));//prints whether the given char present in variable
        System.out.println(Arrays.deepToString(str.split("t")));
    }
}
