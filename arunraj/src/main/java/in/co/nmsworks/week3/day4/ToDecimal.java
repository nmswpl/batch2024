package in.co.nmsworks.week3.day4;

public class ToDecimal {
    public static void main(String[] args) {
        ToDecimal td = new ToDecimal();
        Long result = td.binaryToDecimal("11011");
        System.out.println("The decimal value is "+result);
    }

    public int power(int base, int expo){
        int pow=1;
        for(int i=1;i<=expo;i++){
           pow *= base;
        }
        return pow;
    }

    public Long binaryToDecimal(String num){
        long binary;
        long decToBin = 0L;
        long j=0;
        for(int i=num.length()-1;i>=0;i--,j++){
            binary = Long.parseLong(String.valueOf(num.charAt(i)));
            decToBin += (long) (binary * (Math.pow(2L,j)));
            System.out.println(decToBin);
        }
        return decToBin;
    }
}
