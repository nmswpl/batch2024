package in.co.nmsworks.week3.day4;

import java.util.HashMap;
import java.util.Map;

public class Problem11 {
    public Map<Integer, String> getNumberToWordMap() {
        Map<Integer,String> numberToWordMap = new HashMap<>();
        numberToWordMap.put(1,"One");
        numberToWordMap.put(2,"Two");
        numberToWordMap.put(3,"Three");
        numberToWordMap.put(4,"Four");
        numberToWordMap.put(5,"Five");
        numberToWordMap.put(6,"Six");
        numberToWordMap.put(7,"Seven");
        numberToWordMap.put(8,"Eight");
        numberToWordMap.put(9,"Nine");
        numberToWordMap.put(10,"Ten");
        numberToWordMap.put(11,"Eleven");
        numberToWordMap.put(12,"Twelve");
        numberToWordMap.put(13,"Thirteen");
        numberToWordMap.put(14,"Fourteen");
        numberToWordMap.put(15,"Fifteen");
        numberToWordMap.put(16,"Sixteen");
        numberToWordMap.put(17,"Seventeen");
        numberToWordMap.put(18,"Eighteen");
        numberToWordMap.put(19,"Nineteen");
        numberToWordMap.put(20,"Twenty");
        numberToWordMap.put(30,"Thirty");
        numberToWordMap.put(40,"Forty");
        numberToWordMap.put(50,"Fifty");
        numberToWordMap.put(60,"Sixty");
        numberToWordMap.put(70,"Seventy");
        numberToWordMap.put(80,"Eighty");
        numberToWordMap.put(90,"Ninety");
        numberToWordMap.put(100,"Hundred");
        numberToWordMap.put(200,"Two hundred");
        numberToWordMap.put(300,"Three hundred");
        numberToWordMap.put(400,"Four hundred");
        numberToWordMap.put(500,"Five hundred");
        numberToWordMap.put(600,"Six hundred");
        numberToWordMap.put(700,"Seven hundred");
        numberToWordMap.put(800,"Eight hundred");
        numberToWordMap.put(900,"Nine hundred");
        numberToWordMap.put(1000,"Thousand");
        return numberToWordMap;
    }
    public void findNumberNames(int num){
        Map<Integer, String> numberToWordMap = getNumberToWordMap();

        if(numberToWordMap.containsKey(num)){
            System.out.println(numberToWordMap.get(num));
        }
        else if(String.valueOf(num).length() == 3){
            int lastDigit = num % 10;
            num = num / 10;
            int secondDigit = (num % 10) * 10;
            num = num / 10;
            int firstDigit = (num % 10) * 100;

            String result = "";
            if(numberToWordMap.containsKey(firstDigit)){
                result += numberToWordMap.get(firstDigit)+" "+"and ";

                int key = secondDigit + lastDigit;
                if(numberToWordMap.containsKey(key)){
                    result += numberToWordMap.get(key);
                }
                else if(numberToWordMap.containsKey(secondDigit)){
                    result += numberToWordMap.get(secondDigit)+" ";

                    if(numberToWordMap.containsKey(lastDigit)) {
                        result += numberToWordMap.get(lastDigit);
                    }
                }
            }
            System.out.println(result);
        }
        else if(String.valueOf(num).length() == 2){
            int lastDigit = num % 10;
            num = num / 10;
            int firstDigit = num % 10 * 10;

            String result = "";
            if(numberToWordMap.containsKey(firstDigit)) {
                result += numberToWordMap.get(firstDigit)+" ";
                if (numberToWordMap.containsKey(lastDigit)) {
                    result += numberToWordMap.get(lastDigit);
                }
            }
            System.out.println(result);
        }
    }
}