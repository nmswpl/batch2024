package in.co.nmsworks.week3.day4;

public class Question1 {
    public int binaryToDecimal(String binaryNumber){
        int answer = 0;
        int power = 1;
        for (int i = binaryNumber.length() - 1; i >= 0  ; i--) {
            int i1 = Integer.parseInt(String.valueOf(binaryNumber.charAt(i)));
            int digit = i1 * power;
            answer += digit;
            power *= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        int result = q1.binaryToDecimal("11011");
        System.out.println("Decimal number is " +result);
    }
}