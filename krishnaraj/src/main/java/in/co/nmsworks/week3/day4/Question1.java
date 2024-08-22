package in.co.nmsworks.week3.day4;

public class Question1 {
    public int bineryToDecimal(String bineryValue) {
        int countPower = 0;
        double bineryTodecimalVal = 0;
        for (int i = bineryValue.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(String.valueOf((bineryValue.charAt(i))));
            double decimalValues = number * Math.pow(2, countPower);
            bineryTodecimalVal += decimalValues;
            countPower++;
        }
        return (int) bineryTodecimalVal;
    }

    public int bineryToDecimalWithoutPow(String bineryValue) {
        int pow = 1;
        int bineryTodecimalVal = 0;
        for (int i = bineryValue.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(String.valueOf((bineryValue.charAt(i)))) * pow;
            bineryTodecimalVal += number;
            pow *= 2;
        }
        return bineryTodecimalVal;
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        System.out.println(question1.bineryToDecimal("11011"));
        System.out.println(question1.bineryToDecimalWithoutPow("11011"));
    }
}
