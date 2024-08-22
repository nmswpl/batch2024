package in.co.nmsworks.week3.assessment.day4;

public class Decimal {

    private String binaryString;
    private int decimal;

    public int binaryToDecimal(String binaryStr) {
        int decimal=1;
        for(int i=0;i<binaryStr.length(); i++){
            char ch = binaryStr.charAt(i);
            if(ch=='1'){
                decimal = Integer.parseInt(binaryStr,2);
            }
        }
        return decimal;
    }


    public static void main(String[] args) {
        Decimal d = new Decimal();
        System.out.println(d.binaryToDecimal("11011"));
    }


}
