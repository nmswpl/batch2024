package in.co.nmsworks.weekend;
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
public class Question27 {
    public  void patterns() {

        int n=7;

        for ( int i = 1; i <=n; i++)
        {
            for( int j=i;j<=n;j++)
                System.out.print(i);
            System.out.println(" ");
        }
    }
}
