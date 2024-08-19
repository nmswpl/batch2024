package in.co.nmsworks.weekend;
/**
 Numeric Pattern 1 :
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6
 1 2 3 4 5 6 7

 **/
public class Question26 {
    public  void pattern() {

        int n=7;

        for ( int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
