package in.co.nmsworks.week3.day4;

public class Q1 {

    public int binaryToDecimal(String str){
        int result = 0;
        for (int i = str.length()-1; i >=0; i--) {
            char[] numbers = str.toCharArray();
            //int power = (int) Math.pow(2, (numbers.length - i - 1));
            if(numbers[i]=='1') {
                int power = 2 * (numbers.length-1)- i;
                result =  result + power;
            }
        }
        System.out.println("The decimal of the "+str+ " is "  +result);
        return result;
    }

    public static void main(String[] args) {
        Q1 decimal = new Q1();
        decimal.binaryToDecimal("1010");

    }

}
