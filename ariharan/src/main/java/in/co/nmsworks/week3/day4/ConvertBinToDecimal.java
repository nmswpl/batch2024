package in.co.nmsworks.week3.day4;

public class ConvertBinToDecimal {
    public int binaryToDecimal(String value){
        int sum = 0,pow=1;
        for (int i = value.length()-1; i >=0 ; i--) {
            int val = Integer.parseInt(String.valueOf(value.charAt(i)));
            sum += (val*pow);
            pow*=2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println( new ConvertBinToDecimal().binaryToDecimal("11100"));
//        System.out.println( new ConvertBinToDecimal().decToBin());
//        new ConvertBinToDecimal().binToDec();
    }
//    public int decToBin(){
//        long val = 111011;
//        int sum = 0,k = 0;
//        while(val>0){
//            int rem = (int) (val%10);
//            sum += rem*(Math.pow(2,k));
//            val /= 10;
//            k++;
//        }
//        return sum;
//    }
//    public void binToDec(){
//        int dec=28;
//        long k=0;
//        String bin="";
//        while (dec>0){
//            int rem = dec%2;
//            bin=String.valueOf(rem).concat(bin);
//            dec /=2;
//            k++;
//        }
//        System.out.println(bin);
//    }


}
