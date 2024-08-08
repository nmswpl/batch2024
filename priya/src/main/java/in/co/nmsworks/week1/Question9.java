package in.co.nmsworks.week1;

/**Alphabet Pattern 1 :
 A
 BB
 CCC
 DDDD
 EEEEE
 FFFFFF
 GGGGGGG
 **/

public class Question9 {

    public static void main(String[] args) {

        for (int i = 65; i <= 71; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
