package in.co.nmsworks.week3.day4;

import java.util.HashMap;
import java.util.Map;

public class Question12 {
    public void printNumberValue(Integer number) {
        Map<Integer, String> nuberToWord1 = new HashMap<>();
        nuberToWord1.put(1, "one");
        nuberToWord1.put(2, "two");
        nuberToWord1.put(3, "three");
        nuberToWord1.put(4, "four");
        nuberToWord1.put(5, "five");
        nuberToWord1.put(6, "six");
        nuberToWord1.put(7, "seven");
        nuberToWord1.put(8, "eight");
        nuberToWord1.put(9, "nine");
        nuberToWord1.put(10, "ten");
        Map<Integer, String> nuberToWord2 = new HashMap<>();
        nuberToWord2.put(11, "eleven");
        nuberToWord2.put(12, "twelve");
        nuberToWord2.put(13, "thirteen");
        nuberToWord2.put(14, "fourteen");
        nuberToWord2.put(15, "fifeteen");
        nuberToWord2.put(16, "sixteen");
        nuberToWord2.put(17, "seventeen");
        nuberToWord2.put(18, "eighteen");
        nuberToWord2.put(19, "nineteen");
        nuberToWord2.put(0, " ");
        nuberToWord2.put(2, "twinty");
        nuberToWord2.put(3, "thiirty");
        nuberToWord2.put(4, "fourty");
        nuberToWord2.put(5, "fifty");
        nuberToWord2.put(6, "sixty");
        nuberToWord2.put(7, "seventy");
        nuberToWord2.put(8, "eighty");
        nuberToWord2.put(9, "ninety");
        Map<Integer, String> nuberToWord3 = new HashMap<>();
        nuberToWord3.put(1, "hundred");
        nuberToWord3.put(1000, "nineteen");
        if (number <= 10) {
            System.out.println(nuberToWord1.get(number));
        } else if (number < 20) {
            System.out.println(nuberToWord2.get(number));
        } else if (number <= 99) {
            String numberString = String.valueOf(number);
            Integer digit2 = Integer.parseInt(String.valueOf(numberString.charAt(0)));
            Integer digit1 = Integer.parseInt(String.valueOf(numberString.charAt(1)));
            if (digit1 != 0) {
                System.out.println(nuberToWord2.get(digit2) + "" + nuberToWord1.get(digit1));
            } else {
                System.out.println(nuberToWord2.get(digit2));
            }
        } else if (number <= 999) {
            String numberString = String.valueOf(number);
            Integer digit3 = Integer.parseInt(String.valueOf(numberString.charAt(0)));
            Integer digit2 = Integer.parseInt(String.valueOf(numberString.charAt(1)));
            Integer digit1 = Integer.parseInt(String.valueOf(numberString.charAt(2)));
            Integer twoDigit = Integer.parseInt(numberString.substring(1));
            System.out.println(twoDigit);
            if (digit1 == 0 && digit2 == 0) {
                System.out.println(nuberToWord2.get(digit3));
            }
            else if (digit2==1){
                System.out.println(nuberToWord1.get(digit3) + " hundred and " +  nuberToWord2.get(digit2));
            }else {
                System.out.println(nuberToWord1.get(digit3) + " hundred and " + nuberToWord2.get(digit2) + "" + nuberToWord1.get(digit1));
            }
        } else if (number == 1000) {
            System.out.println(nuberToWord3.get(number));
        }
    }

    public static void main(String[] args) {
        Question12 question12 = new Question12();
        question12.printNumberValue(977);
    }
}
