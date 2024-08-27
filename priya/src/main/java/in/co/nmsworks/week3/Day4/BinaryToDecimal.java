package in.co.nmsworks.week3.Day4;

public class BinaryToDecimal {
    int pow(int base,int power){
        int result = 1;
        for (int i = 1; i <=power; i++) {
            result *= base;
        }
        return result;
    }
    public int binaryToDecimalConverter(String s) {
        int i =0;
        int decimalValue = 0;
        int intValue = Integer.parseInt(s);
        while(intValue!=0){
            int n = intValue%10;
            decimalValue+= n*pow(2,i++);
            intValue/=10;
        }
        return decimalValue;

    }

        public static void main (String[]args){
            BinaryToDecimal b = new BinaryToDecimal();
           int decimalValue = b.binaryToDecimalConverter("110110");
           System.out.println("Decimal value :"+decimalValue);
           int ch = '1'-'0';
            System.out.println(ch);
        }


    }

