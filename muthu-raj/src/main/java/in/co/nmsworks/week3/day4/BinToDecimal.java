package in.co.nmsworks.week3.day4;


import java.util.Collections;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class BinToDecimal {
    public static void main(String[] args) {
        String num = "11000";
//        System.out.println("The Decimal value of " + num + " is " + binToDecimal(num));
//        decimalToBin(10);


    }

    private static int powerOf(int a, int b){
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }

    private static String decimalToBin(int num) {
        String binary = "";
        while(num != 0)
        {
            binary += String.valueOf(num % 2);
            num = num / 2;
        }

        return reverse(binary);
    }

    private static String reverse(String str){
        int len = str.length()-1;
        String revString = "";
        for (int i = 0; i <= len; i++) {
            revString += String.valueOf(str.charAt(len - i));
        }
        return revString;
    }

//    private static String reverseInRecursion(String str, int len) {
//        if (len < 1) {
//            return "";
//        }
//
//        reverseInRecursion(str.substring(1, len) + str.charAt(0), len - 1);
//        return str;
//    }


    private static int binToDecimal(String num) {

        int decimal = 0;
        int len = num.length() - 1;
        int val = 0;
        for (int i = 0; i <= len; i++) {
            val = num.charAt(len - i) - '0';
            decimal +=  ((val) * powerOf(2, i));
        }
        return decimal;
    }


}
