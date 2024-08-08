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

        int n=7;

        for ( int i = 1; i <=n; i++)
        {
            for( int j=i;j<=n;j++)
                System.out.print(i);
            System.out.println(" ");
        }
    }
}

