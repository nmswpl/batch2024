package in.co.nmsworks.week1;

/**
 * Alphabet Pattern 1 :
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * F F F F F F
 * G G G G G G G
 */
public class Question9 {
    public static void main(String[] args) {
        int k = 65;
        for (int i = 1; i < 8 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)k+" ");
            }
            System.out.println();
            k++;
        }
    }
}
