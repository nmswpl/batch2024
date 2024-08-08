package in.co.nmsworks.week1;

/*Alphabet Pattern 1 :
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG

 */

public class Question9 {
    public static void main(String[] args) {
        int m=65;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)m);
            }
            m++;
            System.out.println();
        }
    }
}
