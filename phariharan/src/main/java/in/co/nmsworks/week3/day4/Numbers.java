package in.co.nmsworks.week3.day4;

import java.util.HashMap;
import java.util.Map;

public class Numbers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.integerToString(979);
    }

    private void integerToString(int inputNumber) {
        Map<Integer, String> numbersToStringMap = new HashMap<>();
        numbersToStringMap.put(1, "one");
        numbersToStringMap.put(2, "two");
        numbersToStringMap.put(3, "three");
        numbersToStringMap.put(4, "four");
        numbersToStringMap.put(5, "five");
        numbersToStringMap.put(6, "six");
        numbersToStringMap.put(7, "seven");
        numbersToStringMap.put(8, "eight");
        numbersToStringMap.put(9, "nine");
        numbersToStringMap.put(10, "ten");
        numbersToStringMap.put(11, "eleven");
        numbersToStringMap.put(12, "twelve");
        numbersToStringMap.put(13, "thirteen");
        numbersToStringMap.put(14, "fourteen");
        numbersToStringMap.put(15, "fifteen");
        numbersToStringMap.put(16, "sixteen");
        numbersToStringMap.put(17, "seventeen");
        numbersToStringMap.put(18, "eighteen");
        numbersToStringMap.put(19, "nineteen");
        numbersToStringMap.put(20, "twenty");
        numbersToStringMap.put(30, "thirty");
        numbersToStringMap.put(40, "forty");
        numbersToStringMap.put(50, "fifty");
        numbersToStringMap.put(60, "sixty");
        numbersToStringMap.put(70, "seventy");
        numbersToStringMap.put(80, "eighty");
        numbersToStringMap.put(90, "ninety");
        numbersToStringMap.put(0, "zero");

        System.out.println("--------------><------------");

        int value = 0;
        System.out.print("For given integer " + inputNumber + " in words is -------> ");
        while (inputNumber != 0) {
            if (inputNumber <= 20) {
                System.out.println(numbersToStringMap.get(inputNumber));
                System.out.println("--------------><------------");
                return;
            } else if (inputNumber < 100) {
                value = inputNumber / 10;
                value *= 10;
                System.out.print(numbersToStringMap.get(value) + " ");
                inputNumber = inputNumber - value;
            } else if (inputNumber < 1000) {
                value = inputNumber / 100;
                if (inputNumber % 100 != 0) {
                    System.out.print(numbersToStringMap.get(value) + " hundred and ");
                } else {
                    System.out.println(numbersToStringMap.get(value) + " hundred");
                    System.out.println("--------------><------------");
                    return;
                }
                value *= 100;
                inputNumber = inputNumber - value;
            } else {
                System.out.println("Thousand ");
                return;
            }
        }
    }
}
