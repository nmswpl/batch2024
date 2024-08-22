package in.co.nmsworks.week3.day4;

public class BinaryToDecimal {
    public void convertBinaryToDecimal(String s) {
        int a = 0, temp;
        int b = Integer.parseInt(s);
        for (int n = 0; b != 0; n++) {
            temp = b % 10;
            a += temp * Math.pow(2, n);
            b = b / 10;
        }
        System.out.println(a);
    }


    public static void main(String[] args) {

        BinaryToDecimal p1 = new BinaryToDecimal();
        p1.convertBinaryToDecimal("1101");
    }
}



