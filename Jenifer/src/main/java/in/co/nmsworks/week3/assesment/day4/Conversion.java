package in.co.nmsworks.week3.assesment.day4;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Conversion {

    public int power(int base, int power){
        int powerResult = 1;
        for (int i = 1; i <= power; i++) {
            powerResult *= base;
        }
        return powerResult;
    }
    public int convertBinaryToDecimal(String string){
        int result = 0;
        String str = "";
        char ch = ' ';
        int sum = 0;
        int pow = 0;
        for (int i = string.length()-1 ; i >= 0; i--) {
            str = String.valueOf(string.charAt(i));
            //result = (int) (parseInt(str) * pow(2 , pow));
            //result = (int)ch * power(2 , pow);
            result = parseInt(str) * power(2 , pow);
            pow++;
            sum += result;
        }
        return sum;
    }

    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println("Decimal value : " +conversion.convertBinaryToDecimal("1111"));
    }
}
