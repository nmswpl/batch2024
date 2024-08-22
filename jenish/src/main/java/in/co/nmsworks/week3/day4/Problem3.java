package in.co.nmsworks.week3.day4;

public class Problem3 {
    public void sumOfDigits(int num) {
        String number = String.valueOf(num);
        sumOfDigits(number);
    }

    public void sumOfDigits(String number) {

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += digit;
        }
        System.out.println("Sum of Digits is " + sum);
    }
}