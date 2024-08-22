package in.co.nmsworks.week3.assignment.Day4;
import java.lang.Math;
public class Program1 {
    public static void main(String[] args) {
        Program1 pg1 = new Program1();
        pg1.binaryToDecimal("11011");


    }

    public int binaryToDecimal(String binaryValue) {
        int decimal = 0;
        for (int i = binaryValue.length() - 1; i >= 0; i--) {
            char[] num = binaryValue.toCharArray();
            if (num[i] == '1') {
                decimal = (int) (decimal + Math.pow(2, (num.length - i - 1)));
            }
        }
        System.out.println("the decimal value is: " + decimal);
        return decimal;
    }
}
