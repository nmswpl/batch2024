package in.co.nmsworks.week3.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class NumberToWord {
    public static void main(String[] args) {

        NumberToWord numberToWord = new NumberToWord();

        System.out.println(numberToWord.convertNumber());
    }

    public String convertNumber() {
        Map<Integer, String> numberToWord = new HashMap<>();
        numberToWord.put(0, "zero");
        numberToWord.put(1, "one");
        numberToWord.put(2, "two");
        numberToWord.put(3, "three");
        numberToWord.put(4, "four");
        numberToWord.put(5, "five");
        numberToWord.put(6, "six");
        numberToWord.put(7, "seven");
        numberToWord.put(8, "eight");
        numberToWord.put(9, "nine");
        numberToWord.put(10, "ten");
        numberToWord.put(11, "eleven");
        numberToWord.put(12, "twelve");
        numberToWord.put(13, "thirteen");
        numberToWord.put(14, "fourteen");
        numberToWord.put(15, "fifteen");
        numberToWord.put(16, "sixteen");
        numberToWord.put(17, "seventeen");
        numberToWord.put(18, "eighteen");
        numberToWord.put(19, "nineteen");
        numberToWord.put(20, "twenty");
        numberToWord.put(30, "thirty");
        numberToWord.put(40, "fourty");
        numberToWord.put(50, "fifty");
        numberToWord.put(60, "sixty");
        numberToWord.put(70, "seventy");
        numberToWord.put(80, "eighty");
        numberToWord.put(90, "ninety");
        numberToWord.put(100, "hundred");
        numberToWord.put(1000, "One Thousand");


        int hundreadthValue = 0;
        int tenthValue = 0;

        String result = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int number = sc.nextInt();

        if (number == 1000) {
            result += numberToWord.get(1000);
        } else {

            if (number / 100 > 0) {
                hundreadthValue = number / 100;
                result += numberToWord.get(hundreadthValue) + numberToWord.get(100);
                number = number % 100;

                if(number >0){
                    result += " and " + " ";
                }

            }

            if (number / 10 >=1) {
                if(number >=11 && number <20){
                    result +=   numberToWord.get(number);
                    return  result;
                }else {
                    tenthValue = (number / 10) * 10;
                    result += numberToWord.get(tenthValue) + " ";
                    number = number %10;
                }
            }

            if(number >0) {
                number = number % 10;
                result += numberToWord.get(number);
            }
        }

        return result;
    }
}
