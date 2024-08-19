package in.co.nmsworks.weekend;
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
public class Question28 {
    public  void starPattern() {

        int n=7;

        for ( int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
