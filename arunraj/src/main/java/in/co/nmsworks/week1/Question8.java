package in.co.nmsworks.week1;

/*Star Pattern 1 :
*
**
***
****
*****
******
*******
 */

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
