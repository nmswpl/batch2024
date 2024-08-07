package in.co.nmsworks.week1;

/**Numeric Pattern 2:
        1111111
        222222
        33333
        4444
        555
        66
        7
**/
public class Question7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
