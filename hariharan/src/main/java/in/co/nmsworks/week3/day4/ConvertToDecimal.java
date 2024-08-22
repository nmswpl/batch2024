package in.co.nmsworks.week3.day4;

import java.util.Scanner;

public class ConvertToDecimal {
    public static void main(String[] args) {

        ConvertToDecimal convertToDecimal = new ConvertToDecimal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary Value: ");
        String binary = sc.nextLine();
        System.out.println("\n"+"Decimal Value: "+convertToDecimal.binaryToDeciaml(binary));

    }

    public int binaryToDeciaml(String binary){
        int decimalValue = 0;
        int power = 1;
        for(int i = binary.length(); i>0;i--){
            if(Integer.parseInt(String.valueOf(binary.charAt(i-1))) == 1){
                decimalValue += power * 1;
            }
                power  = power * 2;
        }
        return decimalValue;
    }
}
