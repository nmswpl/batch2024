package in.co.nmsworks.week3.assessment.day4;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        ConvertBinaryToDecimal convertBinaryToDecimal = new ConvertBinaryToDecimal();
        //convertBinaryToDecimal.binaryToDecimal("11011");
        System.out.println(convertBinaryToDecimal.binaryToDecimal("11011"));

    }
    public int binaryToDecimal(String binary){
        double count = 0.0;

        int i;
        int mul = 0;
        for ( i = binary.length()-1; i >=0 ; i--) {
            int a = Integer.parseInt((String.valueOf(binary.charAt(i))));

            mul= (int) (mul+(a*(Math.pow(2.0,count))));
            count++;

        }
        return mul;
    }
    public int power(int a,int b){


            int result = 1;
            while (b != 0) {
                result = result * a;
                b--;
            }
            return result;

    }

}
