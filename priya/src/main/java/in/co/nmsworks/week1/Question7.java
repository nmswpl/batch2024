package in.co.nmsworks.week1;

/** Numeric pattern 2*/

public class Question7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
