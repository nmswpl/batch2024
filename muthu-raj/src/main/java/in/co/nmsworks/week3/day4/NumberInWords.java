package in.co.nmsworks.week3.day4;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.HashMap;
import java.util.Map;

public class NumberInWords {

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {

            getNumberInWords(i);
        }
    }

    private static void getNumberInWords(int n) {

        Map<Integer, String> ones = new HashMap<>();
        ones.put(1, "One");
        ones.put(2, "Two");
        ones.put(3, "Three");
        ones.put(4, "Four");
        ones.put(5, "Five");
        ones.put(6, "six");
        ones.put(7, "Seven");
        ones.put(8, "Eight");
        ones.put(9, "Nine");
        ones.put(10, "Ten");

        Map<Integer, String> teens = new HashMap<>();
        teens.put(11, "Eleven");
        teens.put(12, "Twelve");
        teens.put(13, "Thirteen");
        teens.put(14, "Fourteen");
        teens.put(15, "Fifteen");
        teens.put(16, "Sixteen");
        teens.put(17, "Seventeen");
        teens.put(18, "Eighteen");
        teens.put(19, "Nineteen");

        Map<Integer, String> tees = new HashMap<>();
        tees.put(2, "Twenty");
        tees.put(3, "Thirty");
        tees.put(4, "Forty");
        tees.put(5, "Fifty");
        tees.put(6, "Sixty");
        tees.put(7, "Seventy");
        tees.put(8, "Eighty");
        tees.put(9, "Ninety");

//  for zero
        if ( n == 0)
        {
            System.out.println("Zero");
        }
//  for less than 10
        else if (n <= 10)
        {
            System.out.println(ones.get(n));
        }

//  for 11 to 19
        else if (n > 10 && n < 20) {
            System.out.println(teens.get(n));
        }

//  for below 100
        else if (n >= 20 && n < 100)
        {
            String val = String.valueOf(n);
            Integer twoDigits = Integer.valueOf(String.valueOf(val.charAt(0)));
            if ( n % 10 == 0)
            {
                System.out.print(tees.get(twoDigits));
            }
            else
            {
                System.out.print(tees.get(twoDigits) + " ");
                System.out.print(ones.get(Integer.valueOf(String.valueOf(val.charAt(1)))));
            }
            System.out.println();
        }

//  for Hundreds
        else if (n % 100 == 0 && n < 1000)
        {
            String val = String.valueOf(n);
            System.out.print(ones.get(Integer.valueOf(String.valueOf(val.charAt(0)))));
            System.out.println(" Hundred");
        }

//  greater than 100
        else if (n > 100 && n < 1000)
        {
            String val = String.valueOf(n);
            System.out.print(ones.get(Integer.valueOf(String.valueOf(val.charAt(0)))));
            System.out.print(" Hundred and ");
            int remDigit = Integer.parseInt(val.substring(1));

            if(remDigit <= 10){
                System.out.println(ones.get(remDigit));

            }
            else if(remDigit > 10 && remDigit < 20)
            {
                System.out.print(teens.get(remDigit));
            }
            else
            {
                Integer lastDigit = Integer.valueOf(String.valueOf(val.charAt(1)));
                if ( remDigit % 10 == 0){
                    System.out.print(tees.get(lastDigit) + " ");
                }
                else {
                System.out.print(tees.get(lastDigit) + " ");
                System.out.print(ones.get(Integer.valueOf(String.valueOf(val.charAt(2)))));
                }
            }

            System.out.println();
        }
        else if (n == 1000)
        {
            System.out.println("One Thousand");
        }
        else
        {
            System.out.println("Not defined yet");
        }

    }
}
