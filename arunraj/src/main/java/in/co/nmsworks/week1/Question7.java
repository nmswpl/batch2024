package in.co.nmsworks.week1;

import java.util.Scanner;

/*Numeric Pattern 2:
1111111
222222
33333
4444
555
66
7*/
public class Question7 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
