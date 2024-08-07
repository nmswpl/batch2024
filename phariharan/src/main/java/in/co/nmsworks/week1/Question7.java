package in.co.nmsworks.week1;

/**
 * Numeric Pattern 2:
 * 1 1 1 1 1 1 1
 * 2 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4
 * 5 5 5
 * 6 6
 * 7
 */

public class Question7 {
    public static void main(String[] args) {
        int  j,k = 6;
        for (int i = 1; i < 8 ; i++) {
            j=k;
            k = k-1;
            while (j >= 0) {
                System.out.print(" "+i+" ");
                j--;
            }
            System.out.println();;
        }
    }
}
