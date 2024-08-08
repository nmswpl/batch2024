package in.co.nmsworks.week1;

/**
 * Star Pattern 1 :
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 */

public class Question8 {
    public static void main(String[] args) {

        int n=7;

        for ( int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
